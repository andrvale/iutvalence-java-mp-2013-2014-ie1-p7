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
 * @author André Valentin
 *         Lamine SERRADJ
 *
 */
public class WindowDisplay extends JFrame implements Display, Player, ActionListener
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    //private  boolean isNotPressed;
    /**
     * Position of Button clicked
     */
    private Position posButton;
    /**
     * Array of TicTacToeJButton
     */
    private TicTacToeJButton[][] but;
    
    /**
     * Panel of the window 
     */
    private JPanel gamePannel;
    /**
     * Constructor of WindowDisplay
     */
    public WindowDisplay() {
        
        this.but =  new TicTacToeJButton[3][3];
        this.gamePannel = new JPanel(new GridLayout(3,3));
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){                  
                this.but[i][j] = new TicTacToeJButton(new Position(i, j));
                this.but[i][j].addActionListener(this);
                this.gamePannel.add(this.but[i][j]);
                
            }
        }       
        //this.isNotPressed = true;
        this.setSize(300, 330);
        this.setContentPane(this.gamePannel);
        
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
    }

    
    public void printWinner(int winner, int rounds, boolean isThereWinner)
    {
        JOptionPane win;
        win = new JOptionPane();
        
        if (isThereWinner)
        {
            win.showMessageDialog(null, "The winner is : the player "+(winner+1), "End of the game !", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            win.showMessageDialog(null, "There is no winner ! ", "End of the game !", JOptionPane.INFORMATION_MESSAGE);}
        }
    
    public void displayGrid(int[][] grid)
    {
        
        
        for (int lineNumber = 0; lineNumber < grid.length; lineNumber++)
        {
            
            for ( int columnNumber = 0; columnNumber < grid.length; columnNumber++)
            {
                if (grid[lineNumber][columnNumber] == 2)
                {
                    this.but[lineNumber][columnNumber].setText("O");
                    this.but[lineNumber][columnNumber].removeActionListener(this);

                }
                if (grid[lineNumber][columnNumber] == 1)
                {
                    this.but[lineNumber][columnNumber].setText("X");
                    this.but[lineNumber][columnNumber].removeActionListener(this);
                }
              
            }
        }
        this.repaint();
    }
    
    public synchronized Position askPosition()
    {
        try
        {
            this.wait();
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //while (this.isNotPressed);
        return this.posButton;
        
    }
    
    public synchronized void actionPerformed(ActionEvent action) 
    {
        TicTacToeJButton button = (TicTacToeJButton) action.getSource();
        //System.out.println("Pressed at "+button.getPosition());
        this.posButton = button.getPosition();
        //this.isNotPressed = false;
        this.notify();
        
        
       
   }
}
