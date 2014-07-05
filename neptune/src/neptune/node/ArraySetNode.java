package neptune.node;

import java.util.List;
import java.util.Map;

import neptune.NeptuneException;
import neptune.assembly.Program;

public class ArraySetNode extends Node {

	public ArraySetNode(List<Node> elements) {
		children = elements;
	}
	
	@Override
	public void validate(Program p) throws NeptuneException {
		for(Node n: children) {
			n.validate(p);
		}
	}
	
	@Override
	public void generate(Program p, Map <String, Object> info) throws NeptuneException {
		
		if(this.resultIsUsed) {
			
			// Put arguments in reverse order on the stack
			for(int i = children.size() - 1; i >= 0; i--) {
				children.get(i).resultIsUsed = true;
				children.get(i).generate(p, info);
			}
		}
	}
	
	@Override
	public type getType() {
		return children.get(0).getType();
	}

	@Override
	public boolean isArray() {
		return true;
	}

	@Override
	public boolean isMutable() {
		return false;
	}

	@Override
	public int elemCount() {
		return children.size();
	}

}
