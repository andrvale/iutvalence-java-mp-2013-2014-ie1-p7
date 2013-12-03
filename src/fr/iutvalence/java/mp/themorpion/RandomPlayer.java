package fr.iutvalence.java.mp.themorpion;

import java.util.Random;

// TODO (fix) detail comment
/**
 * 
 * This class describes a player with his attributes
 * 
 * @author andrvale
 * 
 */

public class RandomPlayer implements Player
{    
    /**
     * @see fr.iutvalence.java.mp.themorpion.Player#askPosition()
     */
    public Position askPosition()
    {
        Random rand = new Random();
        return new Position(rand.nextInt(TicTacToe.NUMBER_OF_LINES), rand.nextInt(TicTacToe.NUMBER_OF_COLUMNS));
    }
}
