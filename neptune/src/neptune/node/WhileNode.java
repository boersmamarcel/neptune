package neptune.node;

import java.util.List;

import neptune.NeptuneException;
import neptune.assembly.Program;

public class WhileNode extends Node {

	protected Node loopCondition;
	
	public WhileNode(Node expression, List<Node> lines) {
		this.description = "while";
		loopCondition = expression;
		children.add(expression);
		children.addAll(lines);
	}
	
	@Override
	public void validate(Program p) throws NeptuneException {
		p.symbolTable.openScope();
		if(loopCondition.getType() != type.BOOL) {
			throw new NeptuneException(this.description + ": loop condition " + loopCondition.description + " must be boolean");
		}
		
		if(loopCondition.isArray()) {
			throw new NeptuneException(this.description + ": loop condition " + loopCondition.description + " cannot be array");
		}
		
		super.validate(p);
		p.symbolTable.closeScope();
	}

	@Override
	public void generate(Program p) {
		p.symbolTable.openScope();
		super.generate(p);
		p.symbolTable.closeScope();
	}
	
	@Override
	public type getType() {
		return type.VOID;
	}

	@Override
	public boolean isArray() {
		return false;
	}
	
	@Override
	public boolean isMutable() {
		return false;
	}

	@Override
	public int elemCount() {
		return 0;
	}

}
