package fr.iutvalence.java.mp.themorpion;

import java.util.Random;

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
     * Ask a random position to the player     
     * @return position wanted by the player
     * 
     */    
    public Position askPosition()
    {
        Random rand = new Random();
        return new Position(rand.nextInt(TicTacToe.NUMBER_OF_LINES), rand.nextInt(TicTacToe.NUMBER_OF_COLUMNS));
    }
}
