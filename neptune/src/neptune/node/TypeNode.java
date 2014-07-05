package neptune.node;

import java.util.Map;

import neptune.NeptuneException;
import neptune.assembly.Program;

public class TypeNode extends Node {
	
	public TypeNode(type primitive, int elements) {
		this.description = "typedef";
		this.primitive = primitive;
		if(elements > 0) {
			this.isArray = true;
			this.elemCount = elements;
		}
	}
	
	@Override
	public void validate(Program p) throws NeptuneException {
		for(Node n: children) {
			n.validate(p);
		}
	}
	
	@Override
	public void generate(Program p, Map<String, Object> info) {
		// This node is a leaf node and generates no assembly.
	}
	
	@Override
	public type getType() {
		return primitive;
	}

	@Override
	public boolean isArray() {
		return isArray;
	}
	
	@Override
	public boolean isMutable() {
		return false;
	}

	@Override
	public int elemCount() {
		return elemCount;
	}

}
