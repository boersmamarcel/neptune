package neptune.node;

import java.util.List;
import java.util.Map;

import neptune.NeptuneException;
import neptune.assembly.Program;

/**
 * Class representing an else node belonging to an if-statement.
 * 
 * @author Koen van Urk and Marcel Boersma
 */
public class ElseNode extends Node {

	/**
	 * Lines contained within the else block.
	 */
	protected List<Node> lines;
	
	/**
	 * Constructor for an else node.
	 * 
	 * @param lines Lines contained within the else block.
	 */
	public ElseNode(List<Node> lines) {
		this.description = "else";
		
		this.lines = lines;
		children.addAll(lines);
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
		return null;
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
