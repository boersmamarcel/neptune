package neptune.node;

public class LiteralNode extends Node {

	protected String value;
	
	public LiteralNode(String value, type primitive) {
		this.value = value;
		this.primitive = primitive;
		
		if(this.primitive == type.CHAR) {
			if(value.charAt(0) == '"') {
				isArray = true;
				elemCount = value.length() - 2;
			}
			
			this.value = value.substring(1, value.length() - 1);
		}
		
		this.description = "literal:" + this.primitive;
		if(isArray) {
			this.description = this.description + "[" + elemCount + "]";
		}
	}
	
	@Override
	public type getType() {
		return this.primitive;
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
