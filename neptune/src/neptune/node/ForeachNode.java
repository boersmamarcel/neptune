package neptune.node;

import java.util.List;

import neptune.NeptuneException;
import neptune.assembly.Program;

public class ForeachNode extends Node {

	protected String elementRef;
	protected String arrayRef;
	
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
		
		Node array = p.symbolTable.retrieve(arrayRef).getTypeNode();
		Node elementType = new TypeNode(array.getType(), 0);
		Node element = new VarDeclarationNode(elementRef, elementType, null);
		
		if(array.getType() == type.VOID) {
			throw new NeptuneException(this.description + ": iterated element cannot be void");
		}
		
		if(!array.isArray()) {
			throw new NeptuneException(this.description + ": iterated element should be array (" + array.description + ")");
		}
		
		element.validate(p);
		super.validate(p);
		p.symbolTable.closeScope();
	}

	@Override
	public void generate(Program p) {
		p.symbolTable.openScope();
		super.generate(p);
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
