package fr.iutvalence.java.mp.themorpion;

/**
 * 
 * This class describes positionning on the grid
 * 
 * @author andrvale
 * 
 */

public class Position
{
    // TODO (fixed) this is not a constant
    /**
     * integer corresponding number of row of the grid
     */
    private int row;

    // TODO (fixed) this is not a constant
    /**
     * integer corresponding number of column of the grid
     */
    private int column;
    
    /**
     * Constructor of position class
     */
    public Position()
    {
        
    }

    // TODO (fixed) function who or doctor Who?
    /**
     * Constructor of position class with over-parameters
     * 
     * @param x
     *            x who correspond to row
     * @param y
     *            y who correspond to column
     */
    public Position(int x, int y)
    {
        this.row = x;
        this.column = y;
    }

    // TODO (fixed) finish writing comment
    /**
     * @return integer corresponding to row of position
     */
    public int getRow()
    {
        return this.row;
    }

    /**
     * @return integer corresponding to column of position
     */
    // TODO (fixed) finish writing comment
    public int getColumn()
    {
        return this.column;

    }
   
    /**
     * Redefinition of toString
     * @return String
     */
    public String toString()
    {
        return "(" + this.row + "," + this.column + ")";
    }
}
