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
    public final static int CIRCLE = 2;
    
    /**
     * Constant corresponding to cross mark
     */
    public final static int CROSS = 1;
    
    /**
     * Constant corresponding to VOID mark
     */
    public final static int NOTHING = 0;
    

    /**
     * This is the representation of the grid of Tic Tac Toe
     * 9 cases are available corresponding to cases of table
     * 
     */
    private int[][] grid;

    
    /**
     * first player
     */

    private Player playerOne;


    /**
     * second player
     */

    private Player playerTwo;
    
    /**
     *  Either NOTHING, either CROSS, either CIRCLE
     */
    private int winner;

    /**
     *  It initializes a new game
     *  A void grid is create
     */

    public TicTacToe()
    {
        int i, j;
        
        // TODO (fix) declare hard-coded values as constants
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
        
    }
    
    /**
     * the game begin
     * 
     */
    public void play()
    {
        Position playerPos;
        // TODO (fix) declare hard-coded values as constants
        int round = 9;

        // TODO (fix) simplify test
        // TODO (fix) simplify the loop avoiding duplicating code for the 2 players
        while(this.checkVictory() == false || round != 0)   
        {
              
           playerPos = this.playerOne.askPosition();
           while(this.checkPosition(playerPos) == false)
           {
               playerPos = this.playerOne.askPosition();
              
           }
           placeMark(playerPos, this.playerOne.getId());
           round--;
           if (this.checkVictory() == false)
           {
               playerPos = this.playerTwo.askPosition();
               while(this.checkPosition(playerPos) == false)
               {
                   playerPos = this.playerTwo.askPosition();
               }
               placeMark(playerPos, this.playerTwo.getId());
               round--;
           }
        }
        
    }
    
    // TODO (fix) finish writing comment
    /**
     * Return true if we can put a mark in the grid
     * @param p choose by player
     */
    private boolean checkPosition(Position p)
    {
       // TODO (fix) simplify
       boolean youCan = false;
       if (this.grid[p.getRow()][p.getColumn()] == NOTHING)
       {
           youCan = true;
       }       
       
       return youCan;
        
    }
    
    /**
     * Return true if the game is end
     * 
     */
    private boolean checkVictory()
    { 
       boolean victory = false;
       int vic;
       int i,j = 0;
       
       for(i = 0; i < 3; i++)
       {
           vic = this.grid[i][j] * this.grid[i][j+1] * this.grid[i][j+2];
          if (vic == 1 || vic == 8)
          {
              victory = true;
              this.winner = this.grid[i][j];
              return victory;
          }
       }
       i = 0;
       for(j = 0; j < 3; j++)
       {
           vic = this.grid[i][j] * this.grid[i+1][j] * this.grid[i+2][j];
          if (vic == 1 || vic == 8)
          {
              victory = true;
              this.winner = this.grid[i][j];
              return victory;
          }
       }
       
              
      i = 0;
      j = 0;
      vic = this.grid[i][j] * this.grid[i+1][j+1] * this.grid[i+2][j+2];
      if (vic == 1 || vic == 8)
      {
          victory = true;
          this.winner = this.grid[i][j];
          return victory;
      }
      i = 0;
      j = 2;
      vic = this.grid[i][j] * this.grid[i+1][j-1] * this.grid[i+2][j-2];
      if (vic == 1 || vic == 8)
      {
          victory = true;
          this.winner = this.grid[i][j];
          return victory;
      }
      
  
   
       return victory;
       
        
    }  
    
    /**
     * Place a mark in the grid on the wanted position
     * @param p choose by player
     * @param mark value of player
     */
    private void placeMark(Position p, int mark)
    {
       
    }
  
    }



