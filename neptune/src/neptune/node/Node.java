package neptune.node;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import neptune.NeptuneException;
import neptune.assembly.Program;

public abstract class Node {

	public enum type {
		VOID, INTEGER, CHAR, BOOL
	}
	
	protected List<Node> children = new ArrayList<Node>();
	
	protected type primitive = type.VOID;
	protected boolean isArray = false;
	protected boolean isMutable = false;
	protected boolean resultIsUsed = false;
	protected int elemCount = 0;
	public String description;
	
	public String toString() {
		return description + " ( " + children.toString() + " ) ";
	}
	
	public abstract void validate(Program p) throws NeptuneException;
	
	public abstract void generate(Program p, Map<String, Object> info) throws NeptuneException;
	
	public boolean typeMatch(Node node) {
		
		boolean eType = node.getType() == this.getType();
		boolean eArray = node.isArray() == this.isArray();
		boolean eCount = node.elemCount() == this.elemCount();
		boolean intOrChar = (node.getType() == type.INTEGER && this.getType() == type.CHAR);
		boolean charOrInt = (node.getType() == type.CHAR && this.getType() == type.INTEGER);
		
		return (eType || intOrChar || charOrInt) && eArray && eCount;
	}
	
	public abstract type getType();
	public abstract boolean isArray();
	public abstract boolean isMutable();
	public abstract int elemCount();
	
	public String typeDescription() {
		if(isArray()) {
			return getType() + "[" + elemCount() + "]";
		}else{
			return "" + getType();
		}
	}
	
}
