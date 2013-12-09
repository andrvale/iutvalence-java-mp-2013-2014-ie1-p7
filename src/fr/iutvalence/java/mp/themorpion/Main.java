/**
 * 
 */
package fr.iutvalence.java.mp.themorpion;

/**
 * This class is the main class which allow to launch our programm
 * @author André Valentin
 *         Lamine SERRADJ
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
        Display displayWin = new WindowDisplay();
        
        Display[] display = new Display[] {displayWin, displayWin};
        Player[] players = new Player[] {(Player) displayWin, (Player) displayWin};
        new TicTacToe(players,display).play();
    }
}
