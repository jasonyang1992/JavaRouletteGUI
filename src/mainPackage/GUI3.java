package mainPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class GUI3 {

// Create JFrame
		private JFrame frame = new JFrame("Java Roulette");
// Frame Size
		private final int FRAMEX = 640;
		private final int FRAMEY = 480;
// Create Object to Roulette
		private Roulette Roulette = new Roulette();
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
			frame.setSize(FRAMEX,FRAMEY);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	JPanel backgroundPanel = new JPanel();
			backgroundPanel.setLayout(new GridBagLayout());
			GridBagConstraints GBC = new GridBagConstraints();
			backgroundPanel.setBackground(Color.GREEN);
			frame.add(backgroundPanel);		
			
			Border blackline = BorderFactory.createLineBorder(Color.black);
			
			JPanel TitlePanel = new JPanel();
			GBC.gridx = 0;
			GBC.gridy = 0;
			GBC.gridheight = 1;
			GBC.gridwidth = 6;
			GBC.insets = new Insets(15,15,0,15);
			GBC.fill = GridBagConstraints.BOTH;
			TitlePanel.setBorder(blackline);
			TitlePanel.setBackground(Color.WHITE);
			backgroundPanel.add(TitlePanel, GBC);
			
			JLabel Title = new JLabel("Welcome to Java Roulette");
			Title.setFont(new Font("Times", Font.BOLD, 22));
			TitlePanel.add(Title);
			
			JPanel buttonPanel = new JPanel();
			GBC.gridx = 0;
			GBC.gridy = 1;
			GBC.gridheight = 3;
			GBC.gridwidth = 1;
			GBC.insets = new Insets(15,15,15,5);
			GBC.fill = GridBagConstraints.BOTH;
			GBC.weightx = .25;
			GBC.weighty = .25;
			buttonPanel.setBorder(blackline);
			buttonPanel.setBackground(Color.WHITE);
			buttonPanel.setLayout(new GridLayout(5,1));
			backgroundPanel.add(buttonPanel, GBC);
			
			buttonPanel.add(betRedBut);
			buttonPanel.add(betBlackBut);
			buttonPanel.add(betOddBut);
			buttonPanel.add(betEvenBut);
			buttonPanel.add(betNumBut);
			
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
			
			JLabel bettingNumberLabel = new JLabel("Bet Number:");
			bettingNumberLabel.setHorizontalAlignment(JLabel.CENTER);
			statusPanel.add(bettingNumberLabel);
			
			statusPanel.add(bettingNumField);
			
			JLabel currentBank = new JLabel("Current Bank: 10000");
			currentBank.setHorizontalAlignment(JLabel.CENTER);
			statusPanel.add(currentBank);
			
			JLabel moneyBet = new JLabel("How much do you want to bet:");
			moneyBet.setHorizontalAlignment(JLabel.CENTER);
			statusPanel.add(moneyBet);
			
			statusPanel.add(bettingBetField);
			
			JLabel rouletteNumber = new JLabel("The number is:");
			rouletteNumber.setHorizontalAlignment(JLabel.CENTER);
			statusPanel.add(rouletteNumber);
			
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
}
