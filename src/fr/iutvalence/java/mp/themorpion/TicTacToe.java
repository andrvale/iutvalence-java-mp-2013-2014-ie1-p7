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
     *Constant corresponding to an array of mark's values
     */
    // TODO (fix) rename field
    public final int[] TAB_MARK = new int[]{1,2};

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
     * NUMBER_OF_LINES*NUMBER_OF_COLUMNS cells are available corresponding to
     * cases of table
     * 
     */
    private final int[][] grid;
    
    // TODO (fix) fix comment (arrow ?)
    /**
     * Arrow of player
     */  
    private Player[] players; 

    // TODO (fix) detail comment
    /**
     * It initializes a new game A void grid is created
     * @param player player
     */
    public TicTacToe(Player[] player)
    {
        this.players  = player;
        this.grid = new int[NUMBER_OF_LINES][NUMBER_OF_COLUMNS];

        for (int lineNumber = 0; lineNumber < NUMBER_OF_LINES; lineNumber++)
        {
            for (int columnNumber = 0; columnNumber < NUMBER_OF_COLUMNS; columnNumber++)
            {
                this.grid[lineNumber][columnNumber] = NOTHING;
            }
        }

        // TODO (fix) the constructor must return quickly.
        // calling  constructor allows to get a new instance, not to play the game
      
        this.play();
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
        int playedPlayer = 0;
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
                placeMark(playerPos, this.TAB_MARK[playedPlayer]);
            }
            catch(PositionOutOfBoundsException e)
            {
                System.out.println(e.getMessage());
            }
            round--;
            // TODO (fix) use modulus
            if (playedPlayer == 0 )
            {
                playedPlayer++;
            }
            else
            {
                playedPlayer--;
            }
            

            
        }
        System.out.println(gridToString());
        printWinner(playedPlayer, round);
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
            System.out.println("Le joueur " + mark + " a joué : (" + position.getRow() + "," + position.getColumn() + ")");
            System.out.println(gridToString());

        }       
    }
    
    /**
     * 
     * Return the complete grid as a string
     * @return StringOfGrid
     *              
     * 
     */

    private String gridToString()
    {
        String stringOfGrid = "\n"; 
        stringOfGrid = stringOfGrid + " ___________\n";
        for (int lineNumber = 0; lineNumber < NUMBER_OF_LINES; lineNumber++)
        {
            stringOfGrid = stringOfGrid +"|";
            for (int columnNumber = 0; columnNumber < NUMBER_OF_COLUMNS; columnNumber++)
            {
                if (this.grid[lineNumber][columnNumber] == 2)
                {
                  stringOfGrid = stringOfGrid + "_O_|";

                }
                else if (this.grid[lineNumber][columnNumber] == 1)
                {
                    stringOfGrid = stringOfGrid + "_X_|";
                }
                else
                {
                    stringOfGrid = stringOfGrid + "___|";
                }
            }
            stringOfGrid = stringOfGrid +"\n";
    }
        return stringOfGrid;
        
    }
    /**
     * 
     * Print on console the winner of the game
     * @param winner 
     *              player who won
     * @param rounds 
     *              rounds to finish the game
     * 
     * 
     */
       
    private void printWinner(int winner, int rounds)
    {
        String strResult = "";
        if(rounds != 0)
        {
            strResult = strResult + "The winner is : the player "+ (winner+1);
        }       
        else
        {
            if(this.isCurrentPlayerHasWon())
            {
                strResult = strResult + "The winner is : the player "+ (winner+1);
            }
            else
            {
                strResult = strResult + "There is no Winnner";
            }
                
        }
        System.out.println(strResult);
    }
}
