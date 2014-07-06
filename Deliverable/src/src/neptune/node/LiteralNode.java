package neptune.node;

import java.util.Map;

import neptune.NeptuneException;
import neptune.assembly.Instruction;
import neptune.assembly.Program;

/**
 * Class representing a literal value such as integer, char or string.
 * 
 * @author Koen van Urk and Marcel Boersma
 */
public class LiteralNode extends Node {

	/**
	 * Value represented by this literal node.
	 */
	protected String value;
	
	/**
	 * Constructor for the literal node.
	 * 
	 * @param value String value representing the literal.
	 * @param primitive Primitive type of the literal (char, integer or bool).
	 */
	public LiteralNode(String value, type primitive) {
		this.value = value;
		this.primitive = primitive;
		
		if(this.primitive == type.CHAR) {
			if(value.charAt(0) == '"') {
				isArray = true;
				elemCount = value.length() - 2;
			}
			
			this.value = value.substring(1, value.length() - 1);
		}
		
		this.description = "literal:" + this.primitive;
		if(isArray) {
			this.description = this.description + "[" + elemCount + "]";
		}
	}
	
	@Override
	public void validate(Program p) throws NeptuneException {
		for(Node n: children) {
			n.validate(p);
		}
	}
	
	@Override
	public void generate(Program p, Map<String, Object> info) {
		if(resultIsUsed) {
			if(isArray()) {
				for(int i = elemCount - 1; i >= 0; i--) {
					p.add(Instruction.LOADL(value.charAt(i)));
				}
			}else if(getType() == type.CHAR) {
				p.add(Instruction.LOADL(value.charAt(0)));
			}else if(getType() == type.BOOL) {
				if(value.equals("true")) {
					p.add(Instruction.LOADL(1));
				}else{
					p.add(Instruction.LOADL(0));
				}
			}else{
				p.add(Instruction.LOADL(Integer.parseInt(value)));
			}
		}
	}
	
	@Override
	public type getType() {
		return this.primitive;
	}

	@Override
	public boolean isArray() {
		return isArray;
	}

	@Override
	public boolean isMutable() {
		return false;
	}

	@Override
	public int elemCount() {
		return elemCount;
	}

}
