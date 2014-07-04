package neptune.node;

import java.util.List;

import neptune.NeptuneException;
import neptune.assembly.Program;

public class PrintNode extends Node {

	public PrintNode(List<Node> expressions) {
		this.description = "print";
		children = expressions;
	}
	
	public void validate(Program p) throws NeptuneException {
		for(Node n: children) {
			n.validate(p);
			if(n.getType() == type.VOID) {
				throw new NeptuneException(this.description + ": expression " + n.description + " cannot be of type void");
			}else{
				System.out.println("Type: " + n.getType());
			}
		}
	}
	
	@Override
	public type getType() {
		// Print statement returns a real value iff there is only 1 expression
		if(children.size() == 1) {
			return children.get(0).getType();
		}
		return type.VOID;
	}

	@Override
	public boolean isArray() {
		// Print statement returns a real value iff there is only 1 expression
		if(children.size() == 1) {
			return children.get(0).isArray();
		}
		return false;
	}
	
	@Override
	public boolean isMutable() {
		return false;
	}

	@Override
	public int elemCount() {
		// Print statement returns a real value iff there is only 1 expression
		if(children.size() == 1) {
			return children.get(0).elemCount();
		}
		return 0;
	}

}
