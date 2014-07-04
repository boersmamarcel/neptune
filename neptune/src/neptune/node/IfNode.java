package neptune.node;

import java.util.List;

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
