package neptune.node;

import java.util.Map;

import neptune.IdEntry;
import neptune.NeptuneException;
import neptune.assembly.Instruction;
import neptune.assembly.Program;

public class VarDeclarationNode extends Node {

	protected String identifier;
	protected Node type;
	protected Node expression;
	
	public VarDeclarationNode(String identifier, Node type, Node expression) {
		this.description = "var:" + identifier;
		this.identifier = identifier;
		this.type = type;
		this.expression = expression;
		
		children.add(type);
		children.add(expression);
	}
	
	public void validate(Program p) throws NeptuneException {
		if(expression != null) {
			expression.validate(p);

			if(!this.typeMatch(expression)) {
				throw new NeptuneException(this, "type mismatch (" + expression.typeDescription() + "!=" + this.typeDescription() + ")");
			}
		}
		
		addToSymbolTable(p);
	}
	
	@Override
	public void generate(Program p, Map<String, Object> info) throws NeptuneException {
		addToSymbolTable(p);

		IdEntry entry = p.symbolTable.retrieve(this.identifier);
		
		if(info == null || info.get("instruction") == null || !info.get("instruction").equals("store")) {
		
			if(expression != null) {
				expression.resultIsUsed = true;
				expression.generate(p, info);

				if(type.isArray()) {
					for(int i = 0; i < type.elemCount(); i++) {
						p.add(Instruction.STORE(entry.getAddress() + i));
					}
				}else{
					p.add(Instruction.STORE(entry.getAddress()));
				}
			}
		} else {
			if(type.isArray()) {
				for(int i = 0; i < type.elemCount(); i++) {
					p.add(Instruction.STORE(entry.getAddress() + i));
				}
			}else{
				p.add(Instruction.STORE(entry.getAddress()));
			}
		}
	}
	
	protected void addToSymbolTable(Program p) throws NeptuneException {
			IdEntry entry = new IdEntry(this);
		
		try {
			p.symbolTable.enter(this.identifier, entry);
		} catch (Exception e) {
			throw new NeptuneException(this, "error while adding var to symbol table (" + e.getMessage() + ")");
		}
	}
	
	@Override
	public type getType() {
		return this.type.getType();
	}

	@Override
	public boolean isArray() {
		return this.type.isArray();
	}
	
	@Override
	public boolean isMutable() {
		return true;
	}

	@Override
	public int elemCount() {
		return this.type.elemCount();
	}

}
