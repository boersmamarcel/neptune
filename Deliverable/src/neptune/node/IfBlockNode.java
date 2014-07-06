package neptune.node;

import java.util.List;
import java.util.Map;

import neptune.NeptuneException;
import neptune.assembly.Instruction;
import neptune.assembly.Program;

/**
 * Class representing an if or elsif block for an if-statement.
 * 
 * @author Koen van Urk and Marcel Boersma
 */
public class IfBlockNode extends Node {

	/**
	 * Lines that form the body of this block.
	 */
	protected List<Node> lines;
	
	/**
	 * Expression that needs to be evaluated to see if this block should be executed. 
	 */
	protected Node expression;
	
	/**
	 * Constructor for an if or elsif block.
	 * 
	 * @param expression Expression that needs to be evaluated to see if this block should be executed.
	 * @param lines Lines that form the body of this block.
	 */
	public IfBlockNode(Node expression, List<Node> lines) {
		this.description = "if-block";
		
		this.expression = expression;
		this.lines = lines;
		
		children.addAll(lines);
	}
	
	@Override
	public void validate(Program p) throws NeptuneException {
		expression.validate(p);
		
		if(expression.getType() != type.BOOL) {
			throw new NeptuneException(this, "condition for if-block must be boolean (" + expression.typeDescription() + ")");
		}
		
		if(expression.isArray()) {
			throw new NeptuneException(this, "condition for if-block cannot be array (" + expression.typeDescription() + ")");
		}
		
		p.symbolTable.openScope();
		for(Node n: children) {
			n.validate(p);
		}
		p.symbolTable.closeScope();
	}
	
	@Override
	public void generate(Program p, Map<String, Object> info) throws NeptuneException {
		
		Integer nextLabel = (Integer)info.get("next_label");
		
		expression.resultIsUsed = true;
		expression.generate(p, info);
		p.add(Instruction.JUMPIF(0, nextLabel));
		
		p.symbolTable.openScope();
		for(Node n: children) {
			n.resultIsUsed = false;
			n.generate(p, info);
		}
		p.symbolTable.closeScope();
	}
	
	@Override
	public type getType() {
		return null;
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
