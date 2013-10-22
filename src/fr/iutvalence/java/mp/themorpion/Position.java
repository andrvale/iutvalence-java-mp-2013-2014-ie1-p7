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
    // TODO (fix) this is not a constant
    /**
     * Constant corresponding row of the grid
     */
    private int row;

    // TODO (fix) this is not a constant
    /**
     * Constant corresponding column of the grid
     */
    private int column;

    // TODO (fix) function who or doctor Who?
    /**
     * Function who
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

    // TODO (fix) finish writing comment
    /**
     * Return row of position
     */
    public int getRow()
    {
        return this.row;
    }

    /**
     * Return column of position
     */
    // TODO (fix) finish writing comment
    public int getColumn()
    {
        return this.column;

    }
}
