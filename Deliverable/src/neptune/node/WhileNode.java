package neptune.node;

import java.util.List;
import java.util.Map;

import neptune.NeptuneException;
import neptune.assembly.Instruction;
import neptune.assembly.Program;

/**
 * Class representing a while statement
 * 
 * @author Koen van Urk and Marcel Boersma
 *
 */
public class WhileNode extends Node {

	/**
	 * The loop condition for the while statement	
	 */
	protected Node loopCondition;
	
	/**
	 * Constructor of the while statement node
	 * @param expression conditional expression
	 * @param lines the code block
	 */
	public WhileNode(Node expression, List<Node> lines) {
		this.description = "while";
		loopCondition = expression;
		children.addAll(lines);
	}
	
	@Override
	public void validate(Program p) throws NeptuneException {
		p.symbolTable.openScope();
		
		loopCondition.validate(p);
		
		if(loopCondition.getType() != type.BOOL) {
			throw new NeptuneException(this, "loop condition " + loopCondition.description + " must be boolean");
		}
		
		if(loopCondition.isArray()) {
			throw new NeptuneException(this, "loop condition " + loopCondition.description + " cannot be array");
		}
		
		for(Node n: children) {
			n.validate(p);
		}
		p.symbolTable.closeScope();
	}

	@Override
	public void generate(Program p, Map<String, Object> info) throws NeptuneException {
		p.symbolTable.openScope();
		
		int beginLabel = p.generateLabel();
		int endLabel = p.generateLabel();
		
		p.add(Instruction.LABEL(beginLabel));
		loopCondition.resultIsUsed = true;
		loopCondition.generate(p, info);
		p.add(Instruction.JUMPIF(0, endLabel));
		
		for(Node n: children) {
			n.resultIsUsed = false;
			n.generate(p, info);
		}
		
		p.add(Instruction.JUMP(beginLabel));
		p.add(Instruction.LABEL(endLabel));
		
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
