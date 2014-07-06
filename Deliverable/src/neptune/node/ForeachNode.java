package neptune.node;

import java.util.List;
import java.util.Map;

import neptune.IdEntry;
import neptune.NeptuneException;
import neptune.assembly.Instruction;
import neptune.assembly.Program;

/**
 * Class representing a foreach logic statement.
 * 
 * @author Koen van Urk and Marcel Boersma.
 */
public class ForeachNode extends Node {

	/**
	 * Name of the referenced element.
	 */
	protected String elementRef;
	
	/**
	 * Name of the array that is used to loop through.
	 */
	protected String arrayRef;
	
	/**
	 * Node pointing to the array.
	 */
	protected Node array;
	
	/**
	 * Node pointing to the referenced element.
	 */
	protected Node element;
	
	/**
	 * Constructor for the foreach statement.
	 * 
	 * @param element Name of the element that contains a new value from the array each iteration.
	 * @param array Name of the array that is being walked through.
	 * @param lines Lines of code to execute every iteration.
	 */
	public ForeachNode(String element, String array, List<Node> lines) {
		this.description = "foreach";
		
		this.elementRef = element;
		this.arrayRef = array;
		children.addAll(lines);
	}
	
	@Override
	public void validate(Program p) throws NeptuneException {
		
		p.symbolTable.openScope();
		
		// Node elementType = new TypeNode(array.getType(), 0);
		// new VarDeclarationNode(element, elementType, null)
		
		array = p.symbolTable.retrieve(arrayRef).getDeclaringNode();
		Node elementType = new TypeNode(array.getType(), 0);
		element = new VarDeclarationNode(elementRef, elementType, null);
		
		if(array.getType() == type.VOID) {
			throw new NeptuneException(this, "iterated element cannot be void");
		}
		
		if(!array.isArray()) {
			throw new NeptuneException(this, "iterated element should be array (" + array.description + ")");
		}
		
		element.validate(p);
		
		for(Node n: children) {
			n.validate(p);
		}
		
		p.symbolTable.closeScope();
	}

	@Override
	public void generate(Program p, Map<String, Object> info) throws NeptuneException {
		p.symbolTable.openScope();
		
		p.add(Instruction.LOADL(0));
		
		int startLabel = p.generateLabel();
		int endLabel = p.generateLabel();
		
		p.add(Instruction.LABEL(startLabel));
		
		element.generate(p, info);
		
		IdEntry elementEntry = p.symbolTable.retrieve(elementRef);
		IdEntry arrayEntry = p.symbolTable.retrieve(arrayRef);
		
		// Load counter and start address of array
		p.add(Instruction.LOAD_ST(1));
		p.add(Instruction.LOADA(arrayEntry.getAddress()));
		p.add(Instruction.ADD());
		
		// Load value from address of array element
		p.add(Instruction.LOADI(1));
		
		// Store into variable for use in the loop
		p.add(Instruction.STORE(elementEntry.getAddress()));
		
		for(Node n: children) {
			n.resultIsUsed = false;
			n.generate(p, info);
		}
		
		// Increment the counter, then duplicate
		p.add(Instruction.INC());
		p.add(Instruction.LOAD_ST(1));
		
		// Exit the loop by jumping if we have seen all elements
		p.add(Instruction.JUMPIF(array.elemCount(), endLabel));
		p.add(Instruction.JUMP(startLabel));
		p.add(Instruction.LABEL(endLabel));
		
		// Remove counter from the stack
		p.add(Instruction.POP(1));
		
		p.symbolTable.closeScope();
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
