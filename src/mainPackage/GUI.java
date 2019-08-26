package mainPackage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI implements ActionListener{
// Frame Size	
	private final static int frameX = 640;
	private final static int frameY = 480;
// Generate Frame	
	private static JFrame Frame = new JFrame("Java Roulette");
// Create Object to Roulette
	private Roulette Roulette = new Roulette();
// Generate Labels	
	private static JLabel Title1, BankLabel, BetLabel;
//Generate Buttons	
	private JButton BetRedBut = new JButton("Bet Red"); // Button Bet Red
	private JButton BetBlackBut = new JButton("Bet Black"); // Button Bet Black
	private JButton BetOddBut = new JButton("Bet Odd"); // Button Bet Odd
	private JButton BetEvenBut = new JButton("Bet Even"); // Button Bet Even
    private JButton BetNumBut = new JButton("Bet Number"); // Button Bet Number
    private JTextField NumField=new JFormattedTextField(); // Number Text field
	
// Create GUI
public void startGUI() {
		Roulette Roulette = new Roulette(); // Create Object Roulette 
// Set Frame 	
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Top right X terminates program
	    Frame.setSize(frameX,frameY); // Set Window Frame
// Title 1	    
	    Title1 = new JLabel("Welcome to Java Roulette");  // Create a Title label
	    Title1.setBounds(25,15, 200,30);  // Title Frame size
// Bank Label Status	    
	    BankLabel = new JLabel("Current Bank: $" + 	Roulette.getBank());  // Create a Bank Label status label
	    BankLabel.setBounds(475,15, 200,30);  // Bank Label Frame size
//----------------------------------------------------------------------------------------------
// Buttons	    
// Button Bet Red
	    BetRedBut.setBounds(25,55,105,30); // button frame size
	    BetRedBut.addActionListener(this); // Action Defined
// Button Bet Black
	    BetBlackBut.setBounds(25,105,105,30); // button frame size
	    BetBlackBut.addActionListener(this); // Action Defined
// Button Bet Odd
	    BetOddBut.setBounds(25,155,105,30); // button frame size
	    BetOddBut.addActionListener(this); // Action Defined
// Button Bet Even
	    BetEvenBut.setBounds(25,205,105,30); // button frame size	
	    BetEvenBut.addActionListener(this); // Action Defined
// Button Bet Number
	    BetNumBut.setBounds(25,255,105,30); // button frame size	
// Number Text field
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
// Action Triggers
	public void actionPerformed(ActionEvent event) {
// Bet Red Trigger		
		if (event.getSource() == BetRedBut) {
			System.out.println("You have bet on Red");
			 Roulette.Red();
		}
// Bet Black Trigger		
		else if (event.getSource() == BetBlackBut) {
			System.out.println("You have bet on Black");
			 Roulette.Black();
		}
// Bet Odd Trigger		
		else if (event.getSource() == BetOddBut) {
			 System.out.println("You have bet on Odd");
			 Roulette.Odd();
		}
// Bet Even Trigger		
		else if (event.getSource() == BetEvenBut) {
			System.out.println("You have bet on Even");
			 Roulette.Even();
		}
	}
}


