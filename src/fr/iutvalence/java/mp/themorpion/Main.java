/**
 * 
 */
package fr.iutvalence.java.mp.themorpion;

/**
 * This class is the main class which allow to launch our programm
 * @author andrvale
 * 
 * 
 */

public class Main
{
    /**
     * main function which allow to launch our programm
     * it is the first function execute when we run the prgramm
     * @param args args of main
     */
    public static void main(String[] args)
    {
        Player[]  a = new Player[2];
        a[0] = new RandomPlayer();
        a[1] = new ConsolePlayer();
        new TicTacToe(a);

    }

}
