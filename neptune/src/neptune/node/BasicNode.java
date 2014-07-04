package neptune.node;

import java.util.List;

public class BasicNode extends Node {

	public BasicNode(String description, List<Node> children) {
		this.description = description;
		this.children = children;
	}
	
	public BasicNode(String description, Node child) {
		this.description = description;
		children.add(child);
	}
	
	public BasicNode(String description) {
		this.description = description;
	}
	
	@Override
	public type getType() {
		if(children.size() > 0) {
			return children.get(0).getType();
		}
		
		return type.VOID;
	}

	@Override
	public boolean isArray() {
		if(children.size() > 0) {
			return children.get(0).isArray();
		}
		
		return false;
	}
	
	@Override
	public boolean isMutable() {
		if(children.size() > 0) {
			return children.get(0).isMutable();
		}
		
		return false;
	}

	@Override
	public int elemCount() {
		if(children.size() > 0) {
			return children.get(0).elemCount();
		}
		
		return 0;
	}

}
