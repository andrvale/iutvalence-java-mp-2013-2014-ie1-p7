package fr.iutvalence.java.mp.themorpion;

import javax.swing.JButton;

public class TicTacToeJButton extends JButton
{

    private Position position;

    TicTacToeJButton(Position position)
    {
        this.position = position;

    }

    public Position getPosition()
    {
        return this.position;
    }

}
