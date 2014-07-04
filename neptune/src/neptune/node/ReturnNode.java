package neptune.node;

import neptune.IdEntry;
import neptune.NeptuneException;
import neptune.assembly.Program;

public class ReturnNode extends Node {

	protected Node expression;
	
	public ReturnNode(Node expression) {
		this.description = "return";
		
		this.expression = expression;
	}
	
	public void validate(Program p) throws NeptuneException {
		expression.validate(p);
		
		if(!Program.isFunctionCall) {
			throw new NeptuneException(this, "cannot return when not in function");
		}
		
		IdEntry entry = p.symbolTable.retrieve("_" + Program.definingFunction);
		FunctionDeclarationNode declaringNode = (FunctionDeclarationNode)entry.getDeclaringNode();
		
		if(!this.typeMatch(declaringNode)) {
			throw new NeptuneException(this, "invalid return type (" + this.typeDescription() + "!=" + declaringNode.typeDescription() + ")");
		}
	}
	
	@Override
	public type getType() {
		return expression.getType();
	}

	@Override
	public boolean isArray() {
		return expression.isArray();
	}

	@Override
	public boolean isMutable() {
		return false;
	}

	@Override
	public int elemCount() {
		return expression.elemCount();
	}

}
