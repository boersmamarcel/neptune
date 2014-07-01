package neptune.assembly;

import neptune.Type;

public class Instruction {

	public boolean producesResult;
	public boolean usesResult;
	public String code;
	public String label = null;
	
	public Instruction(String code, boolean producesResult, boolean usesResult) {
		this.code = code;
		this.producesResult = producesResult;
		this.usesResult = usesResult;
	}
	
	public String toString() {
		if(label != null) {
			return label + ": " + code;
		}else{
			return code;
		}
	}
	
	public static Instruction STORE(int address, Type type) {
		String instr = "STORE(";
		instr = instr + 1; // all types have word length 1
		instr = instr + ") " + address + "[SB]";
		
		return new Instruction(instr, false, true);
	}
	
	public static Instruction LOAD(int address, Type type) {
		String instr = "LOAD(";
		instr = instr + 1; // all types have word length 1
		instr = instr + ") " + address + "[SB]";
		
		return new Instruction(instr, true, false);
	}
	
	public static Instruction LOADL(int value) {
		String instr = "LOADL " + value;
		
		return new Instruction(instr, true, false);
	}
	
	public static Instruction ADD() {
		String instr = "CALL add";
		
		return new Instruction(instr, true, true);
	}
	
	public static Instruction SUB() {
		String instr = "CALL sub";
		
		return new Instruction(instr, true, true);
	}
	
	public static Instruction MULT() {
		String instr = "CALL mult";
		
		return new Instruction(instr, true, true);
	}
	
	public static Instruction DIV() {
		String instr = "CALL div";
		
		return new Instruction(instr, true, true);
	}
	
	public static Instruction PRINT(Type type) {
		
		String instr;
		
		if(type.type == Type.primitive.CHAR) {
			instr = "CALL put";
		}else{
			instr = "CALL putint";
		}
		
		return new Instruction(instr, false, true);
	}
	
	public static Instruction LABEL(int labelNumber) {
		Instruction instr = new Instruction("", false, false);
		instr.label = "L" + labelNumber;
		
		return instr;
	}
	
	public static Instruction LABEL(String str){
		Instruction instr = new Instruction("", false, false);
		instr.label = str;
		
		return instr;
	}
	
	public static Instruction JUMP(int labelNumber) {
		return new Instruction("JUMP L" + labelNumber + "[CB]", false, false);
	}
	
	public static Instruction JUMP(String labelNumber) {
		return new Instruction("JUMP " + labelNumber + "[CB]", false, false);
	}
	
	public static Instruction JUMPIF(int value, int labelNumber) {
		return new Instruction("JUMPIF(" + value + ") L" + labelNumber + "[CB]", false, false);
	}
	
	public static Instruction BINARY(String operatorType) {
		return new Instruction("CALL " + operatorType, true, true);
	}
	
	public static Instruction READ(Type type){
		if(type.type.equals(Type.primitive.CHAR)){
			return new Instruction("CALL get",true, false);
		}else{
			return new Instruction("CALL getint", true, false);
		}
	}

	public static Instruction RETURN(Type type, int pop_n_word){
		return new Instruction("RETURN(1) "+pop_n_word, true, true);
	}
}
