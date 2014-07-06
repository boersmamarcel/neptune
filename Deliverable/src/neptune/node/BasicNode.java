package neptune.node;

import java.util.List;
import java.util.Map;

import neptune.NeptuneException;
import neptune.assembly.Program;

/**
 * Generic container node used for top level nodes without functionality.
 * 
 * @author Koen van Urk and Marcel Boersma
 */
public class BasicNode extends Node {

	
	/**
	 * Constructor for BasicNode with a description and a list of child nodes.
	 * 
	 * @param description Description for this node.
	 * @param children List containing the children for this node.
	 */
	public BasicNode(String description, List<Node> children) {
		this.description = description;
		this.children = children;
	}
	
	/**
	 * Constructor for BasicNode with a description and a single child node.
	 * 
	 * @param description Description for this node.
	 * @param child Child node.
	 */
	public BasicNode(String description, Node child) {
		this.description = description;
		children.add(child);
	}
	
	/**
	 * Constructor for BasicNode with a description and no child nodes.
	 * 
	 * @param description Description for this node.
	 */
	public BasicNode(String description) {
		this.description = description;
	}
	
	@Override
	public void validate(Program p) throws NeptuneException {
		for(Node n: children) {
			n.validate(p);
		}
	}
	
	@Override
	public void generate(Program p, Map <String, Object> info) throws NeptuneException {
		for(Node n: children) {
			n.resultIsUsed = this.resultIsUsed;
			n.generate(p, info);
		}
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
