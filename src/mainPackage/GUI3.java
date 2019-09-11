package mainPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class GUI3 implements ActionListener{

// Create JFrame
		private JFrame frame = new JFrame("Java Roulette");
// Frame Size
		private final int FRAMEX = 640;
		private final int FRAMEY = 480;
// Create Object to Roulette
		private Roulette Roulette = new Roulette();
// Create Labels
		private JLabel currentBankLabel, statusLabel;
//Create Buttons
		private JButton betRedBut = new JButton("Bet Red"); // Button Bet Red
		private JButton betBlackBut = new JButton("Bet Black"); // Button Bet Black
		private JButton betOddBut = new JButton("Bet Odd"); // Button Bet Odd
		private JButton betEvenBut = new JButton("Bet Even"); // Button Bet Even
	    private JButton betNumBut = new JButton("Bet Number"); // Button Bet Number
// Create TextField  
	    private JTextField bettingNumField = new JFormattedTextField(); // Number Text field
	    private JTextField bettingBetField = new JFormattedTextField(); // Betting Text Field
	    
	    public void startGUI() 
	    {
			frame.setSize(FRAMEX,FRAMEY); // Defines Frame size
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit program after pressing X on the top right
	    	JPanel backgroundPanel = new JPanel(); // Create background panel
			backgroundPanel.setLayout(new GridBagLayout()); // set layor to grid bag layout
			GridBagConstraints GBC = new GridBagConstraints(); // Define Constraints
			backgroundPanel.setBackground(Color.GREEN); // Set Background color to green
			frame.add(backgroundPanel); // add panel to frame
			
			Border blackline = BorderFactory.createLineBorder(Color.black); // Generate border line solid black
// Grid 0,0			
			JPanel TitlePanel = new JPanel(); // Title panel
			GBC.gridx = 0;
			GBC.gridy = 0;
			GBC.gridheight = 1;
			GBC.gridwidth = 6; // set width to 6 blocks
			GBC.insets = new Insets(15,15,0,15); // padding
			GBC.fill = GridBagConstraints.BOTH;
			TitlePanel.setBorder(blackline);
			TitlePanel.setBackground(Color.WHITE);
			backgroundPanel.add(TitlePanel, GBC);
// Create Title Label			
			JLabel Title = new JLabel("Welcome to Java Roulette");
			Title.setFont(new Font("Times", Font.BOLD, 22)); // set font size
			TitlePanel.add(Title);
// Grid at 0,1			
			JPanel buttonPanel = new JPanel();
			GBC.gridx = 0;
			GBC.gridy = 1;
			GBC.gridheight = 3;
			GBC.gridwidth = 1;
			GBC.insets = new Insets(15,15,15,5);
			GBC.fill = GridBagConstraints.BOTH;
			GBC.weightx = .25; // stretch size 
			GBC.weighty = .25; // stretch size 
			buttonPanel.setBorder(blackline); // set border black
			buttonPanel.setBackground(Color.WHITE); // set background of Button white
			buttonPanel.setLayout(new GridLayout(5,1)); // grid layout for buttons top to bottom
			backgroundPanel.add(buttonPanel, GBC);
// Generate Buttons			
			buttonPanel.add(betRedBut);
		    betRedBut.addActionListener(this); // Action Defined
			buttonPanel.add(betBlackBut);
		    betBlackBut.addActionListener(this); // Action Defined
			buttonPanel.add(betOddBut);
		    betOddBut.addActionListener(this); // Action Defined
			buttonPanel.add(betEvenBut);
		    betEvenBut.addActionListener(this); // Action Defined
			buttonPanel.add(betNumBut);
		    betNumBut.addActionListener(this); // Action Defined
// Game Panel picture			
			JPanel gamePanel = new JPanel();
			GBC.gridx = 1;
			GBC.gridy = 1;
			GBC.gridheight = 3;
			GBC.gridwidth = 3;
			GBC.insets = new Insets(15,15,15,15);	
			GBC.fill = GridBagConstraints.BOTH;
			GBC.weightx = 1;
			GBC.weighty = 1;
			gamePanel.setBorder(blackline);
			gamePanel.setBackground(Color.RED);
			backgroundPanel.add(gamePanel, GBC);
// Status panel display status			
			JPanel statusPanel = new JPanel();
			GBC.gridx = 0;
			GBC.gridy = 5;
			GBC.gridheight = 1;
			GBC.gridwidth = 6;
			GBC.weightx = 0;
			GBC.weighty = 0;
			GBC.insets = new Insets(0,15,5,15);
			GBC.fill = GridBagConstraints.BOTH;
			statusPanel.setBorder(blackline);
			statusPanel.setBackground(Color.WHITE);
			statusPanel.setLayout(new GridLayout(2,3));
			backgroundPanel.add(statusPanel, GBC);
// Text for betting number			
			JLabel bettingNumberLabel = new JLabel("Bet Number:");
			bettingNumberLabel.setHorizontalAlignment(JLabel.CENTER);
			statusPanel.add(bettingNumberLabel);
// Field to grab betting number			
			statusPanel.add(bettingNumField);
// Display Bank statement			
			currentBankLabel = new JLabel("Current Bank: $" + Roulette.getBank());
			currentBankLabel.setHorizontalAlignment(JLabel.CENTER);
			statusPanel.add(currentBankLabel);
// Text for how much you want to bet			
			JLabel moneyBet = new JLabel("How much do you want to bet:");
			moneyBet.setHorizontalAlignment(JLabel.CENTER);
			statusPanel.add(moneyBet);
// Field to grab money bet			
			statusPanel.add(bettingBetField);
// Display out comes			
			statusLabel = new JLabel("");
			statusLabel.setHorizontalAlignment(JLabel.CENTER);
			statusPanel.add(statusLabel);
// Reset GBC variables			
			GBC.gridx = 0;
			GBC.gridy = 0;
			GBC.gridheight = 0;
			GBC.gridwidth = 0;
			GBC.weightx = 0;
			GBC.weighty = 0;
			GBC.insets = new Insets(0,0,0,0);
			GBC.fill = GridBagConstraints.NONE;
			
			frame.setVisible(true);
	    }
// Trigger Events	    
	public void actionPerformed(ActionEvent event) {
// Bet Red Trigger		
		if (event.getSource() == betRedBut) {
			 try {
				 Roulette.setBet(Integer.parseInt(bettingBetField.getText())); // Grab betting value
				 Roulette.Red(); // Roll the ball color
				 
				 if (Roulette.WinLose() == true) {
					 Roulette.GainBank(); // Calculate Gains
					 currentBankLabel.setText("Current Bank: $" + 	Roulette.getBank()); // Display Gains
					 statusLabel.setText("It is red and the number is " + Roulette.getRouletteNumber()); // Display output
				 }
				 else if (Roulette.WinLose() == false) {
					 Roulette.LoseBank(); // Calculate losses
					 currentBankLabel.setText("Current Bank: $" + 	Roulette.getBank()); // Display Loss 
					 statusLabel.setText("It is black and the number is " + Roulette.getRouletteNumber()); // Display output
				 }
			 }
			 catch (Exception e) {
				 errorMessage(); // Display error message
			 }
		}
// Bet Black Trigger		
		else if (event.getSource() == betBlackBut) {
			 try {
				 Roulette.setBet(Integer.parseInt(bettingBetField.getText())); // Grab betting value
				 Roulette.Black();
				 
				 if (Roulette.WinLose() == true) {
					 Roulette.GainBank();
					 currentBankLabel.setText("Current Bank: $" + 	Roulette.getBank()); // Display Gains
					 statusLabel.setText("It is black and the number is " + Roulette.getRouletteNumber()); // Display output
				 }
				 else if (Roulette.WinLose() == false) {
					 Roulette.LoseBank(); // Calculate losses
					 currentBankLabel.setText("Current Bank: $" + 	Roulette.getBank()); // Display Loss 
					 statusLabel.setText("It is red and the number is " + Roulette.getRouletteNumber()); // Display output
				 }
			 }
			 catch (Exception e) {
				 errorMessage(); // Display error message
			 }
		}
// Bet Odd Trigger		
		else if (event.getSource() == betOddBut) {
			 try {
				 Roulette.setBet(Integer.parseInt(bettingBetField.getText())); // Grab betting value
				 Roulette.Odd();
				 
				 if (Roulette.WinLose() == true) {
					 Roulette.GainBank();
					 currentBankLabel.setText("Current Bank: $" + 	Roulette.getBank()); // Display Gains
					 statusLabel.setText("It is odd and the number is " + Roulette.getRouletteNumber()); // Display output
				 }
				 else if (Roulette.WinLose() == false) {
					 Roulette.LoseBank(); // Calculate losses
					 currentBankLabel.setText("Current Bank: $" + 	Roulette.getBank()); // Display Loss 
					 statusLabel.setText("It is even and the number is " + Roulette.getRouletteNumber()); // Display output
				 }
			 }
			 catch (Exception e) {
				 errorMessage(); // Display error message
			 }
		}
// Bet Even Trigger		
		else if (event.getSource() == betEvenBut) {
			 try {
				 Roulette.setBet(Integer.parseInt(bettingBetField.getText())); // Grab betting value
				 Roulette.Even();
				 
				 if (Roulette.WinLose() == true) {
					 Roulette.GainBank();
					 currentBankLabel.setText("Current Bank: $" + 	Roulette.getBank()); // Display Gains
					 statusLabel.setText("It is even and the number is " + Roulette.getRouletteNumber()); // Display output
				 }
				 else if (Roulette.WinLose() == false) {
					 Roulette.LoseBank(); // Calculate losses
					 currentBankLabel.setText("Current Bank: $" + 	Roulette.getBank()); // Display Loss 
					 statusLabel.setText("It is odd and the number is " + Roulette.getRouletteNumber()); // Display output
				 }
			 }
			 catch (Exception e) {
				 errorMessage(); // Display error message
			 }
		}
// Bet Number Trigger		
		else if (event.getSource() == betNumBut) {		
			 try {
				Roulette.setBet(Integer.parseInt(bettingBetField.getText())); // Grab betting value
				Roulette.Number();
				
				if (Roulette.getRouletteNumber() == Integer.parseInt(bettingNumField.getText())) {
					Roulette.GainBank36T();
					currentBankLabel.setText("Current Bank: $" + 	Roulette.getBank()); // Display Gains
					statusLabel.setText("The number is " + Roulette.getRouletteNumber()); // Display output
				}
				else {
					Roulette.LoseBank();
					currentBankLabel.setText("Current Bank: $" + 	Roulette.getBank()); // Display Gains
					statusLabel.setText("The number is " + Roulette.getRouletteNumber()); // Display output
				}
			 }
			 catch (Exception e) {
				errorMessage(); // Display error message
			 }
		}		
	}
	
	private void errorMessage() {
		JOptionPane.showMessageDialog(null, "You have enter an invalid bet or number, Please try again!"); // Error pop up message
	}
	
}
