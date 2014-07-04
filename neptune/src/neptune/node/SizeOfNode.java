package neptune.node;

import neptune.NeptuneException;
import neptune.assembly.Program;

public class SizeOfNode extends Node {

	protected Node array;
	
	public SizeOfNode(String array) {
		this.description = "sizeof:" + array;
		this.array = new VarNode(array);
	}
	
	public void validate(Program p) throws NeptuneException {
		array.validate(p);
		
		if(!array.isArray()) {
			throw new NeptuneException(this, "operator must be used on array (" + array.description + ")");
		}
	}
	
	@Override
	public type getType() {
		return type.INTEGER;
	}

	@Override
	public boolean isArray() {
		return false;
	}

	@Override
	public boolean isMutable() {
		return false;
	}

	@Override
	public int elemCount() {
		return 0;
	}

}