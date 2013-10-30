package fr.iutvalence.java.mp.themorpion;

// TODO (fix) rewrite comment (more generic)
/**
 * 
 * This class describes positionning on the grid
 * 
 * @author andrvale
 * 
 */

public class Position
{
    // TODO (fix) rewrite comment (wrong description)
    /**
     * integer corresponding number of row of the grid
     */
    private int row;

    // TODO (fix) rewrite comment (wrong description)
    /**
     * integer corresponding number of column of the grid
     */
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

    // TODO (fix) finish writing comment (missing general description)
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
    // TODO (fix) finish writing comment (missing general description)
    public int getColumn()
    {
        return this.column;

    }

    // TODO (fix) finish writing comment (say what the string looks like)
    /**
     * Redefinition of toString
     * 
     * @return String
     */
    public String toString()
    {
        return "(" + this.row + "," + this.column + ")";
    }
}
