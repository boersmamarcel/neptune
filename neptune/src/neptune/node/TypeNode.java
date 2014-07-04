package neptune.node;

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
