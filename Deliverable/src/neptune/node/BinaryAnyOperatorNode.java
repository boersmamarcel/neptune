package neptune.node;

import java.util.HashMap;
import java.util.Map;

import neptune.NeptuneException;
import neptune.assembly.Program;
import neptune.assembly.Instruction;

/**
 * Class representing binary operators that can operate on primitive and array values.
 * 
 * @author Koen van Urk and Marcel Boersma
 */
public class BinaryAnyOperatorNode extends Node {

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
	 * Constructor for a binary any operator node.
	 * 
	 * @param operator The operator to use.
	 * @param left The left hand operand.
	 * @param right The right hand operand.
	 */
	public BinaryAnyOperatorNode(Operator operator, Node left, Node right) {
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
		case EQUAL:
		case NOT_EQUAL:
			if((left.isArray() && !right.isArray()) || (!left.isArray() && right.isArray())) {
				throw new NeptuneException(this, "trying to compare array with primitive");
			}
			
			if(left.isArray() && right.isArray() && left.elemCount() != right.elemCount()) {
				throw new NeptuneException(this, "element counts do not match for array comparison");
			}
			
			if(!left.typeMatch(right)) {
				throw new NeptuneException(this, "incompatible types (" + left.typeDescription() + "!=" + right.typeDescription() + ")");
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
			
			if(!left.typeMatch(right)) {
				throw new NeptuneException(this, "element types do not match (" + left.typeDescription() + "!=" + right.typeDescription() + ")");
			}
			break;

		default:
			throw new NeptuneException(this, "invalid binary any operator (" + operator + ")");
		}
	}
	
	@Override
	public void generate(Program p, Map <String, Object> info) throws NeptuneException {
		if(this.resultIsUsed && (operator == Operator.EQUAL || operator == Operator.NOT_EQUAL)) {
			left.resultIsUsed = true;
			right.resultIsUsed = true;

			left.generate(p, info);
			right.generate(p, info);

			if(left.isArray()) {
				p.add(Instruction.LOADL(left.elemCount()));
			}else{
				p.add(Instruction.LOADL(1));
			}
			
			if(operator == Operator.EQUAL) {
				p.add(Instruction.CALL("eq"));
			}else if(operator == Operator.NOT_EQUAL) {
				p.add(Instruction.CALL("ne"));
			}
		}
		
		if(operator == Operator.BECOMES) {
			right.resultIsUsed = true;
			right.generate(p, info);

			Map<String, Object> leftArgs = new HashMap<String, Object>();
			leftArgs.put("instruction", "store");
			left.generate(p, leftArgs);
			
			if(this.resultIsUsed) {
				left.resultIsUsed = true;
				left.generate(p, info);
			}
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
