//Emad Al-Gailani
//game number 2 
// the puzzle Game
import java.awt.BorderLayout; // for the border layout if the user zoom the game it wouldnt matter
import java.awt.Dimension;  // to look through the dimintion of the puzzle
import java.awt.GridLayout; // to make sure there is 3*3
import javax.swing.JButton; // for the buttons 
import java.awt.event.ActionEvent; // action listner of the buttons
import java.awt.event.ActionListener;// action listner of the buttons
import javax.swing.*; // for joptionpane



public class emadPuzzle extends JFrame implements ActionListener{ // main class and name
  
      public static void main(String[] args) { // main class
            // the intruduction jframe with buttons of play rule and about
            final JFrame puzzleGame = new JFrame(); 
            JButton begin = new JButton("begin the game");
          begin.setBounds(100, 200, 220, 30);
                 JButton about = new JButton("about");
          about.setBounds(100, 280, 220, 30);
                    JButton rules = new JButton("Rules");
          rules.setBounds(100, 240, 220, 30);
          // action listener for begin button 
          begin.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e ) {
              puzzleGame.setVisible (false);
              new emadPuzzle("Puzzle", "C://maze//puzzle.png");   
              return;
            }
          });
          // action listener for about button 
               about.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e ) {
             JOptionPane.showMessageDialog(null," The maker of the game is Emad Al-Gailani\n\t\t                   Virsion 1.0");
               return;
            }
          });
               // action listner for rule button
                 rules.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e ) {
             JOptionPane.showMessageDialog(null," Slide Puzzle - Artfully headaches!\n\n The pieces are to be pushed around over the board\n until the numbers from 1 to 8 is complete.\nThe pieces are numbered so that you will know in which\n order they should be.You can only\n move one piece at a time and you do it by clicking on it.\nWhen you want to move several pieces,\n you must click on one piece at a time.\nThe number on each piece tells where in\n the puzzle it belongs.The piece marked 1 should be\n in the upper left corner of the slide puzzle.\n\nThats it enjoy"); 
               return;
            }
          });
          // the things that jframe need hight pictures and etc
         puzzleGame.setContentPane(new JLabel(new ImageIcon("C://maze//puzzle.png")));
        puzzleGame.add(begin);
         puzzleGame.add(about);
                  puzzleGame.add(rules);
    puzzleGame.setTitle("The puzzle game");
    puzzleGame.setLayout(null);
    puzzleGame.setSize(500, 600);
    puzzleGame.setVisible(true);
    puzzleGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
    }
      
 int array[][]; //2d arrays for the posstion of the array
    int pick[] = {1,2,3,4,5,6,7,8,9};  // keep track of where the pieces are 
  JPanel puzzlePanal; // the jpanal for the main scrren
    JButton[][] click= new JButton[3][3]; // j buttons to the array for the cliking of numberes 
  String Title; // to load the jpanal from the file

 // this public ro load the main jframe, for, the shuffle 
public emadPuzzle(String Title, String Source){
            set();
         }

// the set method for the 2d arrays where the shuffle method take take oit from and the buttons     
   public void set(){
        // 2d array fro the 9 puzzle game
        array = new int[][] {
                {0, 1, 2}, 
                {3, 4, 5}, 
                {6, 7, 8}};

// this is where the buttons for the jframe were created from 1to 8   
         // jpanla for the puzzle game
         puzzlePanal = new JPanel();
         puzzlePanal.setLayout(new GridLayout(3, 3, 0, 0)); // 3x3 for the buttons 
        add(puzzlePanal, BorderLayout.CENTER);
        
     // button 0 that doesnt have any number on it
         click[0][0] = new JButton();
         puzzlePanal.add(  click[0][0]);
         pick [0] = 9;
         
         // Button 2
        click[0][1] = new JButton();
           click[0][1].addActionListener(this);
         puzzlePanal.add(  click[0][1]);
         click[0][1].setIcon(new ImageIcon("C://maze//four.png"));
         click[0][1].setVisible(true);
         pick[1] = 4;
         
         //Button 3
          click[0][2] = new JButton(); // the position of the putton 
          click[0][2].addActionListener(this); // add listener for the button 
         puzzlePanal.add(  click[0][2]); // adding the button to the jframe
          click[0][2].setIcon(new ImageIcon("C://maze//six.png")); // picutre 
         click[0][2].setVisible(true); // the button is visible
         pick[2] = 6; // detemining that the button cliked is 6 
         
       //Button 4
         click[1][0] = new JButton();
          click[1][0].addActionListener(this);
         puzzlePanal.add(  click[1][0]);
        click[1][0].setIcon(new ImageIcon("C://maze//two.png"));
          click[1][0].setVisible(true);
         pick[3] = 2;
       //Button 5
         
         click[1][1] = new JButton();
          click[1][1].addActionListener(this);
         puzzlePanal.add(  click[1][1]);
          click[1][1].setIcon(new ImageIcon("C://maze//seven.png"));
          click[1][1].setVisible(true);
         pick[4] = 7;
         
       //Button 6
         click[1][2] = new JButton();
         click[1][2].addActionListener(this);
         puzzlePanal.add(  click[1][2]);
          click[1][2].setIcon(new ImageIcon("C://maze//eight.png"));
         click[1][2].setVisible(true);
         pick[5] = 8;
         
       //Button 7
        click[2][0] = new JButton();
          click[2][0].addActionListener(this);
         puzzlePanal.add(  click[2][0]);
          click[2][0].setIcon(new ImageIcon("C://maze//three.png"));
         click[2][0].setVisible(true);
         pick[6] = 3;
         
       //Button 8
           click[2][1] = new JButton();
          click[2][1].addActionListener(this);
         puzzlePanal.add(  click[2][1]);
          click[2][1].setIcon(new ImageIcon("C://maze//fine.png"));
           click[2][1].setVisible(true);
         pick[7] = 5;
         
       //Button 9
         click[2][2] = new JButton();
         click[2][2].addActionListener(this);
         puzzlePanal.add(  click[2][2]);
         click[2][2].setIcon(new ImageIcon("C://maze//one.png"));
          click[2][2].setVisible(true);
         pick[8] = 1;

        
// jframe for the buton     
       setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    } // end of the set method 
   
// action performed method for the action lister method 
    public void actionPerformed(ActionEvent e){

     JButton button = (JButton) e.getSource(); // the button button
        Dimension size = button.getSize(); // the dimenstion for allowing the size and width
        
        //all ints are to detrimine f the moves of the buttons to tell them to lock for the empty button 
        int emptyX =  click[0][0].getX(); // the empty button from the pramiter of x
        int emptyY =   click[0][0].getY(); //  the empty button from the pramiter of y
  int buttonX = button.getX(); // the cordiante for the x positions buttons 
        int buttonY = button.getY(); // the cordiante for the y positions buttons 
        int buttonPosX = buttonX / size.width; //  to destrime the possiton of the x button
        int buttonPosY = buttonY / size.height; // to detrimine the position of the y buttons 
        int whenCliked = array[buttonPosY][buttonPosX]; // array for the possiton of each button
  
         // the posstion of the upper hight 
   if (emptyX == buttonX && (emptyY - buttonY) == size.height ) {          
             int labelIndex = whenCliked + 3;
             puzzlePanal.remove(whenCliked );
             puzzlePanal.add(  click[0][0],whenCliked );
             puzzlePanal.add(button,labelIndex);
             puzzlePanal.validate();

             int a = pick[whenCliked ];
             pick[whenCliked ] = pick[labelIndex];
             pick[labelIndex] = a;              
        }
        // The possiton of the down hight 
        if (emptyX == buttonX && (emptyY - buttonY) == -size.height ) {

             int labelIndex = whenCliked - 3;
             puzzlePanal.remove(labelIndex);
             puzzlePanal.add(button,labelIndex);
             puzzlePanal.add(  click[0][0],whenCliked );

             puzzlePanal.validate();
             int a = pick[whenCliked ];
             pick[whenCliked ] = pick[labelIndex];
             pick[labelIndex] = a; 
        }
        // the posstion of the left width
        if (emptyY == buttonY && (emptyX - buttonX) == size.width ) {

             int labelIndex = whenCliked + 1;        
             puzzlePanal.remove(whenCliked );
             puzzlePanal.add(  click[0][0], whenCliked );
             puzzlePanal.add(button,labelIndex);                                 
             puzzlePanal.validate(); 
             int a = pick[whenCliked ];
             pick[whenCliked ] = pick[labelIndex];
             pick[labelIndex] = a; 
        }
         // the posstion of the right width
        if (emptyY == buttonY && (emptyX - buttonX) == -size.width ) {

             int labelIndex = whenCliked - 1;            
             puzzlePanal.remove(whenCliked );
             puzzlePanal.add(  click[0][0], labelIndex);
             puzzlePanal.add(button,labelIndex);
             puzzlePanal.validate();

             int a = pick[whenCliked ];
             pick[whenCliked ] = pick[labelIndex];
             pick[labelIndex] = a; 
        } 
       // destrming that the user did all of the buttons on the correct postion, if he did, it will tell him that he wons 
    if(pick[0] == 1 &&
       pick[1] == 2 &&
       pick[2] == 3 &&
       pick[3] == 4 &&
       pick[4] == 5 &&
       pick[5] == 6 &&
       pick[6] == 7 &&
       pick[7] == 8 &&
       pick[8] == 9){
      // giving the winner messsage and asking to paly again
      setVisible (false);
      puzzlePanal.setVisible (false);
      final   JFrame Win = new JFrame();
      JButton again = new JButton("Play again");
      again.setBounds(100, 240, 220, 30);
      
      again.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e ) {
          Win.setVisible (false);
          puzzlePanal.setVisible (false);
          setVisible (false);
          set();
          
        }
      });
      Win.setContentPane(new JLabel(new ImageIcon("C://maze//win.jpg")));
      Win.add(again);
      
      Win.setTitle("Winner");
      Win.setSize(500, 600);
      Win.setVisible(true);
      Win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    } // end of if winer 
  } // end of action perfomed method
  } // end of main class
