/* Isha Chakraborty
7/26/17
Name of Program: MadLibs.java
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;//import Scanner
import java.io.File;//import File
import java.io.PrintWriter;//import PrintWriter
import java.io.FileWriter;
import java.io.FileNotFoundException;//import FileNotFoundException
import java.io.IOException;
import javax.imageio.ImageIO;

public class MadLibs extends JFrame
{
      private JFrame madLibsFrame;
      private CardPanel cp;
      private CardLayout cards;

      private String madLibsImageName;
      private JButton playNowButton, toStoryButton, directionsButton, backToStarter, backToStarterOne, finishStory;
      private JTextField username, adjOne, adjTwo, advOne, nounOne, nounTwo;
      private JTextField usernameLabel, adjOneLabel, adjTwoLabel, nounOneLabel, nounTwoLabel;
      private JTextArea finishedStoryTA;

      private String usernameVal, adjOneVal, adjTwoVal, advOneVal, nounOneVal, nounTwoVal;

      private Image madLibs;
      private String compStory;

      public MadLibs()
      {

      }

      public static void main(String[] args)
      {
          // make instance of class
          // calls run method
      }

      public void run()
      {
      
          //nameframe = new JFrame("Mad Libs");
          //nameframe.setSize(800, 600);
          //nameframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          //nameframe.setLocation(0,0);
          //nameframe.setResizable(false);
          cp = new CardPanel(); // adds all of the cards to CardLayout
          //nameframe.getContentPane().add(cp);
          //nameframe.setVisible(true);

          cards = new CardLayout();
          cp.setLayout(cards);

          StarterPanel starter = new StarterPanel();
          cp.add(starter, "Starter"); // adds starter card

          DirectionsPanel dPanel = new DirectionsPanel();
          cp.add(dPanel, "Directions");

          PartsOfSpeechPanel posPanel = new PartsOfSpeechPanel();
          cp.add(posPanel, "Parts of Speech");

          FinishedStoryPanel fsPanel = new FinishedStoryPanel();
          cp.add(fsPanel, "Finished Story");

          cards.first(cp);
      }

      class CardPanel extends JPanel // CardPanel class header
      {
            public CardPanel() // constructor
            {
            }
      }

      class StarterPanel extends JPanel // StarterPanel class header
      {
            public StarterPanel() // constructor
            {
                setLayout( new BorderLayout()); // sets the border layout
                setBackground(Color.LIGHT_GRAY); // makes the background blue

                StarterComponents starterCompPanel = new StarterComponents();
                add(starterCompPanel, BorderLayout.SOUTH); // specifies location

                madLibsImageName = "madlibs.png";

            }
            public void paintComponent(Graphics g) //draws the SmartBalance title to screen
            {
                 // inherits from paintComponent constructor
                  // set color
                  //create font mad libs
                  g.setFont(fontMadlibs);
                  g.drawString("Mad Libs by Isha Chakraborty", 170, 450); // draws the name of String
                  
                  loadImage();
                  g.drawImage( madLibs, 185, 50, 400, 400, this ); // draws the main image
                  
            }
            public void loadImage() // reads and loads the image file
            {
                  try
                  {
                      madLibs = ImageIO.read(new File(madLibsImageName));
                  }
                  catch(IOException e)
                  {
                     System.err.println("\n\n" + madLibsImageName + " can't be found. \n\n");
                     e.printStackTrace();
                 }
            }
      }
    class StarterComponents extends JPanel // creates all of the buttons for the main screen
    {
            public StarterComponents() // initializes all of the buttons
            {
                setSize(800, 300); // sets size of the panel
                setBackground(Color.GRAY); // sets background color
                String directions = "To play this game: "; // formats TextArea
                JTextArea directionsTA = new JTextArea(directions, 12, 16);
                directionsTA.setLineWrap(true);
                directionsTA.setWrapStyleWord(true);
                directionsTA.setVisible(false);
                // instantiate directions button, adds action listener, add button

                // instantiate play button, adds action listener, add button
                

            }

   class ButtonHandlers implements ActionListener // handler classes for the buttons
   {
             public void actionPerformed(ActionEvent evt) // ActionListener method header
            {
                // check for if button is pressed 


            }
   }
  }

  class DirectionsPanel extends JPanel // displays directions for the game
  {
      public DirectionsPanel() // constructor
      {
          setBackground(Color.WHITE);
          setLayout(new FlowLayout()); // uses flow layout for easy customization of components
          // instantiate back  button, adds action listener, add button
          JPanel backToStart = new JPanel();
          backToStart.setLayout(null);
          backToStart.setBackground(Color.WHITE);

          // customizes placement of buttons using flow layout
          backToStarter = new JButton("Back to Main");

          backToStarter.setBounds(0,0, 100, 15);
          DirectionsHandler backToStarterHandler= new DirectionsHandler();
          backToStarter.addActionListener(backToStarterHandler);
          backToStart.add(backToStarter);
          backToStart.setPreferredSize( new Dimension ( 800, 20));
          add(backToStart);

          String instructions = "Directions to Game: ";



      }
      public void paintComponent(Graphics g) // draws directions
      {
          // set font to a new font 
      }

      class DirectionsHandler implements ActionListener // Handler class for directions button
      {
          public void actionPerformed(ActionEvent evt)
          {
            //check if backToStarterButton has been pressed
        }
      }
  }

  class PartsOfSpeechPanel extends JPanel implements ActionListener
  {
      public PartsOfSpeechPanel()
      {
          setLayout(new GridLayout(6,1));
          // set color

          JPanel usernamePanel = new JPanel();
          usernamePanel.setLayout(new FlowLayout());
          usernamePanel.setPreferredSize( new Dimension(800, 55));
          usernameLabel = new JTextField(20);
          usernameLabel.setText("Player Name: ");
          usernameLabel.setEditable(false);
          usernameLabel.setPreferredSize(new Dimension (400, 50));
          username = new JTextField(20);
          username.setMargin(new Insets (1,1,1,1));
          username.setPreferredSize(new Dimension (400, 50));
          POSHandler posHandlerUsername= new POSHandler();
          username.addActionListener(posHandlerUsername);
          //username.addActionListener(this);
          usernamePanel.add(usernameLabel);
          usernamePanel.add(username);
          add(usernamePanel);

          // do the same thing as usernamePanel
          JPanel adjectiveOnePanel = new JPanel();
          

          JPanel adjectiveTwoPanel = new JPanel();
          

          JPanel nounOnePanel = new JPanel();
         

          JPanel nounTwoPanel = new JPanel();
         

          // add button to its own class 
          
          finishStory.setPreferredSize( new Dimension ( 800, 20));
          

          JPanel backToStarterOnePanel = new JPanel();
          backToStarterOne = new JButton("Back to Main");
          backToStarterOne.setBounds(0,0, 100, 15);
          POSHandler posHandler= new POSHandler();
          backToStarterOne.addActionListener(posHandler);
          //backToStarterOne.addActionListener(this);
          backToStarterOne.setPreferredSize( new Dimension ( 800, 20));
          backToStarterOnePanel.add(backToStarterOne);
          backToStarterOnePanel.add(finishStory);
          add(backToStarterOnePanel);


      }

      class POSHandler implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
          {
              usernameVal = username.getText();
              System.out.println(usernameVal);
              // do for adjOneVal
             // do for adjTwoVal
              // do for nounOneVal
              // do for  nounTwoVal

              //check for backtostarter and go to the starter panel

              //check for finishStory button and go to the finished story panel
          }

      }
  }

  class FinishedStoryPanel extends JPanel
  {
      public FinishedStoryPanel()
      {
          setBackground(Color.WHITE);


      }

      public void paintComponent(Graphics g)
      {

          // draw the story with inserted variables
      }


  }

}
