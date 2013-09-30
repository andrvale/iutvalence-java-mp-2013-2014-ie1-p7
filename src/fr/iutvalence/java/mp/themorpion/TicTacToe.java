package fr.iutvalence.java.mp.themorpion;

/**
 * 
 * This class represents a Tic-Tac-Toe game
 * 
 * @author andrvale
 * 
 */

public class TicTacToe
{
    // TODO (fix) document what values are allowed and what they mean
    /**
     * This is the representation of the grid of Tic Tac Toe
     * 
     */
    int grid[][];

    // TODO (fix) simplify comment
    /**
     * Declaration of the first player
     */
    // TODO (fix) comply with naming conventions
    Player player_one;

    // TODO (fix) simplify comment
    /**
     * Declaration of the second player
     */
    // TODO (fix) comply with naming conventions
    Player player_two;

    // TODO (fix) simplify comment
    // TODO (fix) document parameters
    // TODO (fix) declare a visibility for the constructor
    /**
     * Constructor of Tic Tac Toe class It creates a new grid 3x3 and 2 new
     * players
     * 
     * @param grid
     * @param player_one
     * @param player_two
     */

    TicTacToe()
    {
        // TODO (fix) define constants for that
        final int CIRCLE = 10000;
        final int CROSS = 20000;

        this.grid = new int[3][3];
        this.player_one = new Player(1, CIRCLE);
        this.player_two = new Player(2, CROSS);
    }

}
