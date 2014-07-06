package neptune.node;

import java.util.List;
import java.util.Map;

import neptune.IdEntry;
import neptune.NeptuneException;
import neptune.assembly.Instruction;
import neptune.assembly.Program;

/**
 * Class representing a function call.
 * 
 * @author Koen van Urk and Marcel Boersma
 */
public class FunctionCallNode extends Node {

	/**
	 * Reference to the declaration of the function.
	 */
	protected FunctionDeclarationNode functionRef;
	
	/**
	 * The function name.
	 */
	protected String functionName;
	
	/**
	 * List containg expressions used as arguments for the function call.
	 */
	protected List<Node> args;
	
	/**
	 * Constructor for a call to a function.
	 * 
	 * @param functionName The name of the function that is being called.
	 * @param arraySet The arguments for the function call.
	 */
	public FunctionCallNode(String functionName, Node arraySet) {
		this.description = "function_ref:" + functionName;
		
		this.functionName = functionName;
		this.args = arraySet.children;
		
		children.addAll(args);
	}
	
	@Override
	public void validate(Program p) throws NeptuneException {
		for(Node n: children) {
			n.validate(p);
		}
		
		IdEntry entry = p.symbolTable.retrieve("_" + functionName);
		
		if(entry == null) {
			throw new NeptuneException(this, "function does not exist");
		}
		this.functionRef = (FunctionDeclarationNode)entry.getDeclaringNode();
		
		if(functionRef.args.size() != args.size()) {
			throw new NeptuneException(this, "argument count doesn't match (" + args.size() + "!=" + functionRef.args.size() + ")");
		}
		
		for(int i = 0; i < args.size(); i++) {
			VarDeclarationNode declNode = (VarDeclarationNode)functionRef.args.get(i);
			if(!args.get(i).typeMatch(declNode.varType)) {
				throw new NeptuneException(this, "argument " + (i+1) + " does not match expected argument type (" + args.get(i).typeDescription() + "!=" + functionRef.args.get(i).typeDescription() + ")");
			}
		}
	}
	
	@Override
	public void generate(Program p, Map<String, Object> info) throws NeptuneException {
		IdEntry entry = p.symbolTable.retrieve("_" + functionName);
		
		for(int i = args.size()-1; i >= 0; i--) {
			args.get(i).resultIsUsed = true;
			args.get(i).generate(p, info);
		}
		
		p.add(Instruction.CALL_LABEL(Instruction.convertFunctionNameToLabel(functionName)));
		
		if(!resultIsUsed) {
			int elems = 1;
			if(entry.getDeclaringNode().isArray()) {
				elems=entry.getDeclaringNode().elemCount();
			}
			
			p.add(Instruction.POP(elems));
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
