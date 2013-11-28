package fr.iutvalence.java.mp.themorpion;

import java.util.Scanner;

/**
 * @author andrvale
 *
 */
public class ConsolePlayer implements Player
{
    /**
     * Array of position which makes correspond the numeric keyboard and the grid 
     */
    // TODO (fixed) write comment
    public final static Position[] positionsFromCellNumber = new Position[] 
            { new Position(2,0), new Position(2,1), new Position(2,2),
              new Position(1,0), new Position(1,1), new Position(1,2),
              new Position(0,0), new Position(0,1), new Position(0,2)
 
            };
    
    /**
     * @see fr.iutvalence.java.mp.themorpion.Player#askPosition()
     */
    public Position askPosition()
    {
        // TODO (fix) clRandomPlayerean unused code
  
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir votre position :");
        int cellNumber = sc.nextInt();

        if ((cellNumber > 9) ||(cellNumber < 1 )) return new Position(3,3);
        return positionsFromCellNumber[cellNumber-1];

    }

  }

