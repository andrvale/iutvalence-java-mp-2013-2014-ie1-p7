package fr.iutvalence.java.mp.themorpion;

import java.util.Scanner;

/**
 * @author andrvale
 *
 */
public class Player_keyboard implements Player
{
    /**
     * Ask a position to the player on the numeric keyboard
     * 
     * @return position wanted by the player
     * 
     */    
    public Position askPosition()
    {
        // int column, line;
        Position pos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir votre position :");
        int p = sc.nextInt();
        /*line = p /10;
        column = p%10;
        pos = new Position(line, column);*/
        pos = askToKeyboard(p);
        return pos;

    }

    /**
     * Numeric keyboard correspond to the grid of TicTacToe : 1 is (2,0),etc
     * @param p number on numeric keyboard
     * @return position 
     */
    public Position askToKeyboard(int p)
    {
        if (p == 1)
        {
            return (new Position(2,0));
        }
        if (p == 2)
        {
            return (new Position(2,1));
        }
        if (p == 3)
        {
            return (new Position(2,2));
        }
        if (p == 4)
        {
            return (new Position(1,0));
        }
        if (p == 5)
        {
            return (new Position(1,1));
        }
        if (p == 6)
        {
            return (new Position(1,2));
        }
        if (p == 7)
        {
            return (new Position(0,0));
        }
        if (p == 8)
        {
            return (new Position(0,1));
        }
        if (p == 9)
        {
            return (new Position(0,2));
        }
        return null;
    }
  }

