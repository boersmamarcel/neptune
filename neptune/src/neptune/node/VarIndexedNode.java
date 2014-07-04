package neptune.node;

import neptune.IdEntry;
import neptune.NeptuneException;
import neptune.assembly.Program;

public class VarIndexedNode extends Node {

	protected String elementRef;
	protected Node element;
	protected Node expression;
	
	public VarIndexedNode(String element, Node expression) {
		this.description = "index_ref:" + element;
		elementRef = element;
	}
	
	public void validate(Program p) throws NeptuneException {
		IdEntry entry = p.symbolTable.retrieve(elementRef);
		
		if(entry == null) {
			throw new NeptuneException(this.description + ": variable used but not declared");
		}
		
		if(!entry.getTypeNode().isArray()) {
			throw new NeptuneException(this.description + ": used with index, but is not an array");
		}
		
		if(expression.getType() != type.INTEGER) {
			throw new NeptuneException(this.description + ": index into variable should be integer type");
		}
		
		if(!expression.isArray()) {
			throw new NeptuneException(this.description + ": index into variable should not be an array");
		}
		
		element = entry.getTypeNode();
	}
	
	@Override
	public type getType() {
		if(element != null) {
			return element.getType();
		}
		
		return type.VOID;
	}

	@Override
	public boolean isArray() {
		return false;
	}

	@Override
	public boolean isMutable() {
		if(element != null) {
			return element.isMutable();
		}
		
		return false;
	}

	@Override
	public int elemCount() {
		return 0;
	}

}
