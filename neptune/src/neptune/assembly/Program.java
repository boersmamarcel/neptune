package neptune.assembly;

import java.util.ArrayList;
import java.util.List;

import neptune.SymbolTable;

public class Program {

	private List<Instruction> instructions;
	public SymbolTable symtab;
	
	private int instructionMarker = 0;
	
	public Program() {
		instructions = new ArrayList<Instruction>();
	}
	
	public void add(Instruction i) {
		instructions.add(i);
	}
	
	public void addMultiple(ArrayList<Instruction> instrs) {
		for(Instruction i: instrs) {
			instructions.add(i);
		}
	}
	
	public void assemble(int variableStackSize) {
		
		System.out.println("PUSH " + variableStackSize);
		
		for(Instruction i : instructions) {
			System.out.println(i);
		}
		
		System.out.println("POP(0) " + variableStackSize);
		System.out.println("HALT");
	}
	
	public void markInstructionStart() {
		instructionMarker = instructions.size();
	}
	
	public ArrayList<Instruction> popLastInstructions() {
		
		ArrayList<Instruction> result = new ArrayList<Instruction>();
		int count = instructions.size();
		for(int i = instructionMarker; i < count; i++) {
			Instruction instr = instructions.get(instructionMarker);
			result.add(instr);
			instructions.remove(instructionMarker);		
		}
		
		return result;
	}
	
}