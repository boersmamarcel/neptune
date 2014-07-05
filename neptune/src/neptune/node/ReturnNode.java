package neptune.node;

import java.util.Map;

import neptune.IdEntry;
import neptune.NeptuneException;
import neptune.assembly.Instruction;
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
	public void generate(Program p, Map<String, Object> info) throws NeptuneException {
		IdEntry entry = p.symbolTable.retrieve("_" + Program.definingFunction);
		FunctionDeclarationNode declaringNode = (FunctionDeclarationNode)entry.getDeclaringNode();
		
		expression.resultIsUsed = true;
		expression.generate(p, info);
			
		if(expression.isArray()) {
			p.add(Instruction.RETURN(expression.elemCount(), declaringNode.args.size()));
		}else{
			p.add(Instruction.RETURN(1, declaringNode.args.size()));
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
