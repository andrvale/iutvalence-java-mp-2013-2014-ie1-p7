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
    // TODO (think about it)(fixed) this field seems useless
  

    /**
     * The created player have an id, a score and a mark
     * 
     * 
     * 
     */

    public Player()
    {
      
    }

    // TODO (fixed) finish writing comment
    
   

    // TODO (fixed) finish writing comment
    /**
     * Check if position wanted by the player is between 1 and 9
     * @return position wanted by the player
     * 
     */
    public Position askPosition() throws OutOfBoundPositionException
    {   
        int randColumn;
        int randLine;
        Random rand = new Random();
        randColumn = rand.nextInt(TicTacToe.NUMBER_OF_COLUMNS);        
        randLine = rand.nextInt(TicTacToe.NUMBER_OF_LINES);
        
        Position pos = new Position(randLine, randColumn);
        
        {  
            if(pos.getRow()*pos.getColumn() < 0 || pos.getRow()*pos.getColumn() > 4)
              throw new OutOfBoundPositionException(pos);
            else
            {   
                
                return pos;
                
            }
          }

        
    }
}
