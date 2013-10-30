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

    // TODO (fix) write comment
    public static final int NUMBER_OF_LINES = 3;

    // TODO (fix) write comment
    public static final int NUMBER_OF_COLUMNS = 3;

    /**
     * This is the representation of the grid of Tic Tac Toe
     * NUMBER_OF_LINES*NUMBER_OF_COLUMNS cells are available corresponding to
     * cases of table
     * 
     */
    private final int[][] grid;

    // TODO (fix) replacing these two fields by an array should simplify the
    // rest of the code
    /**
     * first player
     */
    private Player playerOne;

    /**
     * second player
     */

    private Player playerTwo;

    /**
     * Either NOTHING, either CROSS, either CIRCLE
     */
    // TODO (fix) looks like a local variable instead of a field
    private int winner;

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

        this.playerOne = new Player();
        this.playerTwo = new Player();

        // TODO (fix) remove this debug message
        System.out.println("New game of TicTacToe !");
    }

    /**
     * the game begin
     * 
     */
    public void play()
    {
        Position playerPos = null;
        int round = NUMBER_OF_LINES * NUMBER_OF_COLUMNS;
        int playedPlayer = 1;
        while (!(this.isCurrentPlayerHasWon()) && round > 0)
        {
            // TODO (fix) if you can not simplify this, move it to an external method
            // to make this one more readable
            do
            {
                if (playedPlayer == 1)
                {
                    try
                    {
                        playerPos = this.playerOne.askPosition();

                    }
                    catch (OutOfBoundPositionException e)
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
                    catch (OutOfBoundPositionException e)
                    {
                        System.out.println(e.getMessage());
                    }
                }

            }
            while (this.checkPosition(playerPos) == false);

            // TODO (fix) (same as previous)
            if (playedPlayer == 2)
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
        System.out.println("La victoire revient au joueur : " + this.winner + " en " + (9 - round) + " rounds");
    }

    // TODO (fixed) finish writing comment
    /**
     * Return true if we can put a mark in the grid
     * 
     * @param position
     *            choose by player
     * @return boolean
     */

    private boolean checkPosition(Position position)
    {
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
            // TODO (fix) declare hard-coded values as constants
            if (vic == 1 || vic == 8)
            {
                victory = true;              
                this.winner = this.grid[i][j];
                return victory;
            }
        }
        i = 0;
        for (j = 0; j < NUMBER_OF_COLUMNS; j++)
        {
            vic = this.grid[i][j] * this.grid[i + 1][j] * this.grid[i + 2][j];
            if (vic == 1 || vic == 8)
            {
                victory = true;
                this.winner = this.grid[i][j];
                return victory;
            }
        }

        i = 0;
        j = 0;
        vic = this.grid[i][j] * this.grid[i + 1][j + 1] * this.grid[i + 2][j + 2];
        if (vic == 1 || vic == 8)
        {
            victory = true;
            this.winner = this.grid[i][j];
            return victory;
        }
        i = 0;
        j = 2;
        vic = this.grid[i][j] * this.grid[i + 1][j - 1] * this.grid[i + 2][j - 2];
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
     * 
     * @param position
     *            choose by player
     * @param mark
     *            value of player
     */
    private void placeMark(Position position, int mark)
    {
        this.grid[position.getRow()][position.getColumn()] = mark;
        System.out.println("(" + position.getRow() + "," + position.getColumn() + ")");

    }

}
