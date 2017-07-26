/* Isha Chakraborty
7/26/17
*/

import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;

public class Masterpiece extends JFrame
{

      public Masterpiece()
      {
            super("Sailboats Galore"); // retains all of the characteristics of the JFrame class
            setSize(400,500); // sets the size of the JFrame
            setDefaultCloseOperation(EXIT_ON_CLOSE); // closes the window when pressing the x
            JPanel panell = new JPanel();
            setContentPane(panell);
            setVisible(true); // makes it visible on JFrame
            Panel pan = new Panel(); // creates a Panel to draw on
            setContentPane(pan); // makes the panel "pan" the content on the JFrame
            setResizable(true); // makes the JFrame adjustable, not reccommended for all programs
      }

      public static void main(String[] args)
      {
            Masterpiece masterpiece = new Masterpiece();

      }
}

class Panel extends JPanel
{
    public Panel()
    {
    	  setForeground(Color.GRAY);
        setBackground(Color.PINK);
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.drawRect(150, 100, 100, 50);
        g.drawLine(200, 50, 200, 100);
        g.setColor(Color.BLUE);
        g.drawString("Java Boat", 175, 135);
        g.setColor(Color.DARK_GRAY);
       	g.drawOval(195, 55, 10, 10);
        g.drawOval(195, 53, 10, 10);
        g.drawOval(195, 60, 10, 10);

        g.setColor(Color.GRAY);
        g.drawArc(150, 50, 100, 100, 30, 125);
       	g.fillArc(185, 50, 30, 30, 30, 120);

    }

}
