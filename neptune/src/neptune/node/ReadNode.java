package neptune.node;

import java.util.List;

import neptune.NeptuneException;
import neptune.assembly.Program;

public class ReadNode extends Node {

	public ReadNode(List<Node> expressions) {
		this.description = "read";
		children = expressions;
	}
	
	public void validate(Program p) throws NeptuneException {
		for(Node n: children) {
			n.validate(p);
			if(n.getType() == type.VOID) {
				throw new NeptuneException(this, "variable " + n.description + " cannot be of type void");
			}
			
			if(!n.isMutable()) {
				throw new NeptuneException(this, "trying to read into immutable variable");
			}
		}
	}
	
	@Override
	public type getType() {
		// Read statement returns a real value iff there is only 1 expression
		if(children.size() == 1) {
			return children.get(0).getType();
		}
		return type.VOID;
	}

	@Override
	public boolean isArray() {
		// Read statement returns a real value iff there is only 1 expression
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
		// Read statement returns a real value iff there is only 1 expression
		if(children.size() == 1) {
			return children.get(0).elemCount();
		}
		return 0;
	}

}
