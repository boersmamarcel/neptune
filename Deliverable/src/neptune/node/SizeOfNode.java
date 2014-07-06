package neptune.node;

import java.util.Map;

import neptune.NeptuneException;
import neptune.assembly.Instruction;
import neptune.assembly.Program;

/**
 * Class representing the sizeof language construct.
 * 
 * @author Koen van Urk and Marcel Boersma
 */
public class SizeOfNode extends Node {

	/**
	 * Array whose size should be returned.
	 */
	protected Node array;
	
	/**
	 * Constructor for the sizeof language construct.
	 * 
	 * @param array Array whose size should be returned.
	 */
	public SizeOfNode(String array) {
		this.description = "sizeof:" + array;
		this.array = new VarNode(array);
	}
	
	@Override
	public void validate(Program p) throws NeptuneException {
		array.validate(p);
		
		if(!array.isArray()) {
			throw new NeptuneException(this, "operator must be used on array (" + array.description + ")");
		}
	}
	
	@Override
	public void generate(Program p, Map<String, Object> info) {
		if(resultIsUsed) {
			p.add(Instruction.LOADL(array.elemCount()));
		}
	}
	
	@Override
	public type getType() {
		return type.INTEGER;
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
