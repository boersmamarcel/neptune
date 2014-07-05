package neptune.node;

import java.util.Map;

import neptune.NeptuneException;
import neptune.assembly.Instruction;
import neptune.assembly.Program;

public class UnaryPrimitiveOperatorNode extends Node {

	protected Operator operator;
	protected Node operand;
	
	public UnaryPrimitiveOperatorNode(Operator operator, Node operand) {
		this.description = "operator:" + operator;
		
		this.operator = operator;
		this.operand = operand;
		
		children.add(operand);
	}
	
	public void validate(Program p) throws NeptuneException {
		operand.validate(p);
		
		if(operand.getType() == type.VOID) {
			throw new NeptuneException(this, "operand cannot be void");
		}
		
		if(operand.isArray()) {
			throw new NeptuneException(this, "operand cannot be array");
		}
		
		if(operator == Operator.UNARY_MINUS || operator == Operator.UNARY_PLUS) {
			if(operand.getType() != type.INTEGER) {
				throw new NeptuneException(this, "invalid  type " + operand.getType() + " for operator");
			}
		} else if(operator == Operator.UNARY_NEGATE) {
			if(operand.getType() != type.BOOL) {
				throw new NeptuneException(this, "invalid type " + operand.getType() + " for operator");
			}
		} else {
			throw new NeptuneException(this, "invalid unary operator (" + operator + ")");
		}
	}
	
	@Override
	public type getType() {
		type result = type.VOID;
		
		switch(operator) {
		case UNARY_NEGATE:
			result = type.BOOL;
			break;

		case UNARY_PLUS:
		case UNARY_MINUS:
			result = type.INTEGER;
			break;
			
		default:
			break;
		}
		
		return result;
	}
	
	@Override
	public void generate(Program p, Map<String, Object> info) throws NeptuneException {
		if(resultIsUsed) {
			operand.resultIsUsed = true;
			operand.generate(p, info);
			
			if(operator == Operator.UNARY_NEGATE) {
				p.add(Instruction.UNARY_NEGATE());
			}else if(operator == Operator.UNARY_MINUS) {
				p.add(Instruction.UNARY_MINUS());
			}
			
			// Unary plus has no real effect, besides loading the argument onto the stack.
		}
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
