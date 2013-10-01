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
    /**
     * Constant corresponding to circle mark
     */
    public final static int CIRCLE = 10000;
    
    /**
     * Constant corresponding to cross mark
     */
    public final static int CROSS = 20000;
    

    /**
     * This is the representation of the grid of Tic Tac Toe
     * 9 cases are available corresponding to cases of table
     * 
     */
    public int grid[][];

    
    /**
     * first player
     */

    Player playerOne;


    /**
     * second player
     */

    Player playerTwo;


    // TODO (fixed) document parameters

    /**
     *  It initializes a new game
     *  A void grid is create
     */

    public TicTacToe()
    {
        this.grid = new int[3][3];
        this.playerOne = new Player(1, CIRCLE);
        this.playerTwo = new Player(2, CROSS);
        //tant que le joueur ne retourne pas une valeur possible faire demander position
        
    }
    
        
    }


