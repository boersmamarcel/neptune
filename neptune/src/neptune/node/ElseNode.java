package neptune.node;

import java.util.List;

import neptune.NeptuneException;
import neptune.assembly.Program;

public class ElseNode extends Node {

	protected List<Node> lines;
	
	public ElseNode(List<Node> lines) {
		this.description = "else";
		
		this.lines = lines;
		children.addAll(lines);
	}
	
	public void validate(Program p) throws NeptuneException {
		p.symbolTable.openScope();
		super.validate(p);
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
