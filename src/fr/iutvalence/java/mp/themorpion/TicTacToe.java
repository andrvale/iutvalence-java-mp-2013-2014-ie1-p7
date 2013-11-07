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
    public final static int[] TAB_MARK = new int[]{1,2};

    /**
     * Constant corresponding to cross mark
     */
    //public final static int CROSS = 1;

    /**
     * Constant corresponding to VOID mark
     */
    public final static int NOTHING = 0;

    // TODO (fixed) write comment
    /**
     * Constant corresponding to number of lines
     */
    public static final int NUMBER_OF_LINES = 3;

    // TODO (fixed) write comment
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

    // TODO (fixed) replacing these two fields by an array should simplify the
    // rest of the code
    
    /**
     * first player
     */
   // private Player playerOne;

    /**
     * second player
     */

   // private Player playerTwo;
    
    private Player[] tabPlayer = new Player[2];


    /**
     * Either NOTHING, either CROSS, either CIRCLE
     */
    // TODO (fixed) looks like a local variable instead of a field
   

    /**
     * It initializes a new game A void grid is create
     */

    public TicTacToe()
    {
        this.grid = new int[NUMBER_OF_LINES][NUMBER_OF_COLUMNS];

        for (int lineNumber = 0; lineNumber < NUMBER_OF_LINES; lineNumber++)
        {
            for (int columnNumber = 0; columnNumber < NUMBER_OF_COLUMNS; columnNumber++)
            {
                this.grid[lineNumber][columnNumber] = NOTHING;
            }
        }

        this.tabPlayer[0] = new Player();
        this.tabPlayer[1]= new Player();

        // TODO (fixed) remove this debug message
        //System.out.println("New game of TicTacToe !");
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
            // TODO (fixed) if you can not simplify this, move it to an external method
            // to make this one more readable
            do
            {   
                
                
                playerPos = this.tabPlayer[playedPlayer].askPosition();
                posChecked = this.checkPosition(playerPos);
                

            }
            while (posChecked == false);

            // TODO (fixed) (same as previous)
            try
            {
                placeMark(playerPos, this.TAB_MARK[playedPlayer]);
            }
            catch(PositionOutOfBoundsException e)
            {
                System.out.println(e.getMessage());
            }
            round--;
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

    // TODO (fixed) finish writing comment
    /**
     * Return true if we can put a mark in the grid
     * 
     * @param position
     *            choose by player
     * @return boolean
     * @throws PositionOutOfBoundsException 
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
        int winner;
        int vic;
        int i, j = 0;

        for (i = 0; i < NUMBER_OF_LINES; i++)
        {
            vic = this.grid[i][j] * this.grid[i][j + 1] * this.grid[i][j + 2];
            // TODO (fixed) declare hard-coded values as constants
            if (vic == PLAYER1_WIN || vic == PLAYER2_WIN)
            {
                victory = true;              
                winner = this.grid[i][j];
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
                winner = this.grid[i][j];
                return victory;
            }
        }

        i = 0;
        j = 0;
        vic = this.grid[i][j] * this.grid[i + 1][j + 1] * this.grid[i + 2][j + 2];
        if (vic == PLAYER1_WIN || vic == PLAYER2_WIN)
        {
            victory = true;
            winner = this.grid[i][j];
            return victory;
        }
        i = 0;
        j = 2;
        vic = this.grid[i][j] * this.grid[i + 1][j - 1] * this.grid[i + 2][j - 2];
        if (vic == PLAYER1_WIN || vic == PLAYER2_WIN)
        {
            victory = true;
            winner = this.grid[i][j];
            return victory;
        }

        winner = NOTHING;
        return victory;

    }

    /**
     * Place a mark in the grid on the wanted position
     * 
     * @param position
     *            choose by player
     * @param mark
     *            value of player
     * @throws PositionOutOfBoundsException 
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
