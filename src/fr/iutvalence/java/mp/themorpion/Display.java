package fr.iutvalence.java.mp.themorpion;

// TODO (fix) finish writing comment
/**
 * @author andrvale
 *
 */
public interface Display
{    
    // TODO (fix) finish writing comment
    /**
     * @param winner
     * @param rounds
     */    
    public void printWinner(int winner, int rounds, boolean isThereWinner);
    
    // TODO (fix) finish writing comment
    /**
     * @param grid
     */
    public void displayGrid(int[][] grid);
    
}
