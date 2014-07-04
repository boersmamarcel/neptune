package neptune.assembly;

import java.util.List;
import java.util.ArrayList;

public class Sequence { // implements Instruction {
	
	protected List<Instruction> instructions;
	
	public Sequence() {
		instructions = new ArrayList<Instruction>();
	}
	
	
	public String toString() {
		String result = new String();
		for(Instruction i: instructions) {
			result = result + i;
		}
		
		return result;
	}
	
}
