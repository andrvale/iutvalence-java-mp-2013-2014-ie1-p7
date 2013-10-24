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

    public static final int NUMBER_OF_LINES = 3;
    
    public static final int NUMBER_OF_COLUMNS = 3;
    

    /**
     * This is the representation of the grid of Tic Tac Toe
     * NUMBER_OF_LINES*NUMBER_OF_COLUMNS cells are available corresponding to cases of table
     * 
     */
    //TODO (fixed) initialize field in constructor
    private final int[][] grid; 

    
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
        
        // TODO (fixed) declare hard-coded values as constants
       this.grid = new int[NUMBER_OF_LINES][NUMBER_OF_COLUMNS] ;
        
        for(i = 0; i < NUMBER_OF_LINES; i++)
        {
            for(j = 0; j < NUMBER_OF_COLUMNS ; j++)
            {
                this.grid[i][j] = NOTHING;
            }
        }
        
        this.playerOne = new Player();
        this.playerTwo = new Player();
         
        System.out.println("New game of TicTacToe !");
        
    }
    
    /**
     * the game begin
     * 
     */
    public void play()
    {
        Position playerPos = new Position();
        // TODO (fixed) declare hard-coded values as constants
        int round = NUMBER_OF_LINES*NUMBER_OF_COLUMNS;
        int playedPlayer = 1;
        // TODO (fixed) simplify test
        // TODO (fix) simplify the loop avoiding duplicating code for the 2 players
        while(!(this.checkVictory()) && round > 0)   
        {
                   
               do
               {
                       if(playedPlayer == 1)
                       {
                           try
                           {
                               playerPos = this.playerOne.askPosition();
                               
                           }
                           catch(OutOfBoundPositionException e)
                           {
                               System.out.println(e.getMessage());
                           }
                           
                       }
                       else
                       { 
                           try
                           {
                               playerPos = this.playerTwo.askPosition();
                           }
                           catch(OutOfBoundPositionException e)
                           {
                               System.out.println(e.getMessage());
                           }
                       }
                       
               }while (this.checkPosition(playerPos) == false);
               
               if(playedPlayer == 2)
               {    
                   placeMark(playerPos, CIRCLE);
                   playedPlayer--;
                   round--;
               }
               else
               {
                   placeMark(playerPos, CROSS);
                   playedPlayer++;
                   round--;
                   
              
               }
        }
        System.out.println("La victoire revient au joueur : " + this.winner + " en "+ (9 - round) + " rounds");
    }
    
    // TODO (fixed) finish writing comment
    /**
     * Return true if we can put a mark in the grid
     * @param p choose by player
     * @return boolean 
     */
    
    private boolean checkPosition(Position p)
    {
       // TODO (fixed) simplify   
       return (this.grid[p.getRow()][p.getColumn()] == NOTHING);
        
    }
    
    /**
     * Return true if the game is end
     * @return boolean 
     */
    private boolean checkVictory()
    { 
       boolean victory = false;
       int vic;
       int i,j = 0;
       
       for(i = 0; i < NUMBER_OF_LINES; i++)
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
       for(j = 0; j < NUMBER_OF_COLUMNS; j++)
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
      
  
       this.winner = NOTHING;
       return victory;
       
        
    }  
    
    /**
     * Place a mark in the grid on the wanted position
     * @param p choose by player
     * @param mark value of player
     */
    private void placeMark(Position p, int mark)
    {
        this.grid[p.getRow()][p.getColumn()] = mark;
        System.out.println("(" + p.getRow() + "," + p.getColumn() +")");
       
    }
  
    }



