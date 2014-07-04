package neptune.node;

import java.util.ArrayList;
import java.util.List;

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
	protected int elemCount = 0;
	public String description;
	
	public String toString() {
		return description + " ( " + children.toString() + " ) ";
	}
	
	public void validate(Program p) throws NeptuneException {
		for(Node n: children) {
			n.validate(p);
			System.out.println("Validating: " + n.description);
		}
	}
	
	public void generate(Program p) {
		for(Node n: children) {
			n.generate(p);
		}
	}
	
	public boolean typeMatch(Node node) {
		return (node.getType() == this.getType() && node.isArray() == this.isArray() && node.elemCount() == this.elemCount());	
	}
	
	public abstract type getType();
	public abstract boolean isArray();
	public abstract boolean isMutable();
	public abstract int elemCount();
	
}
