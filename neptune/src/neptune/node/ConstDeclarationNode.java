package neptune.node;

import java.util.Map;

import neptune.IdEntry;
import neptune.NeptuneException;
import neptune.assembly.Instruction;
import neptune.assembly.Program;

/**
 * Class representing the declaration of a constant.
 * 
 * @author Koen van Urk and Marcel Boersma
 */
public class ConstDeclarationNode extends Node {

	/**
	 * Identifier for the constant.
	 */
	protected String identifier;
	
	/**
	 * Node defining the type of the constant.
	 */
	protected Node varType;
	
	/**
	 * Expression that is assigned to the constant.
	 */
	protected Node expression;
	
	/**
	 * Constructor for a constant declaration.
	 * 
	 * @param identifier The identifier for this constant.
	 * @param type The type node for this constant.
	 * @param expression Expression to be assigned to the constant.
	 */
	public ConstDeclarationNode(String identifier, Node type, Node expression) {
		this.description = "var:" + identifier;
		this.identifier = identifier;
		this.varType = type;
		this.expression = expression;
		
		children.add(type);
		children.add(expression);
	}
	
	@Override
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
