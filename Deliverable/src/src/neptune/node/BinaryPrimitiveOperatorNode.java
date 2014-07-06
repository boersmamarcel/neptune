package neptune.node;

import java.util.Map;

import neptune.NeptuneException;
import neptune.assembly.Instruction;
import neptune.assembly.Program;

/**
 * Class representing a binary operator that requires primitive (non-array) expressions. 
 * 
 * @author Koen van Urk and Marcel Boersma
 */
public class BinaryPrimitiveOperatorNode extends Node {

	/**
	 * The operator for this binary expression.
	 */
	protected Operator operator;
	
	/**
	 * The left hand operand.
	 */
	protected Node left;
	
	/**
	 * The right hand operand.
	 */
	protected Node right;
	
	/**
	 * Constructor for a binary primitive operator node.
	 * 
	 * @param operator The operator to use.
	 * @param left The left hand operand.
	 * @param right The right hand operand.
	 */
	public BinaryPrimitiveOperatorNode(Operator operator, Node left, Node right) {
		this.description = "operator:" + operator;
		
		this.operator = operator;
		this.left = left;
		this.right = right;
		
		children.add(left);
		children.add(right);
	}
	
	@Override
	public void validate(Program p) throws NeptuneException {
		left.validate(p);
		right.validate(p);
		
		if(left.getType() == type.VOID) {
			throw new NeptuneException(this, "left operand cannot be void");
		}
		
		if(right.getType() == type.VOID) {
			throw new NeptuneException(this, "right operand cannot be void");
		}
		
		switch(operator) {
		case AND:
		case OR:
			if(left.getType() != type.BOOL) {
				throw new NeptuneException(this, "invalid left operand type " + left.getType() + " for operator");
			}
			
			if(right.getType() != type.BOOL) {
				throw new NeptuneException(this, "invalid right operand type " + right.getType() + " for operator");
			}
			break;
		case LESS:
		case LESS_EQUAL:
		case GREATER:
		case GREATER_EQUAL:
		case DIVIDE:
		case MINUS:
		case MOD:
		case PLUS:
		case TIMES:
			if(left.getType() != type.INTEGER && left.getType() != type.CHAR) {
				throw new NeptuneException(this, "invalid left operand type " +  left.getType() + " for operator");
			}
			
			if(right.getType() != type.INTEGER && right.getType() != type.CHAR) {
				throw new NeptuneException(this, "invalid right operand type " +  right.getType() + " for operator");
			}
			break;
			
		default:
			throw new NeptuneException(this, "invalid binary primitive operator (" + operator + ")");
		}
	}
	
	@Override
	public void generate(Program p, Map<String, Object> info) throws NeptuneException {
		if(this.resultIsUsed) {
			left.resultIsUsed = true;
			right.resultIsUsed = true;
			
			left.generate(p, info);
			right.generate(p, info);
			
			switch(operator) {
			case AND:
				p.add(Instruction.AND());
				break;
			case OR:
				p.add(Instruction.OR());
				break;
			case LESS:
				p.add(Instruction.LESS());
				break;
			case LESS_EQUAL:
				p.add(Instruction.LESS_EQUAL());
				break;
			case GREATER:
				p.add(Instruction.GREATER());
				break;
			case GREATER_EQUAL:
				p.add(Instruction.GREATER_EQUAL());
				break;
			case DIVIDE:
				p.add(Instruction.DIV());
				break;
			case MINUS:
				p.add(Instruction.SUB());
				break;
			case MOD:
				p.add(Instruction.MOD());
				break;
			case PLUS:
				p.add(Instruction.ADD());
				break;
			case TIMES:
				p.add(Instruction.MULT());
				break;
			default:
				break;
			}
		}
	}
	
	@Override
	public type getType() {
		type result = type.VOID;
		
		switch(operator) {
		case AND:
		case OR:
		case LESS:
		case LESS_EQUAL:
		case GREATER:
		case GREATER_EQUAL:
			result = type.BOOL;
			break;
			
		case DIVIDE:
		case MINUS:
		case MOD:
		case PLUS:
		case TIMES:
			result = type.INTEGER;
			break;
			
		default:
			break;
		}
		
		return result;
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
