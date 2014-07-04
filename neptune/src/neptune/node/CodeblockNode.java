package neptune.node;

import java.util.List;

import neptune.NeptuneException;
import neptune.assembly.Program;

public class CodeblockNode extends Node {

	public CodeblockNode(List<Node> lines) {
		children = lines;
		description = "codeblock";
	}
	
	@Override
	public void validate(Program p) throws NeptuneException {
		p.symbolTable.openScope();
		super.validate(p);
		p.symbolTable.closeScope();
	}

	@Override
	public void generate(Program p) {
		p.symbolTable.openScope();
		super.generate(p);
		p.symbolTable.closeScope();
	}

	@Override
	public type getType() {
		// Last line defines the type
		return children.get(children.size() - 1).getType();
	}

	@Override
	public boolean isArray() {
		// Last line defines the type
		return children.get(children.size() - 1).isArray();
	}
	
	@Override
	public boolean isMutable() {
		// Last line defines the type
		return children.get(children.size() - 1).isMutable();
	}

	@Override
	public int elemCount() {
		// Last line defines the type
		return children.get(children.size() - 1).elemCount();
	}

}
