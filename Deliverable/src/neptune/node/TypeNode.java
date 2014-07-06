package neptune.node;

import java.util.Map;

import neptune.NeptuneException;
import neptune.assembly.Program;

/**
 * Class representation of the TypeNode
 * 
 * @author Koen van Urk and Marcel Boersma
 */
public class TypeNode extends Node {
	
	/**
	 * Constructor of the type node
	 * @param primitive primitive node type
	 * @param elements number of elements, if 0 then primitive type else array
	 */
	public TypeNode(type primitive, int elements) {
		this.description = "typedef";
		this.primitive = primitive;
		if(elements > 0) {
			this.isArray = true;
			this.elemCount = elements;
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
		// This node is a leaf node and generates no assembly.
	}
	
	@Override
	public type getType() {
		return primitive;
	}

	@Override
	public boolean isArray() {
		return isArray;
	}
	
	@Override
	public boolean isMutable() {
		return isMutable;
	}

	@Override
	public int elemCount() {
		return elemCount;
	}

}
