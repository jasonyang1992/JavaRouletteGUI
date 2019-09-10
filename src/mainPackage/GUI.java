package mainPackage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.Font;


public class GUI implements ActionListener{
// Frame Size	
	private final static int frameX = 640;
	private final static int frameY = 480;
// Generate Frame	
	private JFrame Frame = new JFrame("Java Roulette");
// Create Object to Roulette
	private Roulette Roulette = new Roulette();
// Generate Labels	
	private static JLabel Title1, BankLabel, BetLabel, StatusBetField, StatusBet, StatusWinnerLoser, StatusNumberColor;
//Generate Buttons	
	private JButton BetRedBut = new JButton("Bet Red"); // Button Bet Red
	private JButton BetBlackBut = new JButton("Bet Black"); // Button Bet Black
	private JButton BetOddBut = new JButton("Bet Odd"); // Button Bet Odd
	private JButton BetEvenBut = new JButton("Bet Even"); // Button Bet Even
    private JButton BetNumBut = new JButton("Bet Number"); // Button Bet Number
// Generate Text Fields    
    private JTextField NumField = new JFormattedTextField(); // Number Text field
    private JTextField BetField = new JFormattedTextField(); // Betting Text Field
	
// Create GUI
public void startGUI() {
// Set Frame 	
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Top right X terminates program
	    Frame.setSize(frameX,frameY); // Set Window Frame
// Title 1	    
	    Title1 = new JLabel("Welcome to Java Roulette");  // Create a Title label
	    Title1.setBounds(25,15, 250,30);  // Title Frame size
	    Title1.setFont(new Font("Times", Font.BOLD, 18)); // Set Font size and type
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
	    BetNumBut.addActionListener(this);
// Number Text field
	    NumField.setBounds(155, 262, 30,20);  
//-----------------------------------------------------------------------------------------------	    
// Betting 	    
// Bet Label	    
	    BetLabel = new JLabel("How much do you want to bet!");  // Create a Title label
	    BetLabel.setBounds(25,305, 200,30);  // Title Frame size
// Bet Text field
	    BetField.setBounds(210, 312, 100,20);  
// Status Bar
	   StatusBetField = new JLabel("Your previous bid was ");
	   StatusBetField.setBounds(475,35, 200,30);
	   StatusBet = new JLabel("Your previous bet was on");
	   StatusBet.setBounds(475,55, 200,30);
	   StatusNumberColor = new JLabel("");
	   StatusNumberColor.setBounds(475,75, 200,30);
	   StatusWinnerLoser = new JLabel("");
	   StatusWinnerLoser.setBounds(475,95, 200,30);
//-----------------------------------------------------------------------------------------------	    
// Frame add
	    Frame.add(StatusBetField);
	    Frame.add(StatusBet);
	    Frame.add(StatusWinnerLoser);
	    Frame.add(StatusNumberColor);
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
			 Roulette.Red();
			 try {
				 Roulette.setBet(Integer.parseInt(BetField.getText()));
			 }
			 catch (Exception e) {
				 
			 }
			 if (Roulette.WinLose() == true) {
				 Roulette.GainBank();
				 BankLabel.setText("Current Bank: $" + 	Roulette.getBank());
				 StatusWinnerLoser.setText("You Win, it is red");
			 }
			 else if (Roulette.WinLose() == false) {
				 Roulette.LoseBank();
				 BankLabel.setText("Current Bank: $" + 	Roulette.getBank());
				 StatusWinnerLoser.setText("You Lose, it is black");
			 }
			 StatusBet.setText("Your previous bet was on red");
			 StatusNumberColor.setText("The number is " + Roulette.getRouletteNumber());
			 StatusBetField.setText("Your previous bet was $" + Integer.parseInt(BetField.getText()));
		}
// Bet Black Trigger		
		else if (event.getSource() == BetBlackBut) {
			 Roulette.Black();
			 try {
				 Roulette.setBet(Integer.parseInt(BetField.getText()));
			 }
			 catch (Exception e) {
				 
			 }
			 if (Roulette.WinLose() == true) {
				 Roulette.GainBank();
				 BankLabel.setText("Current Bank: $" + 	Roulette.getBank());
				 StatusWinnerLoser.setText("You Win, it is black");
			 }
			 else if (Roulette.WinLose() == false) {
				 Roulette.LoseBank();
				 BankLabel.setText("Current Bank: $" + 	Roulette.getBank());
				 StatusWinnerLoser.setText("You Lose, it is red");
			 }
			 StatusBet.setText("Your previous bet was on black");
			 StatusNumberColor.setText("The number is " + Roulette.getRouletteNumber());
			 StatusBetField.setText("Your previous bet was $" + Integer.parseInt(BetField.getText()));
		}
// Bet Odd Trigger		
		else if (event.getSource() == BetOddBut) {
			 Roulette.Odd();
			 try {
				 Roulette.setBet(Integer.parseInt(BetField.getText()));
			 }
			 catch (Exception e) {
				 
			 }
			 if (Roulette.WinLose() == true) {
				 Roulette.GainBank();
				 BankLabel.setText("Current Bank: $" + 	Roulette.getBank());
				 StatusWinnerLoser.setText("You Win, it is odd");
			 }
			 else if (Roulette.WinLose() == false) {
				 Roulette.LoseBank();
				 BankLabel.setText("Current Bank: $" + 	Roulette.getBank());
				 StatusWinnerLoser.setText("You Lose, it is even");
			 }
			 StatusBet.setText("Your previous bet was on odd");
			 StatusNumberColor.setText("The number is " + Roulette.getRouletteNumber());
			 StatusBetField.setText("Your previous bet was $" + Integer.parseInt(BetField.getText()));
		}
// Bet Even Trigger		
		else if (event.getSource() == BetEvenBut) {
			 Roulette.Even();
			 try {
				 Roulette.setBet(Integer.parseInt(BetField.getText()));
			 }
			 catch (Exception e) {
				 
			 }
			 if (Roulette.WinLose() == true) {
				 Roulette.GainBank();
				 BankLabel.setText("Current Bank: $" + 	Roulette.getBank());
				 StatusWinnerLoser.setText("You Win, it is even");
			 }
			 else if (Roulette.WinLose() == false) {
				 Roulette.LoseBank();
				 BankLabel.setText("Current Bank: $" + 	Roulette.getBank());
				 StatusWinnerLoser.setText("You Lose, it is odd");
			 }
			 StatusBet.setText("Your previous bet was on even");
			 StatusNumberColor.setText("The number is " + Roulette.getRouletteNumber());
			 StatusBetField.setText("Your previous bet was $" + Integer.parseInt(BetField.getText()));
		}
// Bet Number Trigger		
		else if (event.getSource() == BetNumBut) {
			Roulette.Number();
			
			 try {
				 Roulette.setBet(Integer.parseInt(BetField.getText()));
			 }
			 catch (Exception e) {
				 
			 }
			
			if (Roulette.getRouletteNumber() == Integer.parseInt(NumField.getText())) {
				Roulette.GainBank36T();
				 BankLabel.setText("Current Bank: $" + 	Roulette.getBank());
				 StatusWinnerLoser.setText("You Win, it is " + Integer.parseInt(NumField.getText()));
			}
			else {
				Roulette.LoseBank();
				 BankLabel.setText("Current Bank: $" + 	Roulette.getBank());
				 StatusWinnerLoser.setText("You Lose, it is " + Roulette.getRouletteNumber());
			}
			StatusNumberColor.setText("The number is " + Roulette.getRouletteNumber());
			StatusBetField.setText("Your previous bet was $" + Integer.parseInt(BetField.getText()));
		}
	}
}


