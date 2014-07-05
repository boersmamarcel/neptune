package neptune;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import neptune.assembly.Program;

public class SymbolTable {
	
	protected int currentLevel = -1;
	protected Map<String, Stack<IdEntry>> symtab;
	protected Stack<List<String>> scopeStack;
	
	protected int largestSize = 0;
	protected int currentSize = 0;
	protected int functionSize = 0;
	
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

    public void openFunctionScope(String funcName) {
    	Program.isFunctionCall = true;
    	Program.definingFunction = funcName;
    	functionSize = 0;
    }
    
    public void closeFunctionScope() {
    	Program.isFunctionCall = false;
    	retrieve("_" + Program.definingFunction).functionSize = functionSize;
    }
    
    public int getFunctionSize() {
    	return functionSize;
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
    		if(identifier.charAt(0) == '_') {
    			continue;
    		}
    		
    		IdEntry poppedElement = this.symtab.get(identifier).pop();
    		
    		if(!Program.isFunctionCall) {
    			currentSize -= poppedElement.getSize();
    		}
    		
//    		System.out.println("<===>    " + identifier);
    	}
    	
//    	System.out.println("<<<<<    " + currentSize);
//    	System.out.println("<<<      " + this.currentLevel());
//    	
//    	if(this.currentLevel == 0) {
//    		System.out.println(this.symtab);
//    	}
    	
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
    		if(id.charAt(0) != '_') {
    			throw new SymbolTableException("Failure. ID '" + id + "' already exists within scope.");
    		}else{
    			return;
    		}
    	}
    		
    	if(this.currentLevel() < 0) {
    		throw new SymbolTableException("Invalid current level " + this.currentLevel);
    	}
    	
    	entry.setLevel(this.currentLevel());
    	if(Program.isFunctionCall) {
    		entry.setAddress(3+functionSize);	
    	}else{
    		entry.setAddress(currentSize);
    	}
    	
    	if(this.symtab.get(id) == null) {
    		this.symtab.put(id, new Stack<IdEntry>());
    	}
    	
    	this.scopeStack.peek().add(id);
    	this.symtab.get(id).push(entry);
    	
    	
    	if(Program.isFunctionCall) {
    		functionSize += entry.getSize();
    	}else{
    		if(id.charAt(0) != '_') {
    			currentSize += entry.getSize();
    		}
    	}
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
    
    public int getSize() {
    	return currentSize;
    }
}

/** Exception class to signal problems with the SymbolTable */
class SymbolTableException extends Exception {
    /** {@link serialVersionUID} is required for Serializable */
    public static final long serialVersionUID = 24362462L;
    public SymbolTableException(String msg) { super(msg); }
}
