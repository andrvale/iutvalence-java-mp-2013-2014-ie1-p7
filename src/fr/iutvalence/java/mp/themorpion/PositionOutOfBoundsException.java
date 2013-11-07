package fr.iutvalence.java.mp.themorpion;

class PositionOutOfBoundsException extends Exception
{

    private final Position position;

    /**
     * @param position
     */
    PositionOutOfBoundsException(Position position)
    {
        this.position = position;
    }

    
    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Throwable#getMessage()
     */
    @Override
    public String getMessage()
    {
        // TODO Auto-generated method stub
        return "la case " + this.position + " n'existe pas!";
    }

}