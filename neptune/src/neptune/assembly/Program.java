package neptune.assembly;

import java.util.ArrayList;
import java.util.List;

import neptune.SymbolTable;

public class Program {

	private List<Instruction> instructions;
	public SymbolTable symtab;
	
	public Program() {
		instructions = new ArrayList<Instruction>();
	}
	
	public void add(Instruction i) {
		instructions.add(i);
	}
	
	public void assemble(int variableStackSize) {
		
		System.out.println("PUSH " + variableStackSize);
		
		for(Instruction i : instructions) {
			System.out.println(i);
		}
		
		System.out.println("POP(0) " + variableStackSize);
		System.out.println("HALT");
	}
	
}
