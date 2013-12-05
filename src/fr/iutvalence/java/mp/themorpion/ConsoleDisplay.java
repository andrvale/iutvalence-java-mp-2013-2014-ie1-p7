package fr.iutvalence.java.mp.themorpion;

// TODO (fix) write comment
/**
 * @author andrvale
 *
 */
public class ConsoleDisplay implements Display
{

    /**
     * @see fr.iutvalence.java.mp.themorpion.Display#displayGrid(int[][])
     */
    public void displayGrid(int[][] grid)
    {
        int lineNumber, columnNumber;
        String stringOfGrid = "\n";
        stringOfGrid = stringOfGrid + " ___________\n";
        for (lineNumber = 0; lineNumber < grid.length; lineNumber++)
        {
            stringOfGrid = stringOfGrid + "|";
            for (columnNumber = 0; columnNumber < grid.length; columnNumber++)
            {
                if (grid[lineNumber][columnNumber] == 2)
                {
                    stringOfGrid = stringOfGrid + "_O_|";

                }
                else if (grid[lineNumber][columnNumber] == 1)
                {
                    stringOfGrid = stringOfGrid + "_X_|";
                }
                else
                {
                    stringOfGrid = stringOfGrid + "___|";
                }
            }
            stringOfGrid = stringOfGrid + "\n";
        }
        System.out.println(stringOfGrid);
    }

    /**
     * @see fr.iutvalence.java.mp.themorpion.Display#printWinner(int, int, boolean)
     */
    public void printWinner(int winner, int rounds, boolean isThereWinner)
    {

        String strResult = "";
        if (rounds != 0)
        {
            strResult = strResult + "The winner is : the player " + (winner + 1);
        }
        else
        {
            if (isThereWinner)
            {
                strResult = strResult + "The winner is : the player " + (winner + 1);
            }
            else
            {
                strResult = strResult + "There is no Winnner";
            }

        }
        System.out.println(strResult);
    }

}
