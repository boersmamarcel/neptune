package neptune;

public class Variable {
	public String identifier;
	public Type type;
	public boolean isIndexIntoArray;
	
	public Variable() {
		this.type = new Type(Type.primitive.VOID);
		this.identifier = "";
		this.isIndexIntoArray = false;
	}
}
