package fr.iutvalence.java.mp.themorpion;

/**
 * 
 * This class describes a player with his attributes
 * 
 * @author andrvale
 * 
 */

public class Player
{
    // TODO (think about it) this field seems useless
    /**
     * Identifier of the player (value = 1 or 2)
     */
    private int id;
    
    /**
     * Score of the player
     */
    private int score;

    // TODO (think about it) this field seems useless
    /**
     * mark is the field which represent the cross or the circle of the TTT game according to the constant corresponding
     * 
     */

    // TODO (fixed) document what values are allowed and what they mean
    private int mark;

    /**
     * The created player have an id, a score and a mark
     * @param id id is the identifiant of the player
     * @param score score is the score of the player
     * @param mark mark is the mark of the player
     */

    public Player(int id, int mark)
    {
        this.id = id;
        this.score = 0;
        this.mark = mark;
    }
    
    /**
     * Function allowing player to choose a position on the grid
     * @param x corresponding to row of choosen position
     * @param y corresponding to column of choosen position
     * return the number of the case choosen
     */

    /*
    public int ChoosePosition (int x, int y)
    {   
        Position_P = new Position(x,y);
        if ((Position_P.row == 1) and (Position_P.column ==1))
        {return 1};
        if ((Position_P.row == 1) and (Position_P.column ==2))
        {return 2};
        if ((Position_P.row == 1) and (Position_P.column ==3))
        {return 3};
        if ((Position_P.row == 2) and (Position_P.column ==1))
        {return 4};
        if ((Position_P.row == 2) and (Position_P.column ==2))
        {return 5};
        if ((Position_P.row == 2) and (Position_P.column ==3))
        {return 6};
        if ((Position_P.row == 3) and (Position_P.column ==1))
        {return 7};
        if ((Position_P.row == 3) and (Position_P.column ==2))
        {return 8};
        if ((Position_P.row == 3) and (Position_P.column ==3))
        {return 9};
        
    } */
}

