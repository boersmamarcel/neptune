package neptune.node;

import java.util.Map;

import neptune.IdEntry;
import neptune.NeptuneException;
import neptune.assembly.Instruction;
import neptune.assembly.Program;

public class VarNode extends Node {

	protected String elementRef;
	protected Node element;
	
	public VarNode(String element) {
		this.description = "ref:" + element;
		elementRef = element;
	}
	
	public void validate(Program p) throws NeptuneException {
		IdEntry entry = p.symbolTable.retrieve(elementRef);
		
		if(Program.isFunctionCall && !entry.isDefinedInFunction()) {
			throw new NeptuneException(this, "cannot use global variables from within functions");
		}
		
		if(entry == null) {
			throw new NeptuneException(this, "variable used but not declared");
		}
		
		element = entry.getDeclaringNode();
	}
	
	@Override
	public void generate(Program p, Map<String, Object> info) throws NeptuneException {

		IdEntry entry = p.symbolTable.retrieve(this.elementRef);
		
		if(info == null || info.get("instruction") == null || (!info.get("instruction").equals("store") && !info.get("instruction").equals("address"))) {
			if(resultIsUsed) {
				if(element.isArray()) {

					// Load in reverse order
					for(int i = element.elemCount() - 1; i >= 0; i--) {
						p.add(Instruction.LOAD(entry.getAddress() + i));
					}
				}else{
					p.add(Instruction.LOAD(entry.getAddress()));
				}
			}
		} else if(info.get("instruction").equals("store")) {
			if(element.isArray()) {
				for(int i = 0; i < element.elemCount(); i++) {
					p.add(Instruction.STORE(entry.getAddress() + i));
				}
			}else{
				p.add(Instruction.STORE(entry.getAddress()));
			}
		} else if(info.get("instruction").equals("address")) {
			p.add(Instruction.LOADA(entry.getAddress()));
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
		if(element != null) {
			return element.isArray();
		}
		
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
		if(element != null) {
			return element.elemCount();
		}
		
		return 0;
	}

}
