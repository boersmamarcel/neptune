package neptune;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class SymbolTable {
	
	protected int currentLevel = -1;
	protected Map<String, Stack<IdEntry>> symtab;
	protected Stack<List<String>> scopeStack;
	
	protected int largestSize = 0;
	protected int currentSize = 0;
	
    /**
     * Constructor.
     * @ensures  this.currentLevel() == -1
     */
    public SymbolTable() {
    	this.symtab = new HashMap<String, Stack<IdEntry>>();
    	this.scopeStack = new Stack<List<String>>();
    }

    /**
     * Opens a new scope.
     * @ensures this.currentLevel() == old.currentLevel()+1;
     */
    public void openScope()  {
    	this.currentLevel++;
    	List<String> newList = new ArrayList<String>();
    	this.scopeStack.push(newList);
    }

    /**
     * Closes the current scope. All identifiers in
     * the current scope will be removed from the SymbolTable.
     * @requires old.currentLevel() > -1;
     * @ensures  this.currentLevel() == old.currentLevel()-1;
     */
    public void closeScope() {
    	
    	largestSize = largestSize < currentSize ? currentSize : largestSize;
    	
    	List<String> scopeList = this.scopeStack.pop();
    	
    	for(String identifier : scopeList) {
    		IdEntry poppedElement = this.symtab.get(identifier).pop();
    		currentSize -= poppedElement.getSize();
    	}
    	
    	this.currentLevel--;
    	
    }

    /** Returns the current scope level. */
    public int currentLevel() {
        return this.currentLevel;
    }

    /**
     * Enters an id together with an entry into this SymbolTable
     * using the current scope level. The entry's level is set to
     * currentLevel().
     * @requires id != null && id.length() > 0 && entry != null;
     * @ensures  this.retrieve(id).getLevel() == currentLevel();
     * @throws SymbolTableException when there is no valid
     *    current scope level, or when the id is already declared
     *    on the current level.
     */
    public void enter(String id, IdEntry entry) throws SymbolTableException {
    	IdEntry currentEntry = this.retrieve(id);
    	if(currentEntry != null && currentEntry.getLevel() == this.currentLevel()) {
    		throw new SymbolTableException("Failure. ID '" + id + "' already exists within scope.");
//    		System.err.println("WARNING: ID '" + id + "' already exists within scope.");
    	}
    		
    	if(this.currentLevel() < 0) {
    		throw new SymbolTableException("Invalid current level " + this.currentLevel);
    	}
    	
    	entry.setLevel(this.currentLevel());
    	entry.setAddress(currentSize);
    	
    	if(this.symtab.get(id) == null) {
    		this.symtab.put(id, new Stack<IdEntry>());
    	}
    	
    	this.scopeStack.peek().add(id);
    	this.symtab.get(id).push(entry);
    	
    	currentSize += entry.getSize();
    }

    /**
     * Get the Entry corresponding with id whose level is
     * the highest; in other words, that is defined last.
     * @return  Entry of this id on the highest level
     *          null if this SymbolTable does not contain id
     */
    public IdEntry retrieve(String id) {
    	if(this.symtab.get(id) != null) {
            try{
                return this.symtab.get(id).peek();      
            }catch(EmptyStackException e){
            	return null;
            }
    	}else{
    		return null;
    	}
    }
    
    public int getLargestSize() {
    	return largestSize;
    }
}

/** Exception class to signal problems with the SymbolTable */
class SymbolTableException extends Exception {
    /** {@link serialVersionUID} is required for Serializable */
    public static final long serialVersionUID = 24362462L;
    public SymbolTableException(String msg) { super(msg); }
}
