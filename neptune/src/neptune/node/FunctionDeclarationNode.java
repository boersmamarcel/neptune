package neptune.node;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import neptune.IdEntry;
import neptune.NeptuneException;
import neptune.assembly.Instruction;
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
		
		addToSymbolTable(p);
		
		p.symbolTable.openFunctionScope(funcName);
		p.symbolTable.openScope();
		
		for(Node n: children) {
			n.validate(p);
		}
		
		if(!children.get(children.size()-1).description.equals("return")) {
			throw new NeptuneException(this, "function must end with a return statement");
		}
		
		p.symbolTable.closeScope();
		p.symbolTable.closeFunctionScope();
	}
	
	@Override
	public void generate(Program p, Map<String, Object> info) throws NeptuneException {
		addToSymbolTable(p);
		
		p.symbolTable.openFunctionScope(funcName);
		p.symbolTable.openScope();
		
		p.add(Instruction.LABEL(Instruction.convertFunctionNameToLabel(funcName)));
		
		IdEntry functionEntry = p.symbolTable.retrieve("_" + funcName);
		
		int argsSize = 0;
		
		for(Node n: args) {
			Node typeNode = ((VarDeclarationNode)n).varType;
			
			if(typeNode.isArray()) {
				argsSize += typeNode.elemCount();
			}else{
				argsSize++;
			}
		}
		
		p.add(Instruction.PUSH(argsSize + functionEntry.getSize()));
		
		if(argsSize > 0) {
			p.add(Instruction.LOAD(-argsSize, argsSize));
		}
		
		for(int i = 0; i < args.size(); i++) {
			Map<String, Object> genArgs = new HashMap<String, Object>();
			genArgs.put("instruction", "store");
			args.get(i).generate(p, genArgs);
		}
		
		for(Node n: lines) {
			n.resultIsUsed = false;
			n.generate(p, info);
		}
		
		p.symbolTable.closeScope();
		p.symbolTable.closeFunctionScope();
	}
	
	protected void addToSymbolTable(Program p) throws NeptuneException {
		try {
			p.symbolTable.enter("_" + funcName, new IdEntry(this));
		} catch (Exception e) {
			throw new NeptuneException(this, "error while declaring function (" + e.getMessage() + ")");
		}
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
