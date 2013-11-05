package fr.iutvalence.java.mp.themorpion;

// TODO (fixed) rewrite comment (more generic)
/**
 * 
 * This class describes a position
 * 
 * @author andrvale
 * 
 */

public class Position
{
    // TODO (fixed) rewrite comment (wrong description)
    /**
     * row of the position
     */
    private int row;

    // TODO (fixed) rewrite comment (wrong description)
    /**
     * 
     * column of the position    
     *  */
    private int column;

    /**
     * Constructor of position class with over-parameters
     * 
     * @param row
     *            x who correspond to row
     * @param column
     *            y who correspond to column
     */
    public Position(int row, int column)
    {
        this.row = row;
        this.column = column;
    }

    // TODO (fixed) finish writing comment (missing general description)
    /**
     * Return row of position
     * @return integer corresponding to row of position
     */
    public int getRow()
    {
        return this.row;
    }

    /**
     * Return column of position
     * @return integer corresponding to column of position
     */
    // TODO (fixed) finish writing comment (missing general description)
    public int getColumn()
    {
        return this.column;

    }

    // TODO (fixed) finish writing comment (say what the string looks like)
    /**
     * Redefinition of toString
     * example : (row,column)
     * 
     * @return String
     */
    public String toString()
    {
        return "(" + this.row + "," + this.column + ")";
    }
}
