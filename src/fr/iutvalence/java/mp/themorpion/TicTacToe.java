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
    private int grid[][];

    
    /**
     * first player
     */

    private Player playerOne;


    /**
     * second player
     */

    private Player playerTwo;
    
    /**
     *  Eihter NOTHING, either CROSS, either CIRCLE
     */
    private int gagnant;

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
        
    }
    
    /**
     * the game begin
     * 
     */
    public void play()
    {
        Position playerPos;
        int round = 9;

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
    
    
    /**
     * Return true if we can put a mark in the grid
     * @param p choose by player
     */
    private boolean checkPosition(Position p)
    {
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
              this.gagnant = this.grid[i][j];
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
              this.gagnant = this.grid[i][j];
              return victory;
          }
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



