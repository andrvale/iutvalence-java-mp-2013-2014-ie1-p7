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
    /**
     * Constant corresponding row of the grid
     */
    private int row;
    /**
     * Constant corresponding column of the grid
     */
    private int column;
    
    /**
     * Function who 
     * @param x x who correspond to row
     * @param y y who correspond to column
     */
    public Position(int x, int y)
    {
        this.row = x;
        this.column = y;
        
    }
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
    
    public int getColumn()
    {
        return this.column;
        
        
    }
    }
