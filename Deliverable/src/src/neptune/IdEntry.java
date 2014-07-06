package neptune;

import neptune.node.Node;

/**
 * Class representing an entry in a symbol table.
 * 
 * @author Koen van Urk and Marcel Boersma
 */
public class IdEntry {
	
    /**
     * Stores the scope level.
     */
    private int level = -1;
    
    /**
     * Stores the address in memory for this element.
     */
    private int address = -1;
    
    /**
     * Stores a Node that defines the type of this entry.
     */
    private Node declaringNode;
    
    /**
     * Used for function entries to store the size on the stack required for variables used. 
     */
    public int functionSize = -1;
    
    /**
     * Whether or not this variable was defined within a function.
     */
    public boolean definedInFunction = false;
 
    /**
     * @param t
     */
    public IdEntry(Node t) {
    	declaringNode = t;
    }
    
    /**
     * Getter for scope level.
     * 
     * @return The scope level.
     */
    public int   getLevel()             	{ return this.level;    }
    
    /**
     * Sets the scope for this element.
     * 
     * @param level A scope level.
     */
    public void  setLevel(int level)    	{ this.level = level;   }
    
    /**
     * Getter for the memory address.
     * 
     * @return Address in memory
     */
    public int getAddress() 				{ return this.address; }
    
    /**
     * Sets the memory address for this element.
     * 
     * @param address Memory address
     */
    public void setAddress(int address) 	{ this.address = address; }

    /**
     * Getter for the declaring node. This node defines the type of the element this entry represents.
     * 
     * @return Node that defines the type of this element.
     */
    public Node getDeclaringNode()			{ return this.declaringNode; }
    
    /**
     * Returns the size in memory for this element.
     * 
     * Since every primitive element has a size of 1 word, it
     * either returns 1 or the number of elements in an array
     * for variables. For functions this method returns the size
     * that needs to be reserved on the stack.
     * 
     * @return Size in memory for this element.
     */
    public int getSize() {
    	if(functionSize >= 0) {
    		return functionSize;
    	} else if(this.declaringNode.isArray()) {
    		return this.declaringNode.elemCount();
    	}else{
    		// All primitives have are 1 word big
    		return 1;
    	}
    }
    
    public boolean isDefinedInFunction() {
    	return definedInFunction;
    }
}
