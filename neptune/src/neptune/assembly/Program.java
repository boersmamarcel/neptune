package neptune.assembly;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import neptune.SymbolTable;

public class Program {

	private List<Instruction> instructions;
	public SymbolTable symbolTable = new SymbolTable();
	public static boolean isFunctionCall = false;
	public static String definingFunction = "";
	protected int labelCounter = 0;
	
	private List<Instruction> functionInstructions;
	
	protected Stack<Integer> popStack;
	
	public Program() {
		instructions = new ArrayList<Instruction>();
		functionInstructions = new ArrayList<Instruction>();
		popStack = new Stack<Integer>();
	}
	
	public void add(Instruction i) {
		instructionSet().add(i);
	}
	
	public void addMultiple(ArrayList<Instruction> instrs) {
		for(Instruction i: instrs) {
			add(i);
		}
	}
	
	public void assemble() {
		
		System.out.println("PUSH " + symbolTable.getLargestSize());
		
		for(Instruction i : instructions) {
			System.out.println(i);
		}
		
		System.out.println("POP(0) " + symbolTable.getLargestSize());
		System.out.println("HALT");
		
		for(Instruction i : functionInstructions) {
			System.out.println(i);
		}
		
		System.out.println("valid0: LOAD(1) -2[LB]");
		System.out.println("LOAD(1) -1[LB]");
		System.out.println("CALL ge");
		System.out.println("JUMPIF(0) valid1[CB]");
		System.out.println("LOADL 83");
		System.out.println("LOADL 68");
		System.out.println("LOADL 78");
		System.out.println("LOADL 85");
		System.out.println("LOADL 79");
		System.out.println("LOADL 66");
		System.out.println("LOADL 32");
		System.out.println("LOADL 70");
		System.out.println("LOADL 79");
		System.out.println("LOADL 32");
		System.out.println("LOADL 84");
		System.out.println("LOADL 85");
		System.out.println("LOADL 79");
		System.out.println("CALL put");
		System.out.println("CALL put");
		System.out.println("CALL put");
		System.out.println("CALL put");
		System.out.println("CALL put");
		System.out.println("CALL put");
		System.out.println("CALL put");
		System.out.println("CALL put");
		System.out.println("CALL put");
		System.out.println("CALL put");
		System.out.println("CALL put");
		System.out.println("CALL put");
		System.out.println("CALL put");
		System.out.println("HALT");
		System.out.println("valid1: RETURN(0) 2");
	}
	
	public void markInstructionStart() {
		popStack.add(instructionSet().size());
	}
	
	public ArrayList<Instruction> popLastInstructions() {
		
		ArrayList<Instruction> result = new ArrayList<Instruction>();
		int count = instructionSet().size();
		
		int instructionMarker = popStack.pop();
		
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
	
	public int generateLabel() {
		return labelCounter++;
	}
}