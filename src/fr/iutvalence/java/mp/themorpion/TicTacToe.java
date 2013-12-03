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
     *Constant corresponding to an array of the number of the player
     */
    public final int[] PLAYERS_CELL_VALUES = new int[]{1,2};

    /**
     * Constant corresponding to VOID mark
     */
    public final static int NOTHING = 0;

    /**
     * Constant corresponding to number of lines
     */
    public static final int NUMBER_OF_LINES = 3;

    /**
     * Constant corresponding to number of columns
     */
    public static final int NUMBER_OF_COLUMNS = 3;

    /**
     * Constant corresponding to player1 victory
     */
    public static final int PLAYER1_WIN = 1;
    
    /**
     * Constant corresponding to player2 victory
     */
    public static final int PLAYER2_WIN = 8;
    
    /**
     * This is the representation of the grid of Tic Tac Toe
     * size is NUMBER_OF_LINES*NUMBER_OF_COLUMNS
     * 
     */
    private final int[][] grid;
    
    /**
     * players
     */  
    private Player[] players; 

    // TODO (fix) fix comment (wrong description)
    /**
     * It initializes a new game A void grid is created
     * @param player player
     */
    private Display gameDisplay;
    
    // TODO (fix) finish writing comment
    /**
     * @param players
     * @param display
     */
    public TicTacToe(Player[] players, Display display)
    {
        this.players  = players;
        this.gameDisplay = display;
        this.grid = new int[NUMBER_OF_LINES][NUMBER_OF_COLUMNS];

        for (int lineNumber = 0; lineNumber < NUMBER_OF_LINES; lineNumber++)
        {
            for (int columnNumber = 0; columnNumber < NUMBER_OF_COLUMNS; columnNumber++)
            {
                this.grid[lineNumber][columnNumber] = NOTHING;
            }
        }
    }

    /**
     * the game begin
     * 
     * 
     */
    public void play()
    {
        Position playerPos = null;
        boolean posChecked = false;
        int round = NUMBER_OF_LINES * NUMBER_OF_COLUMNS;
        int playedPlayer = 1;

        while (!(this.isCurrentPlayerHasWon()) && round > 0)
        {          
            do
            {   
                playerPos = this.players[playedPlayer].askPosition();
                posChecked = this.checkPosition(playerPos);        
            }
            while (!posChecked);
           
            try
            {
                placeMark(playerPos, this.PLAYERS_CELL_VALUES[playedPlayer]);
            }
            catch(PositionOutOfBoundsException e)
            {
                System.out.println(e.getMessage());
            }
            round--;
            playedPlayer =(playedPlayer + 1)%2;
           
        }
        this.gameDisplay.displayGrid(this.grid);
        //System.out.println(gridToString());
        this.gameDisplay.printWinner((playedPlayer%2), round, this.isCurrentPlayerHasWon());
        //System.out.println("The winner is : "+ printWinner()  + " en "+(9-round)+"rounds"); 
    }

    /**
     * Return true if we can put a mark in the grid
     * 
     * @param position
     *            choose by player
     * @return boolean
     */

    private boolean checkPosition(Position position)
    {
        if(position.getRow() > 2 || position.getRow() < 0 || position.getColumn() < 0 || position.getColumn() > 2)
            return false;
        
        return (this.grid[position.getRow()][position.getColumn()] == NOTHING);
        
    }

    /**
     * Return true if the game is end
     * 
     * @return boolean
     */
    private boolean isCurrentPlayerHasWon()
    {
        boolean victory = false;
       
        int vic;
        int i, j = 0;

        for (i = 0; i < NUMBER_OF_LINES; i++)
        {
            vic = this.grid[i][j] * this.grid[i][j + 1] * this.grid[i][j + 2];
            if (vic == PLAYER1_WIN || vic == PLAYER2_WIN)
            {
                victory = true;              
                return victory;
            }
        }
        i = 0;
        for (j = 0; j < NUMBER_OF_COLUMNS; j++)
        {
            vic = this.grid[i][j] * this.grid[i + 1][j] * this.grid[i + 2][j];
            if (vic == PLAYER1_WIN || vic == PLAYER2_WIN)
            {
                victory = true;
             
                return victory;
            }
        }

        i = 0;
        j = 0;
        vic = this.grid[i][j] * this.grid[i + 1][j + 1] * this.grid[i + 2][j + 2];
        if (vic == PLAYER1_WIN || vic == PLAYER2_WIN)
        {
            victory = true;
      
            return victory;
        }
        i = 0;
        j = 2;
        vic = this.grid[i][j] * this.grid[i + 1][j - 1] * this.grid[i + 2][j - 2];
        if (vic == PLAYER1_WIN || vic == PLAYER2_WIN)
        {
            victory = true;
          
            return victory;
        }

      
        return victory;

    }

    /**
     * Place a mark in the grid on the wanted position
     * 
     * @param position
     *            choose by player
     * @param mark
     *            value of player
     * @throws PositionOutOfBoundsException return exception
     */
    private void placeMark(Position position, int mark) throws PositionOutOfBoundsException
    {
        if (!checkPosition(position))
        {
            throw new PositionOutOfBoundsException(position);
        }
        else
        {
            this.grid[position.getRow()][position.getColumn()] = mark;
          //  System.out.println("Le joueur " + mark + " a joué : (" + position.getRow() + "," + position.getColumn() + ")");
        this.gameDisplay.displayGrid(this.grid);
            // System.out.println(gridToString());
            

        }       
    }
}
    
