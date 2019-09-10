package mainPackage;

public class Roulette {

// Bank Variables
	private int BankStatement = 10000;
	private int CurrentBet;
// Roulette Number Variables
	private static int RouletteNumber;
// Roulette Colors Variables
	private static int RedNum[] = {1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36}; // Numbers that are red
	private static int BlackNum[] = {2,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33,35};  // Numbers that are black
	private static int PlaceHolder; // just a place holder
	private static String RoutletteColor = ""; // Color
	private boolean WinnerLoser; // Determines win or lose
	
// Bank Statement methods	
	public void setBank(int Bank) {
		this.BankStatement = Bank;
	}
	
	public int getBank() {
		return BankStatement;
	}
	
	public int GainBank() {
		BankStatement = BankStatement + CurrentBet;
		return BankStatement;
	}
	
	public int GainBank36T() {
		BankStatement = BankStatement + CurrentBet*36;
		return BankStatement;
	}
	
	public int LoseBank() {
		BankStatement = BankStatement - CurrentBet;
		return BankStatement;
	}
// Set Bet	
	public void setBet(int SettingBet) {
		this.CurrentBet = SettingBet;
	}
// Return Winner Loser Method
	public boolean WinLose() {
		return WinnerLoser;
	}
// Return the RouletteNumber
	public int getRouletteNumber() {
		return RouletteNumber;
	}
// Return the color
	public String getRoutletteColor() {
		return RoutletteColor;
	}
//---------------------------------------------------------------------------------------------	
// Bet Red
	public void Red() {
// Generate Random Number 	
		RouletteNumber = (int) Math.round(Math.random() * 36);
		// Determine if it is red		
		for (int iCounter = 0; iCounter < 18; iCounter++) {
			PlaceHolder = RedNum[iCounter];
			if(PlaceHolder == RouletteNumber) {
				RoutletteColor = "RED";	
			}
		}
		if (RoutletteColor.equals("RED")) {
			// color is red
			WinnerLoser = true;
		}
		else {
			// color is black
			WinnerLoser = false;
		}
		RoutletteColor = "clear"; // Clear variable 
	}
// Bet Black
	public void Black() {
// Generate Random Number 	
		RouletteNumber = (int) Math.round(Math.random() * 36);
		// Determine if it is Black
		for (int iCounter = 0; iCounter < 18; iCounter++) {
			PlaceHolder = BlackNum[iCounter];
			if(PlaceHolder == RouletteNumber) {
				RoutletteColor = "BLACK";	
			}
		}
		if (RoutletteColor.equals("BLACK")) {
			// Color is black
			WinnerLoser = true;
		}
		else {
			// color is red
			WinnerLoser = false;
		}
		RoutletteColor = "clear"; // Clear variable 
	}	
// Bet Odd	
	public void Odd() {
// Generate Random Number 	
		RouletteNumber = (int) Math.round(Math.random() * 36);
// Determine if it is odd or even		
		if (RouletteNumber % 2 == 0) {
			WinnerLoser = false;
			}
		else {
			WinnerLoser = true;
		}
	}	
// Bet Even	
	public void Even() {
// Generate Random Number 	
		RouletteNumber = (int) Math.round(Math.random() * 36);
// Determine if it is odd or even		
		if (RouletteNumber % 2 == 0) {
			WinnerLoser = true;
			}
		else {
			WinnerLoser = false;
			}
	}
	
	public void Number() {
// Generate Random Number 	
		RouletteNumber = (int) Math.round(Math.random() * 36);
	}

}
