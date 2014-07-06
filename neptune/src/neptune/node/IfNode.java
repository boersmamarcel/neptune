package neptune.node;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import neptune.NeptuneException;
import neptune.assembly.Instruction;
import neptune.assembly.Program;

public class IfNode extends Node {

	protected List<Node> blocks;
	protected Node elseNode;
	
	public IfNode(List<Node> blocks, Node elseNode) {
		this.description = "if-statement";
		
		this.blocks = blocks;
		this.elseNode = elseNode;
		
		children.addAll(blocks);
		if(elseNode != null) {
			children.add(elseNode);
		}
	}
	
	@Override
	public void validate(Program p) throws NeptuneException {
		for(Node n: children) {
			n.validate(p);
		}
	}
	
	@Override
	public void generate(Program p, Map<String, Object> info) throws NeptuneException {
		
		int endLabel = p.generateLabel();
		int nextLabel = p.generateLabel();
		
		for(int i = 0; i < blocks.size(); i++) {
			p.add(Instruction.LABEL(nextLabel));
			nextLabel = p.generateLabel();
			
			children.get(i).resultIsUsed = false;
			
			// notify the if or elsif block about the next statement
			// in case the expression evaluates to false
			Map<String, Object> labelInfo = new HashMap<String, Object>();
			labelInfo.put("next_label", nextLabel);
			
			// generate the block code
			children.get(i).generate(p, labelInfo);
			
			// this is executed only if the block expression evaluated to true
			// and we should jump to the end
			p.add(Instruction.JUMP(endLabel));
		}
		
		p.add(Instruction.LABEL(nextLabel));
		
		if(elseNode != null) {
			elseNode.resultIsUsed = false;
			elseNode.generate(p, info);
		}
		
		p.add(Instruction.LABEL(endLabel));
		
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
