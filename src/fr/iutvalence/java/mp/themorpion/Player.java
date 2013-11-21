package fr.iutvalence.java.mp.themorpion;

import java.util.Random;

/**
 * 
 * This class describes a player with his attributes
 * 
 * @author andrvale
 * 
 */

public class Player
{

    /**
     * Check if position wanted by the player is between 1 and 9
     * 
     * @return position wanted by the player
     * 
     */    
    public Position askPosition()
    {
        // TODO (fix) simplify this
        int randColumn;
        int randLine;
        Random rand = new Random();
        randColumn = rand.nextInt(25);
        randLine = rand.nextInt(TicTacToe.NUMBER_OF_LINES);
        Position pos = new Position(randLine, randColumn);

        return pos;

    }
}
