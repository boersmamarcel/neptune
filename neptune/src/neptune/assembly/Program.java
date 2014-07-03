package neptune.assembly;

import java.util.ArrayList;
import java.util.List;

import neptune.SymbolTable;

public class Program {

	private List<Instruction> instructions;
	public SymbolTable symtab;
	public static boolean isFunctionCall = false;
	
	private List<Instruction> functionInstructions;
	
	private int instructionMarker = 0;
	
	public Program() {
		instructions = new ArrayList<Instruction>();
		functionInstructions = new ArrayList<Instruction>();
	}
	
	public void add(Instruction i) {
		instructionSet().add(i);
	}
	
	public void addMultiple(ArrayList<Instruction> instrs) {
		for(Instruction i: instrs) {
			add(i);
		}
	}
	
	public void assemble(int variableStackSize) {
		
		System.out.println("PUSH " + variableStackSize);
		
		for(Instruction i : instructions) {
			System.out.println(i);
		}
		
		System.out.println("POP(0) " + variableStackSize);
		System.out.println("HALT");
		
		for(Instruction i : functionInstructions) {
			System.out.println(i);
		}
	}
	
	public void markInstructionStart() {
		instructionMarker = instructionSet().size();
	}
	
	public ArrayList<Instruction> popLastInstructions() {
		
		ArrayList<Instruction> result = new ArrayList<Instruction>();
		int count = instructionSet().size();
		for(int i = instructionMarker; i < count; i++) {
			Instruction instr = instructionSet().get(instructionMarker);
			result.add(instr);
			instructionSet().remove(instructionMarker);		
		}
		
		return result;
	}
	
	private List<Instruction> instructionSet() {
		if(isFunctionCall) {
			return functionInstructions;
		}else{
			return instructions;
		}
	}
}