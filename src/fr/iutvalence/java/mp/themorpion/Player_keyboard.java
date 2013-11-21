package fr.iutvalence.java.mp.themorpion;

import java.util.Scanner;

/**
 * @author andrvale
 *
 */
public class Player_keyboard implements Player
{
    public final static Position[] positionsFromCellNumber = new Position[] 
            { new Position(2,0), new Position(2,1), new Position(2,2),
              new Position(1,0), new Position(1,1), new Position(1,2),
              new Position(0,0), new Position(0,1), new Position(0,2)
 
            };
    /**
     * Ask a position to the player on the numeric keyboard
     * 
     * @return position wanted by the player
     * 
     */    
    /* (non-Javadoc)
     * @see fr.iutvalence.java.mp.themorpion.Player#askPosition()
     */
    public Position askPosition()
    {
        // int column, line;
        Position pos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir votre position :");
        int cellNumber = sc.nextInt();
        /*line = p /10;
        column = p%10;
        pos = new Position(line, column);*/
        if ((cellNumber > 9) ||(cellNumber < 1 )) return new Position(3,3);
        return positionsFromCellNumber[cellNumber-1];

    }

  }

