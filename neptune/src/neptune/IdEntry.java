package neptune;

import neptune.node.Node;

/**
 * VB prac week1 - SymbolTable.
 * class IdEntry.
 * @author   Theo Ruys
 * @version  2006.04.21
 */
public class IdEntry {
    private int  level = -1;
    private int  address = -1;
    private Node type;
 
    public IdEntry(Node t) {
    	type = t;
    }
    
    public int   getLevel()             	{ return this.level;    }
    public void  setLevel(int level)    	{ this.level = level;   }
    
    public int getAddress() 				{ return this.address; }
    public void setAddress(int address) 	{ this.address = address; }

    public Node getTypeNode()				{ return this.type; }
    
    public int getSize() {
    	if(this.type.isArray()) {
    		return this.type.elemCount();
    	}else{
    		// All primitives have are 1 word big
    		return 1;
    	}
    }
}
