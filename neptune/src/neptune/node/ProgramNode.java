package neptune.node;

import java.util.List;

import neptune.assembly.Program;
import neptune.NeptuneException;

public class ProgramNode extends Node {

	public ProgramNode(List<Node> lines) {
		children = lines;
		description = "program";
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
