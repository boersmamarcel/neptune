package neptune.node;

import java.util.List;
import java.util.Map;

import neptune.NeptuneException;
import neptune.assembly.Instruction;
import neptune.assembly.Program;

/**
 * Class representing a print statement.
 * 
 * @author Koen van Urk and Marcel Boersma
 */
public class PrintNode extends Node {

	/**
	 * Constructor for the print node.
	 * 
	 * @param expressions A list containing the expressions to be printed on screen.
	 */
	public PrintNode(List<Node> expressions) {
		this.description = "print";
		children = expressions;
	}
	
	@Override
	public void validate(Program p) throws NeptuneException {
		for(Node n: children) {
			n.validate(p);
			if(n.getType() == type.VOID) {
				throw new NeptuneException(this, "expression " + n.description + " cannot be of type void");
			}
		}
	}
	
	@Override
	public void generate(Program p, Map<String, Object> info) throws NeptuneException {
		for(Node n: children) {
			n.resultIsUsed = true;
			n.generate(p, info);
			
			int elems = 1;
			
			if(n.isArray()) {
				elems = n.elemCount();
			}

			for(int i = 0; i < elems; i++) {
				if(n.getType() == type.CHAR) {
					p.add(Instruction.PRINT_CHAR());
				}else{
					p.add(Instruction.PRINT_INT());
				}
			}
		}
		
		if(children.size() == 1 && resultIsUsed) {
			children.get(0).resultIsUsed = true;
			children.get(0).generate(p, info);
		}
	}
	
	@Override
	public type getType() {
		// Print statement returns a real value iff there is only 1 expression
		if(children.size() == 1) {
			return children.get(0).getType();
		}
		return type.VOID;
	}

	@Override
	public boolean isArray() {
		// Print statement returns a real value iff there is only 1 expression
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
		// Print statement returns a real value iff there is only 1 expression
		if(children.size() == 1) {
			return children.get(0).elemCount();
		}
		return 0;
	}

}
