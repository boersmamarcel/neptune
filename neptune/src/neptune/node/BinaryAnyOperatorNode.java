package neptune.node;

import neptune.NeptuneException;
import neptune.assembly.Program;

public class BinaryAnyOperatorNode extends Node {

	protected Operator operator;
	protected Node left;
	protected Node right;
	
	public BinaryAnyOperatorNode(Operator operator, Node left, Node right) {
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
		case EQUAL:
		case NOT_EQUAL:
			if((left.isArray() && !right.isArray()) || (!left.isArray() && right.isArray())) {
				throw new NeptuneException(this, "trying to compare array with primitive");
			}
			
			if(left.isArray() && right.isArray() && left.elemCount() != right.elemCount()) {
				throw new NeptuneException(this, "element counts do not match for array comparison");
			}
			break;
		
		case BECOMES:
			if(!left.isMutable()) {
				throw new NeptuneException(this, "trying to assign value to immutable operand " + left.description);
			}
			
			if(!left.isArray() && right.isArray()) {
				throw new NeptuneException(this, "trying to assign array to primitive");
			}
			
			if(left.isArray() && !right.isArray()) {
				throw new NeptuneException(this, "trying to assign primitive to array");
			}
			
			if(left.isArray() && right.isArray() && left.elemCount() != right.elemCount()) {
				throw new NeptuneException(this, "element counts do not match for assignment");
			}
			break;

		default:
			throw new NeptuneException(this, "invalid binary any operator (" + operator + ")");
		}
	}
	
	@Override
	public type getType() {
		type result = type.VOID;
		
		switch(operator) {
		case EQUAL:
		case NOT_EQUAL:
			result = type.BOOL;
			break;
			
		case BECOMES:
			result = left.getType();
			break;
			
		default:
			break;
		}
		
		return result;
	}

	@Override
	public boolean isArray() {
		if(operator == Operator.BECOMES) {
			return left.isArray();
		}
		
		return false;
	}

	@Override
	public boolean isMutable() {
		return right.isMutable();
	}

	@Override
	public int elemCount() {
		if(operator == Operator.BECOMES) {
			return left.elemCount();
		}
		
		return 0;
	}

}
