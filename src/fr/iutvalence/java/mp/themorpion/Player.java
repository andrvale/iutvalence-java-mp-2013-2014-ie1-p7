package fr.iutvalence.java.mp.themorpion;

/**
 * 
 * This class describes a player with his attributes
 * 
 * @author andrvale
 * 
 */

public class Player
{
    // TODO (think about it) this field seems useless
    /**
     * Identifier of the player (value = CROSS or CIRCLE)
     */
    private int id;
    

    /**
     * The created player have an id, a score and a mark
     * @param id id is the identifiant of the player
     * 
     */

    public Player(int id)
    {
        this.id = id;

    }
   
    /**
     * 
     * Return id
     * 
     */
    
   public int getId()
   {
       return this.id;
   }
   
   /**
    * 
    * Return position wanted by the player
    * 
    */
   
   public Position askPosition()
   {   
       Position pos;
       
       
       return pos;
   }
}

