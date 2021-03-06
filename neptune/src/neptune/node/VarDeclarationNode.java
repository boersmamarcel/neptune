package neptune.node;

import java.util.Map;

import neptune.IdEntry;
import neptune.NeptuneException;
import neptune.assembly.Instruction;
import neptune.assembly.Program;

/**
 * Class representation of a variable declaration.
 * 
 * @author Koen van Urk and Marcel Boersma
 */
public class VarDeclarationNode extends Node {

	/**
	 * Identifier name
	 */
	protected String identifier;
	
	/**
	 * Node type
	 */
	protected Node varType;
	
	/**
	 * Assignment value for the variable
	 */
	protected Node expression;
	
	/**
	 * Constructor of the VarDeclarationNode 
	 * @param identifier name
	 * @param type	node type
	 * @param expression value of the variable
	 */
	public VarDeclarationNode(String identifier, Node type, Node expression) {
		this.description = "var:" + identifier;
		this.identifier = identifier;
		this.varType = type;
		this.expression = expression;
		
		children.add(type);
		children.add(expression);
	}
	
	@Override
	public void validate(Program p) throws NeptuneException {
		if(expression != null) {
			expression.validate(p);

			if(!this.varType.typeMatch(expression)) {
				throw new NeptuneException(this, "type mismatch (" + expression.typeDescription() + "!=" + this.varType.typeDescription() + ")");
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

				if(varType.isArray()) {
					for(int i = 0; i < varType.elemCount(); i++) {
						p.add(Instruction.STORE(entry.getAddress() + i));
					}
				}else{
					p.add(Instruction.STORE(entry.getAddress()));
				}
			}
		} else {
			if(varType.isArray()) {
				for(int i = 0; i < varType.elemCount(); i++) {
					p.add(Instruction.STORE(entry.getAddress() + i));
				}
			}else{
				p.add(Instruction.STORE(entry.getAddress()));
			}
		}
	}
	
	/**
	 * Helper method to add this node to the symbol table.
	 * 
	 * @param p Program that is being processed.
	 * @throws NeptuneException Throws an exception if an error occurs when adding the node to the symbol table.
	 */
	protected void addToSymbolTable(Program p) throws NeptuneException {
		varType.isMutable = true;
		IdEntry entry = new IdEntry(this.varType);
		
		try {
			p.symbolTable.enter(this.identifier, entry);
		} catch (Exception e) {
			throw new NeptuneException(this, "error while adding var to symbol table (" + e.getMessage() + ")");
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
