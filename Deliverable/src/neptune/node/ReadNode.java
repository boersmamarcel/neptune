package neptune.node;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import neptune.NeptuneException;
import neptune.assembly.Instruction;
import neptune.assembly.Program;

/**
 * Class representing a read expression
 * 
 * @author Koen van Urk and Marcel Boersma
 */
public class ReadNode extends Node {

	/**
	 * Constructor for the read expression.
	 * 
	 * @param expressions Expressions representing variables to read into.
	 */
	public ReadNode(List<Node> expressions) {
		this.description = "read";
		children = expressions;
	}
	
	@Override
	public void validate(Program p) throws NeptuneException {
		for(Node n: children) {
			n.validate(p);
			if(n.getType() == type.VOID) {
				throw new NeptuneException(this, "variable " + n.description + " cannot be of type void");
			}
			
			if(n.getType() == type.BOOL) {
				throw new NeptuneException(this, "variable " + n.description + " cannot be of type bool");
			}
			
			if(n.isArray()) {
				throw new NeptuneException(this, "trying to read into array");
			}
			
			if(!n.isMutable()) {
				throw new NeptuneException(this, "trying to read into immutable variable");
			}
		}
	}
	
	@Override
	public void generate(Program p, Map<String, Object> info) throws NeptuneException {
		for(Node n: children) {
			Map<String, Object> args = new HashMap<String, Object>();
			args.put("instruction", "address");
			n.resultIsUsed = true;
			n.generate(p, args);
			
			if(n.getType() == type.CHAR) {
				p.add(Instruction.READ_CHAR());
			}else{
				p.add(Instruction.READ_INT());
			}
		}
		
		if(children.size() == 1 && resultIsUsed) {
			children.get(0).resultIsUsed = true;
			children.get(0).generate(p, info);
		}
	}
	
	@Override
	public type getType() {
		// Read statement returns a real value iff there is only 1 expression
		if(children.size() == 1) {
			return children.get(0).getType();
		}
		return type.VOID;
	}

	@Override
	public boolean isArray() {
		// Read statement returns a real value iff there is only 1 expression
		if(children.size() == 1) {
			return children.get(0).isArray();
		}
		return false;
	}
	
	@Override
	public boolean isMutable() {
		return false;
	}

	@Override
	public int elemCount() {
		// Read statement returns a real value iff there is only 1 expression
		if(children.size() == 1) {
			return children.get(0).elemCount();
		}
		return 0;
	}

}
