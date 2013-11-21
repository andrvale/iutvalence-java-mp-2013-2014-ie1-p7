package fr.iutvalence.java.mp.themorpion;

import java.util.Random;

/**
 * 
 * This class describes a player with his attributes
 * 
 * @author andrvale
 * 
 */

public class Player_random implements Player
{

    /**
     * Ask a random position to the player     
     * @return position wanted by the player
     * 
     */    
    public Position askPosition()
    {
        // TODO (fixed) simplify this
       // int randColumn, randLine;
        Random rand = new Random();
        //randColumn = rand.nextInt(TicTacToe.NUMBER_OF_COLUMNS);
      //  randLine = rand.nextInt(TicTacToe.NUMBER_OF_LINES);
        Position pos = new Position(rand.nextInt(TicTacToe.NUMBER_OF_LINES), rand.nextInt(TicTacToe.NUMBER_OF_COLUMNS));

        return pos;

    }
}
