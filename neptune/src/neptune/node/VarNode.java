package neptune.node;

import neptune.IdEntry;
import neptune.NeptuneException;
import neptune.assembly.Program;

public class VarNode extends Node {

	protected String elementRef;
	protected Node element;
	
	public VarNode(String element) {
		this.description = "ref:" + element;
		elementRef = element;
	}
	
	public void validate(Program p) throws NeptuneException {
		IdEntry entry = p.symbolTable.retrieve(elementRef);
		
		if(entry == null) {
			throw new NeptuneException(this, "variable used but not declared");
		}
		
		element = entry.getDeclaringNode();
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
		if(element != null) {
			return element.isArray();
		}
		
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
		if(element != null) {
			return element.elemCount();
		}
		
		return 0;
	}

}
