/**
 * 
 */
package fr.iutvalence.java.mp.themorpion;

// TODO (fixed) finish writing comment
/**
 * @author André Valentin
 *         Lamine SERRADJ
 * The class represent an interface of Players
 *
 */
public interface Player
{
    // TODO (fixed) rewrite comment (what is the purpose of the method?)
    /**
     * Abstract method which will be implemented by specific player class (ConsolePlayer or RandomPlayer)
     * The player chooses a position
     * @return Position wanted by the player
     */
    public Position askPosition();
}
