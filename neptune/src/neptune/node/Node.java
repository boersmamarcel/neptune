package neptune.node;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import neptune.NeptuneException;
import neptune.assembly.Program;

/**
 * Abstract class that is used as the base of all other nodes.
 * 
 * @author Koen van Urk and Marcel Boersma
 */
public abstract class Node {

	/**
	 * Enum that defines all types of the Neptune language.
	 * 
	 * @author Koen van Urk and Marcel Boersma
	 */
	public enum type {
		VOID, INTEGER, CHAR, BOOL
	}
	
	/**
	 * 
	 */
	protected List<Node> children = new ArrayList<Node>();
	
	/**
	 * 
	 */
	protected type primitive = type.VOID;
	/**
	 * 
	 */
	protected boolean isArray = false;
	/**
	 * 
	 */
	protected boolean isMutable = false;
	/**
	 * 
	 */
	protected boolean resultIsUsed = false;
	/**
	 * 
	 */
	protected int elemCount = 0;
	/**
	 * 
	 */
	public String description;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return description + " ( " + children.toString() + " ) ";
	}
	
	/**
	 * @param p
	 * @throws NeptuneException
	 */
	public abstract void validate(Program p) throws NeptuneException;
	
	/**
	 * @param p
	 * @param info
	 * @throws NeptuneException
	 */
	public abstract void generate(Program p, Map<String, Object> info) throws NeptuneException;
	
	/**
	 * @param node
	 * @return
	 */
	public boolean typeMatch(Node node) {
		
		boolean eType = node.getType() == this.getType();
		boolean eArray = node.isArray() == this.isArray();
		boolean eCount = node.elemCount() == this.elemCount();
		boolean intOrChar = (node.getType() == type.INTEGER && this.getType() == type.CHAR);
		boolean charOrInt = (node.getType() == type.CHAR && this.getType() == type.INTEGER);
		
		return (eType || intOrChar || charOrInt) && eArray && eCount;
	}
	
	/**
	 * @return
	 */
	public abstract type getType();
	/**
	 * @return
	 */
	public abstract boolean isArray();
	/**
	 * @return
	 */
	public abstract boolean isMutable();
	/**
	 * @return
	 */
	public abstract int elemCount();
	
	/**
	 * @return
	 */
	public String typeDescription() {
		if(isArray()) {
			return getType() + "[" + elemCount() + "]";
		}else{
			return "" + getType();
		}
	}
	
}
