package neptune;
import neptune.node.Node;

import org.antlr.runtime.RecognitionException;

/**
 * Exception thrown by the Neptune validator.
 * 
 * @author Koen van Urk and Marcel Boersma
 */
public class NeptuneException extends RecognitionException {
    /**
     * The message for this exception. 
     */
    private String msg;
    
    /**
     * Used for Serializible.
     */
    public static final long serialVersionUID = 24162462L; // for Serializable

    /**
     * Constructor for a Neptune exception without a node.
     * 
     * @param msg Message for this exception.
     */
    public NeptuneException(String msg) {
        super();
        this.msg = msg;
    }
    
    /**
     * Constructor for a Neptune exception belonging to a specific node.
     * 
     * @param node The node that throws this exception
     * @param msg Message for this exception.
     */
    public NeptuneException(Node node, String msg) {
    	super();
    	this.msg = node.description + " --> " + msg;
    }

    @Override
    public String getMessage() {
        return this.msg;
    }
}
