package neptune;

import neptune.node.Node;

public class IdEntry {
	
    private int level = -1;
    private int address = -1;
    private Node declaringNode;
 
    public IdEntry(Node t) {
    	declaringNode = t;
    }
    
    public int   getLevel()             	{ return this.level;    }
    public void  setLevel(int level)    	{ this.level = level;   }
    
    public int getAddress() 				{ return this.address; }
    public void setAddress(int address) 	{ this.address = address; }

    public Node getDeclaringNode()			{ return this.declaringNode; }
    
    public int getSize() {
    	if(this.declaringNode.isArray()) {
    		return this.declaringNode.elemCount();
    	}else{
    		// All primitives have are 1 word big
    		return 1;
    	}
    }
}
