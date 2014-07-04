package neptune.node;

import java.util.List;

import neptune.IdEntry;
import neptune.NeptuneException;
import neptune.assembly.Program;

public class FunctionCallNode extends Node {

	protected FunctionDeclarationNode functionRef;
	protected String functionName;
	protected List<Node> args;
	
	public FunctionCallNode(String functionName, Node arraySet) {
		this.description = "function_ref:" + functionName;
		
		this.functionName = functionName;
		this.args = arraySet.children;
		
		children.addAll(args);
	}
	
	public void validate(Program p) throws NeptuneException {
		super.validate(p);
		
		IdEntry entry = p.symbolTable.retrieve("_" + functionName);
		
		if(entry == null) {
			throw new NeptuneException(this, "function does not exist");
		}
		this.functionRef = (FunctionDeclarationNode)entry.getDeclaringNode();
		
		if(functionRef.args.size() != args.size()) {
			throw new NeptuneException(this, "argument count doesn't match (" + args.size() + "!=" + functionRef.args.size() + ")");
		}
		
		for(int i = 0; i < args.size(); i++) {
			if(!args.get(i).typeMatch(functionRef.args.get(i))) {
				throw new NeptuneException(this, "argument " + (i+1) + " does not match expected argument type");
			}
		}
	}
	
	@Override
	public type getType() {
		if(functionRef != null) {
			return functionRef.getType();
		}
		
		return type.VOID;
	}

	@Override
	public boolean isArray() {
		if(functionRef != null) {
			return functionRef.isArray();
		}
		
		return false;
	}

	@Override
	public boolean isMutable() {
		return false;
	}

	@Override
	public int elemCount() {
		if(functionRef != null) {
			return functionRef.elemCount();
		}
		
		return 0;
	}

}
