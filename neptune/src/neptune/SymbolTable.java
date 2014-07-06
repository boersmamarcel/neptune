package neptune;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import neptune.assembly.Program;

/**
 * Class used to organize symbols such as variables.
 * 
 * @author Koen van Urk and Marcel Boersma
 */
public class SymbolTable {
	
	/**
	 * The current scope level.
	 */
	protected int currentLevel = -1;
	
	/**
	 * Key value storage used to store symbol table entries. 
	 */
	protected Map<String, Stack<IdEntry>> symtab;
	
	/**
	 * Helper stack to speed up scope closing. 
	 */
	protected Stack<List<String>> scopeStack;
	
	/**
	 * Largest size of the stack. Used to determine required variable
	 * storage size.
	 */
	protected int largestSize = 0;
	
	/**
	 * Current combined size of the entries stored in the symbol table.  
	 */
	protected int currentSize = 0;
	
	/**
	 * When declaring a function, this variable stores the size of the elements
	 * usde in that function. 
	 */
	protected int functionSize = 0;
	
    /**
     * Constructor for the symbol table.
     * 
     * Creates an empty table and scope stack.
     */
    public SymbolTable() {
    	this.symtab = new HashMap<String, Stack<IdEntry>>();
    	this.scopeStack = new Stack<List<String>>();
    }

    /**
     * Opens a new scope.
     */
    public void openScope()  {
    	this.currentLevel++;
    	List<String> newList = new ArrayList<String>();
    	this.scopeStack.push(newList);
    }

    /**
     * Opens a new scope for declaring a function. Sets
     * necessary attributes of Program to their correct values.
     * 
     * @param funcName Name of the declared function
     */
    public void openFunctionScope(String funcName) {
    	Program.isFunctionCall = true;
    	Program.definingFunction = funcName;
    	functionSize = 0;
    }
    
    /**
     * Closes a scope for functions. Resets
     * attributes of Program to their correct values.
     * 
     * Also updates the function entry in the symbol table to have the correct size.
     */
    public void closeFunctionScope() {
    	Program.isFunctionCall = false;
    	retrieve("_" + Program.definingFunction).functionSize = functionSize;
    }
    
    /**
     * Getter for the current function size.
     * 
     * @return The current function size
     */
    public int getFunctionSize() {
    	return functionSize;
    }
    
    /**
     * Closes the current scope. All identifiers in
     * the current scope will be removed from the SymbolTable.
     */
    public void closeScope() {
    	
    	largestSize = largestSize < currentSize ? currentSize : largestSize;
    	
    	List<String> scopeList = this.scopeStack.pop();
    	
    	for(String identifier : scopeList) {
    		
    		// Skip when handling function entries
    		if(identifier.charAt(0) == '_') {
    			continue;
    		}
    		
    		IdEntry poppedElement = this.symtab.get(identifier).pop();
    		
    		// only update currentSize when not defining functions.
    		if(!Program.isFunctionCall) {
    			currentSize -= poppedElement.getSize();
    		}
    	}
    	
    	this.currentLevel--;
    	
    }

    /**
     * Returns the current scope level.
     * 
     * @return Current scope level.
     */
    public int currentLevel() {
        return this.currentLevel;
    }

    /**
     * Enters an id together with an entry into this SymbolTable
     * using the current scope level. The entry's level is set to
     * currentLevel().
     * 
     * @throws SymbolTableException when there is no valid
     *    current scope level, or when the id is already declared
     *    on the current level.
	 *
     * @param id Identifier of the variable
     * @param entry The base for the entry in the symbol table.
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
    		// The first 3 words after LB in a new frame
    		// are reserved for other addresses, so add 3.
    		entry.setAddress(3+functionSize);	
    		entry.definedInFunction = true;
    	}else{
    		entry.setAddress(currentSize);
    	}
    	
    	if(this.symtab.get(id) == null) {
    		this.symtab.put(id, new Stack<IdEntry>());
    	}
    	
    	this.scopeStack.peek().add(id);
    	this.symtab.get(id).push(entry);
    	
    	
    	// Update either function size or global size.
    	if(Program.isFunctionCall) {
    		functionSize += entry.getSize();
    	}else{
    		// Only if entry is not a function (starts with _).
    		if(id.charAt(0) != '_') {
    			currentSize += entry.getSize();
    		}
    	}
    }

    /**
     * Get the Entry corresponding with id whose level is
     * the highest; in other words, that is defined last.
     * 
     * @param id Identifier of the variable
     * @return Entry belonging to id in the high scope. Null if no entry with the identifier id has been defined.
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
    
    /**
     * Getter for the largest size of the global symbol table thus far.
     * 
     * @return Largest size thus far of the symbol table.
     */
    public int getLargestSize() {
    	return largestSize;
    }
    
    /**
     * Getter for the current size of the global symbol table.
     * 
     * @return Current size of the global symbol table.
     */
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
