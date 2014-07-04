package neptune.node;

import java.util.List;

public class ArraySetNode extends Node {

	public ArraySetNode(List<Node> elements) {
		children = elements;
	}
	
	@Override
	public type getType() {
		return children.get(0).getType();
	}

	@Override
	public boolean isArray() {
		return true;
	}

	@Override
	public boolean isMutable() {
		return false;
	}

	@Override
	public int elemCount() {
		return children.size();
	}

}
