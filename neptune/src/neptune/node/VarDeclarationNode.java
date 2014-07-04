package neptune.node;

import neptune.IdEntry;
import neptune.NeptuneException;
import neptune.assembly.Program;

public class VarDeclarationNode extends Node {

	protected String identifier;
	protected Node type;
	protected Node expression;
	
	public VarDeclarationNode(String identifier, Node type, Node expression) {
		this.description = "var:" + identifier;
		this.identifier = identifier;
		this.type = type;
		this.expression = expression;
		
		children.add(type);
		children.add(expression);
	}
	
	public void validate(Program p) throws NeptuneException {
		if(expression != null) {
			expression.validate(p);

			if(!this.typeMatch(expression)) {
				throw new NeptuneException(this, "type mismatch (" + expression.typeDescription() + "!=" + this.typeDescription() + ")");
			}
		}
		
		IdEntry entry = new IdEntry(this);
		try {
			p.symbolTable.enter(this.identifier, entry);
		} catch (Exception e) {
			throw new NeptuneException(this, "error while adding var to symbol table (" + e.getMessage() + ")");
		}
	}
	
	@Override
	public type getType() {
		return this.type.getType();
	}

	@Override
	public boolean isArray() {
		return this.type.isArray();
	}
	
	@Override
	public boolean isMutable() {
		return true;
	}

	@Override
	public int elemCount() {
		return this.type.elemCount();
	}

}
