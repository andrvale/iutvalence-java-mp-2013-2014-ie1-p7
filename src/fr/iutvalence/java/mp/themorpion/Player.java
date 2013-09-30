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
     * pion is the attribute which represent the cross or the circle of the TTT
     * game
     * 
     */
    // TODO (
    // TODO (fix) rename field (mark)
    // TODO (fix) document what values are allowed and what they mean
    private int pion;

    // TODO (fix) simplify comment, describe what the player looks like once created
    // TODO (fix) document parameters
    /**
     * This is the constructor of the class Player which takes 2 parameters :
     * the id of the player and the shape of his token
     * 
     * @param id
     * @param score
     * @param pion
     */

    Player(int id, int pion)
    {
        this.id = id;
        this.score = 0;
        this.pion = pion;
    }
}
