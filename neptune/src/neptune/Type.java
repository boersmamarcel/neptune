package neptune;

public class Type {
	public enum primitive{
		INTEGER, CHAR, BOOLEAN, VOID
	}
	
	public boolean isArray = false;
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

}
