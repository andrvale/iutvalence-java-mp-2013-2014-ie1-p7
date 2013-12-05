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
        Display[] display = new Display[] {new ConsoleDisplay(), new WindowDisplay()};
        Player[] players = new Player[] {new RandomPlayer(), new ConsolePlayer()};
        new TicTacToe(players,new WindowDisplay()).play();
    }
}
