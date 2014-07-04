package neptune;

public class Type {
	public enum primitive{
		INTEGER, CHAR, BOOLEAN, VOID, CONTAINER
	}
	
	public boolean isArray = false;
	public boolean isConstant = false;
	public int elemCount = 0;
	public primitive type;

	public Type(Type.primitive t){
		this.type = t;
	}

	public Type(Type.primitive t, int elemCount){
		this.isArray = true;
		this.elemCount = elemCount;
		this.type = t;
	}
	
	public int getPrimitiveSize() {
		return 1;
	}

}

//public enum Type{
//	INTEGER, CHAR, BOOLEAN, VOID, CONTAINER
//}