package fr.iutvalence.java.mp.themorpion;

import java.util.Random;


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
     * Constant corresponding to VOID mark
     */
    public final static int NOTHING = 0;
    

    /**
     * This is the representation of the grid of Tic Tac Toe
     * 9 cases are available corresponding to cases of table
     * 
     */
    private int grid[][];

    
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
        int i, j;
        
        this.grid = new int[3][3];
        
        for(i = 0; i < 3; i++)
        {
            for(j = 0; j < 3 ; j++)
            {
                this.grid[i][j] = NOTHING;
            }
        }
        
        this.playerOne = new Player(CROSS);
        this.playerTwo = new Player(CIRCLE);
         
        System.out.println("New game of TicTacToe !");
        //tant que le joueur ne retourne pas une valeur possible faire demander position
        
    }
    
    /**
     * 
     * 
     */
    public void play()
    {
        Position playerPos;

        while(this.checkVictory() == false)        {
                  
           playerPos = playerOne.askPosition();
           while(this.checkPosition(playerPos) == false)
           {
               playerPos = playerOne.askPosition();
           }
           //rentrer mark dans tableau
           playerPos = playerTwo.askPosition();
           while(this.checkPosition(playerPos) == false)
           {
               playerPos = playerTwo.askPosition();
           }
           //rentrer mark dans tableau
           
        }
        
    }
    
    
    /**
     * Return true if we can put a mark in the grid
     * @param p choose by player
     */
    private boolean checkPosition(Position p)
    {
       boolean youCan;
        
        return youCan;
        
    }
    
    /**
     * Return true if the game is end
     * 
     */
    private boolean checkVictory()
    {
       boolean end;
       
       return end;
        
    }    
    }


