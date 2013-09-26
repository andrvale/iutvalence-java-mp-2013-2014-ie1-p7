package fr.iutvalence.java.mp.themorpion;
/**
 * 
 * This class represents a Tic-Tac-Toe game
 * @author andrvale
 *
 */

public class TicTacToe
{
    /**
     * This is the representation of the grid of Tic Tac Toe
     */
    int grid[][];
    
    /**
     * Declaration of the first player
     */
    Player player_one;   
    
    /**
     * Declaration of the second player
     */
    Player player_two;

    /**
     * Constructor of Tic Tac Toe class
     * It creates a new grid 3x3 and 2 new players
     * @param grid
     * @param player_one
     * @param player_two
     */
    
    TicTacToe()
    {
        final int  CIRCLE = 10000;
        final int  CROSS = 20000;
        
        this.grid = new int[3][3];
        this.player_one = new Player(1, CIRCLE);
        this.player_two = new Player(2, CROSS);
    }
       
    
}
