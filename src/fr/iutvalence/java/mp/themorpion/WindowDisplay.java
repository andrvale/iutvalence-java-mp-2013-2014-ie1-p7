package fr.iutvalence.java.mp.themorpion;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;

/**
 * @author andrvale
 *
 */
public class WindowDisplay extends JFrame implements Display, Player, ActionListener
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    
    private boolean isNotPressed;
    private Position posButton;
    /**
     * 
     */
    public WindowDisplay() {
        
        JPanel game = new JPanel(new GridLayout(3,3));
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){  
                JButton button = new TicTacToeJButton(new Position(i, j));
                button.addActionListener(this);
                game.add(button);
                isNotPressed = true;
            }
        }       
            
        this.setSize(300, 330);
        this.setContentPane(game);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
    }

    
    public void printWinner(int winner, int rounds, boolean isThereWinner)
    {
        JOptionPane win;
        win = new JOptionPane();
        win.showMessageDialog(null, "Le gagant est le joueur "+winner, "Fin du jeu !", JOptionPane.INFORMATION_MESSAGE);}
    
    public void displayGrid(int[][] grid)
    {
        
    }
    
    public Position askPosition()
    {
        while (!isNotPressed);
        return posButton;
        
    }
    
    public void actionPerformed(ActionEvent action) 
    {
        TicTacToeJButton button = (TicTacToeJButton) action.getSource();
        //System.out.println("Pressed at "+button.getPosition());
        this.posButton = button.getPosition();
        isNotPressed = false;
        
        
       
   }
}
