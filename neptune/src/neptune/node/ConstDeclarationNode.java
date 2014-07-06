package neptune.node;

import java.util.Map;

import neptune.IdEntry;
import neptune.NeptuneException;
import neptune.assembly.Instruction;
import neptune.assembly.Program;
import neptune.node.Node.type;

public class ConstDeclarationNode extends Node {

	protected String identifier;
	protected Node varType;
	protected Node expression;
	
	public ConstDeclarationNode(String identifier, Node type, Node expression) {
		this.description = "var:" + identifier;
		this.identifier = identifier;
		this.varType = type;
		this.expression = expression;
		
		children.add(type);
		children.add(expression);
	}
	
	public void validate(Program p) throws NeptuneException {
		varType.validate(p);
		expression.validate(p);

		if(!this.varType.typeMatch(expression)) {
			throw new NeptuneException(this, "type mismatch (" + expression.typeDescription() + "!=" + this.varType.typeDescription() + ")");
		}
		
		addToSymbolTable(p);
	}
	
	@Override
	public void generate(Program p, Map<String, Object> info) throws NeptuneException {
		expression.resultIsUsed = true;
		expression.generate(p, info);
		
		addToSymbolTable(p);
		
		IdEntry entry = p.symbolTable.retrieve(this.identifier);
		if(varType.isArray()) {
			for(int i = 0; i < varType.elemCount(); i++) {
				p.add(Instruction.STORE(entry.getAddress() + i));
			}
		}else{
			p.add(Instruction.STORE(entry.getAddress()));
		}
	}
	
	protected void addToSymbolTable(Program p) throws NeptuneException {
		varType.isMutable = false;
		IdEntry entry = new IdEntry(this.varType);
		try {
			p.symbolTable.enter(this.identifier, entry);
		} catch (Exception e) {
			throw new NeptuneException(this, "error while adding const to symbol table (" + e.getMessage() + ")");
		}
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
