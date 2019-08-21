package mainPackage;
import javax.swing.*;
import java.awt.*;

public class GUI {
	private final static int frameX = 640;
	private final static int frameY = 480;
	private static JLabel Title1, BankLabel, BetLabel;
	private static JFrame Frame = new JFrame("Java Roulette");
	
// Create GUI
public static void startGUI() {
	Roulette Roulette = new Roulette(); // Create Object Roulette 
// Set Frame 	
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Top right X terminates program
	    Frame.setSize(frameX,frameY); // Set Window Frame
// Title 1	    
	    Title1 = new JLabel("Welcome to Java Roulette");  // Create a Title label
	    Title1.setBounds(25,15, 200,30);  // Title Frame size
// Bank Label Status	    
	    BankLabel = new JLabel("Current Bank: " + 	Roulette.getBank());  // Create a Bank Label status label
	    BankLabel.setBounds(475,15, 200,30);  // Bank Label Frame size
//----------------------------------------------------------------------------------------------
// Buttons	    
// Button Bet Red
	    JButton BetRedBut = new JButton("Bet Red"); // Create button + Name of button
	    BetRedBut.setBounds(25,55,105,30); // button frame size
// Button Bet Black
	    JButton BetBlackBut = new JButton("Bet Black"); // Create button + Name of button
	    BetBlackBut.setBounds(25,105,105,30); // button frame size	   
// Button Bet Odd
	    JButton BetOddBut = new JButton("Bet Odd"); // Create button + Name of button
	    BetOddBut.setBounds(25,155,105,30); // button frame size	  
// Button Bet Even
	    JButton BetEvenBut = new JButton("Bet Even"); // Create button + Name of button
	    BetEvenBut.setBounds(25,205,105,30); // button frame size	
// Button Bet Number
	    JButton BetNumBut = new JButton("Bet Number"); // Create button + Name of button
	    BetNumBut.setBounds(25,255,105,30); // button frame size	
// Number Text field
	    JTextField NumField=new JFormattedTextField(); 
	    NumField.setBounds(155, 262, 30,20);  
//-----------------------------------------------------------------------------------------------	    
// Betting 	    
// Bet Label	    
	    BetLabel = new JLabel("How much do you want to bet!");  // Create a Title label
	    BetLabel.setBounds(25,305, 200,30);  // Title Frame size
// Bet Text field
	    JTextField BetField=new JFormattedTextField(); 
	    BetField.setBounds(210, 312, 100,20);  
//-----------------------------------------------------------------------------------------------	    
// Frame add	    
	    Frame.add(Title1); // Show Title1
	    Frame.add(BankLabel); // Bank Status
	    Frame.add(BetRedBut); // Show Bet on Red
	    Frame.add(BetBlackBut); // Show Bet on Black
	    Frame.add(BetOddBut); // Show Bet on Odd
	    Frame.add(BetEvenBut); // Show Bet on Even
	    Frame.add(BetNumBut); // Show Bet on Number
	    Frame.add(BetLabel); // Bet Label 
	    Frame.add(BetField); // Bet Text Field
	    Frame.add(NumField); // Number Text Field
	    Frame.setLayout(null);  // Remove layout and enable free layout
	    Frame.setVisible(true); // Shows the GUI
	}
}


