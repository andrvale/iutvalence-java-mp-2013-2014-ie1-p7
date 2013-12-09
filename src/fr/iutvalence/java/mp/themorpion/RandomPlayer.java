package fr.iutvalence.java.mp.themorpion;

import java.util.Random;

// TODO (fixed) detail comment
/**
 * 
 * @author André Valentin
 *         Lamine SERRADJ
 * This class represents a random player implemented by the Player interface
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
