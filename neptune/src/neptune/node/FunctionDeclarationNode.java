package neptune.node;

import java.util.List;

import neptune.IdEntry;
import neptune.NeptuneException;
import neptune.assembly.Program;

public class FunctionDeclarationNode extends Node {

	protected Node type;
	protected String funcName;
	protected List<Node> args;
	protected List<Node> lines;
	
	public FunctionDeclarationNode(String funcName, Node type, List<Node> args, List<Node> lines) {
		this.description = "function:" + funcName;
		
		this.funcName = funcName;
		this.type = type;
		this.args = args;
		this.lines = lines;
		
		children.addAll(args);
		children.addAll(lines);
	}
	
	public void validate(Program p) throws NeptuneException {
		if(p.symbolTable.currentLevel() > 0) {
			throw new NeptuneException(this, "function can only be declared in the global scope");
		}
		
		try {
			p.symbolTable.enter("_" + funcName, new IdEntry(this));
		} catch (Exception e) {
			throw new NeptuneException(this, "error while declaring function (" + e.getMessage() + ")");
		}
		
		p.symbolTable.openFunctionScope(funcName);
		p.symbolTable.openScope();
		
		super.validate(p);
		
		if(!children.get(children.size()-1).description.equals("return")) {
			throw new NeptuneException(this, "function must end with a return statement");
		}
		
		p.symbolTable.closeScope();
		p.symbolTable.closeFunctionScope();
	}
	
	@Override
	public type getType() {
		return type.getType();
	}

	@Override
	public boolean isArray() {
		return type.isArray();
	}

	@Override
	public boolean isMutable() {
		return false;
	}

	@Override
	public int elemCount() {
		return type.elemCount();
	}

}
