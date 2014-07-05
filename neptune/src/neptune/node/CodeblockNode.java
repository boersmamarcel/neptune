package neptune.node;

import java.util.List;
import java.util.Map;

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
		for(Node n: children) {
			n.validate(p);
		}
		p.symbolTable.closeScope();
	}

	@Override
	public void generate(Program p, Map<String, Object> info) throws NeptuneException {
		p.symbolTable.openScope();
		for(int i = 0; i < children.size() - 1; i++) {
			children.get(i).resultIsUsed = false;
			children.get(i).generate(p, info);
		}
		
		// Last child is special if result of codeblock is used
		children.get(children.size() - 1).resultIsUsed = this.resultIsUsed;
		children.get(children.size() - 1).generate(p, info);
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
