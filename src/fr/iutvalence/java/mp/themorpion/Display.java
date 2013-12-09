package fr.iutvalence.java.mp.themorpion;

// TODO (fixed) finish writing comment
/**
 * @author André Valentin
 *         Lamine SERRADJ
 * The class represent an interface of displays
 */
public interface Display
{    
    // TODO (fixed) finish writing comment
    /**
     * Function which print a winner
     * @param winner
     *               the winner of the game
     * @param rounds
     *               the number of rounds to finish the game
     * @param isThereWinner 
     *               boolean which is true if there is a winner
     */    
    public void printWinner(int winner, int rounds, boolean isThereWinner);
    
    // TODO (fixed) finish writing comment
    /**
     * Function which display the grid
     * @param grid
     */
    public void displayGrid(int[][] grid);
    
}
