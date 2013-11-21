/**
 * 
 */
package fr.iutvalence.java.mp.themorpion;

/**
 * @author andrvale
 *
 */
public interface Player
{
    /**
     * Abstract method which will be implemented by specific player class
     * @return Position wanted by the player
     */
    public Position askPosition();
}
