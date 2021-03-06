package neptune.node;

import java.util.List;
import java.util.Map;

import neptune.assembly.Program;
import neptune.NeptuneException;

/**
 * Class representing the entire Neptune program.
 * 
 * @author Koen van Urk and Marcel Boersma
 */
public class ProgramNode extends Node {

	/**
	 * Constructor for the program node.
	 * 
	 * @param lines Lines forming the Neptune program
	 */
	public ProgramNode(List<Node> lines) {
		children = lines;
		description = "program";
	}
	
	@Override
	public void validate(Program p) throws NeptuneException {
		p.symbolTable.openScope();
		for(Node n: children) {
			n.validate(p);
		}
		p.symbolTable.closeScope();
	}

	@Override
	public void generate(Program p, Map<String, Object> info) throws NeptuneException {
		p.symbolTable.openScope();
		for(Node n: children) {
			n.resultIsUsed = false;
			n.generate(p, info);
		}
		p.symbolTable.closeScope();
	}

	@Override
	public type getType() {
		return type.VOID;
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
