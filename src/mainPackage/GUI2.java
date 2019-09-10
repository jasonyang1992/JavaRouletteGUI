package mainPackage;
import javax.swing.*;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.border.*;

public class GUI2 {

// Create JFrame
	private JFrame Frame = new JFrame("Java Roulette");
// Create Object to Roulette
	private Roulette Roulette = new Roulette();
// Create Labels variables
	private JLabel Title, CurrentBankStatus;
// Create Panel
	private JPanel Panel = new JPanel();
//	Create Buttons
	private JButton BetRedBut = new JButton("Bet Red"); // Button Bet Red
	private JButton BetBlackBut = new JButton("Bet Black"); // Button Bet Black
	private JButton BetOddBut = new JButton("Bet Odd"); // Button Bet Odd
	private JButton BetEvenBut = new JButton("Bet Even"); // Button Bet Even
    private JButton BetNumBut = new JButton("Bet Number"); // Button Bet Number
// Create TextField  
    private JTextField NumField = new JFormattedTextField(); // Number Text field
    private JTextField BetField = new JFormattedTextField(); // Betting Text Field
// Set size for buttons
    private int butSizeX = 125;
    private int butSizeY = 35;
 // Create GUI   
	public void StartGUI() {
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Create exit button top right
		GridBagConstraints GBC = new GridBagConstraints(); // GridbagConstraint format
		Frame.setVisible(true); // Show Frame
// Show Panel		
		Frame.add(Panel);
		Panel.setLayout(new GridBagLayout());  // layout to be GridBag 
		Border blackline = BorderFactory.createLineBorder(Color.black);
		// Panel.setBackground(Color.decode("#3399ff"));
// Setting Grid Coordinates
//------------------------------------------------------------------------------------------------------		
		// Column 0
//------------------------------------------------------------------------------------------------------	
// Create Title		
		JLabel Title = new JLabel("Welcome to Java Roulette");
		Title.setFont(new Font("Times", Font.BOLD, 22)); // Set Font size and type
		Title.setBorder(blackline);
		GBC.gridx = 0; 
		GBC.gridy = 0;
		GBC.gridwidth = 2; // create width to take 2 rows
		GBC.insets = new Insets(0,0,10,0); // padding
		GBC.anchor = GridBagConstraints.CENTER; // Move object to the left
		Panel.add(Title, GBC);
// Reset gridwidth and anchor
		GBC.gridwidth = 1; // reset the width to 1
		GBC.anchor = GridBagConstraints.EAST; // Set objects to left
// Bet Red Button
		GBC.gridx = 0;
		GBC.gridy = 1;
		BetRedBut.setPreferredSize(new Dimension(butSizeX,butSizeY));
		Panel.add(BetRedBut, GBC);
// Bet Black Button
		GBC.gridx = 0;
		GBC.gridy = 2;
		BetBlackBut.setPreferredSize(new Dimension(butSizeX,butSizeY));
		Panel.add(BetBlackBut, GBC);
// Bet Odd Button
		GBC.gridx = 0;
		GBC.gridy = 3;
		BetOddBut.setPreferredSize(new Dimension(butSizeX,butSizeY));
		Panel.add(BetOddBut, GBC);
// Bet Even Button
		GBC.gridx = 0;
		GBC.gridy = 4;
		BetEvenBut.setPreferredSize(new Dimension(butSizeX,butSizeY));
		Panel.add(BetEvenBut, GBC);
// Bet Number Button
		GBC.gridx = 0;
		GBC.gridy = 5;
		BetNumBut.setPreferredSize(new Dimension(butSizeX,butSizeY));
		GBC.insets = new Insets(0,0,0,0);
		Panel.add(BetNumBut, GBC);
//------------------------------------------------------------------------------------------------------		
	// Column 1
//------------------------------------------------------------------------------------------------------		
// Create Current Bank Status
		JLabel CurrentBankStatus = new JLabel("Your Current Bankstatement is $10000");
		GBC.gridx = 1;
		GBC.gridy = 1;
		GBC.insets = new Insets(0,15,0,0);
		GBC.anchor = GridBagConstraints.NORTHWEST; 
		Panel.add(CurrentBankStatus, GBC);
// Create Previous Bet
		JLabel PreviousBetStatus = new JLabel("Your previous bet was $500");
		GBC.gridx = 1;
		GBC.gridy = 1;
		GBC.anchor = GridBagConstraints.SOUTHWEST; 
		Panel.add(PreviousBetStatus, GBC);
// Create Current Number Roulette
		JLabel RouletteNumber = new JLabel("The current number is 32 and it is black");
		GBC.gridx = 1;
		GBC.gridy = 2;
		GBC.anchor = GridBagConstraints.WEST; 
		Panel.add(RouletteNumber, GBC);
// Create Roulette Number
		JLabel BettingNumber = new JLabel("The Roulette Number is: 32");
		GBC.gridx = 1;
		GBC.gridy = 3;
		GBC.anchor = GridBagConstraints.NORTHWEST; 
		Panel.add(BettingNumber, GBC);
// Create How much you want to bet
		JLabel Current = new JLabel("Betting number 123");
		GBC.gridx = 1;
		GBC.gridy = 3;
		GBC.anchor = GridBagConstraints.SOUTHWEST; 
		Panel.add(Current, GBC);
		
		Frame.setResizable(false); // Cannot maximize the window size
		Frame.pack(); // Show minimum amount of the frame
	}

}
