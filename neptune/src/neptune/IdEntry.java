package neptune;

/**
 * VB prac week1 - SymbolTable.
 * class IdEntry.
 * @author   Theo Ruys
 * @version  2006.04.21
 */
public class IdEntry {
    private int  level = -1;
    private int  address = -1;
 
    public IdEntry(int addr) {
    	this.address = addr;
    }
    
    public int   getLevel()             { return this.level;    }
    public void  setLevel(int level)    { this.level = level;   }
    
    public int getAddress() { return this.address; }
}
