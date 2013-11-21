package fr.iutvalence.java.mp.themorpion;

/**
 * 
 * This class describes a position
 * 
 * @author andrvale
 * 
 */

public class Position
{
    /**
     * row of the position
     */
    private int row;

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
    public int getColumn()
    {
        return this.column;

    }

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
