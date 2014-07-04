package neptune.node;

import neptune.NeptuneException;
import neptune.assembly.Program;

public class BinaryPrimitiveOperatorNode extends Node {

	protected Operator operator;
	protected Node left;
	protected Node right;
	
	public BinaryPrimitiveOperatorNode(Operator operator, Node left, Node right) {
		this.description = "operator:" + operator;
		
		this.operator = operator;
		this.left = left;
		this.right = right;
		
		children.add(left);
		children.add(right);
	}
	
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
