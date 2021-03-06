package neptune.node;

import java.util.Map;

import neptune.IdEntry;
import neptune.NeptuneException;
import neptune.assembly.Instruction;
import neptune.assembly.Program;

/**
 * 
 * Class representing the VarIndexedNode
 * 
 * @author Koen van Urk and Marcel Boersma
 *
 */
public class VarIndexedNode extends Node {

	/**
	 * Name of the referenced variable
	 */
	protected String elementRef;
	
	/**
	 * The referenced node
	 */
	protected Node element;
	
	/**
	 * Element pointer in the reference variable
	 */
	protected Node expression;
	
	/**
	 * Constructor of the VarIndexNode
	 * @param element element name
	 * @param expression element expression
	 */
	public VarIndexedNode(String element, Node expression) {
		this.description = "index_ref:" + element;
		elementRef = element;
		this.expression = expression;
	}
	
	@Override
	public void validate(Program p) throws NeptuneException {
		IdEntry entry = p.symbolTable.retrieve(elementRef);
		
		if(Program.isFunctionCall && !entry.isDefinedInFunction()) {
			throw new NeptuneException(this, "cannot use global variables from within functions");
		}
		
		expression.validate(p);
		
		if(entry == null) {
			throw new NeptuneException(this, "variable used but not declared");
		}
		
		if(!entry.getDeclaringNode().isArray()) {
			throw new NeptuneException(this, "used with index, but is not an array");
		}
		
		if(expression.getType() != type.INTEGER) {
			throw new NeptuneException(this, "index into variable should be integer type (" + expression.typeDescription() + "," + expression + ")");
		}
		
		if(expression.isArray()) {
			throw new NeptuneException(this, "index into variable should not be an array");
		}
		
		element = entry.getDeclaringNode();
	}
	
	@Override
	public void generate(Program p, Map<String, Object> info) throws NeptuneException {

		IdEntry entry = p.symbolTable.retrieve(this.elementRef);
		
		if(info == null || info.get("instruction") == null || (!info.get("instruction").equals("store") && !info.get("instruction").equals("address"))) {
			
			// First confirm that the index is not out of bounds
			expression.resultIsUsed = true;
			expression.generate(p, null);
			p.add(Instruction.LOADL(entry.getDeclaringNode().elemCount()));
			p.add(Instruction.CALL_LABEL("valid0"));
			
			// Next load the address and using that the value onto the stack if it is used
			
			if(resultIsUsed) {
				p.add(Instruction.LOADA(entry.getAddress()));
				expression.generate(p, null);
				p.add(Instruction.ADD());
				p.add(Instruction.LOADI(1));
			}
		} else {
			expression.resultIsUsed = true;
			expression.generate(p, null);
			p.add(Instruction.LOADL(entry.getDeclaringNode().elemCount()));
			p.add(Instruction.CALL_LABEL("valid0"));
			
			p.add(Instruction.LOADA(entry.getAddress()));
			expression.resultIsUsed = true;
			expression.generate(p, null);
			p.add(Instruction.ADD());
			
			if(info.get("instruction").equals("store")) {
				p.add(Instruction.STOREI(1));
			}
		}
	}
	
	@Override
	public type getType() {
		if(element != null) {
			return element.getType();
		}
		
		return type.VOID;
	}

	@Override
	public boolean isArray() {
		return false;
	}

	@Override
	public boolean isMutable() {
		if(element != null) {
			return element.isMutable();
		}
		
		return false;
	}

	@Override
	public int elemCount() {
		return 0;
	}

}
