package fr.iutvalence.java.mp.themorpion;

/**
 * @author andrvale
 *
 */

public interface Display
{    
    /**
     * @param winner
     * @param rounds
     */
    
    public void printWinner(int winner, int rounds, boolean isThereWinner);
    /**
     * @param grid
     */
    public void displayGrid(int[][] grid);
    
}
