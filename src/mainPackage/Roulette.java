package mainPackage;

public class Roulette {

// Bank 
	private int BankStatement = 10000;
	private static int CurrentBet;
// Roulette Number	
	private static int RouletteNumber;
// Roulette Colors
	private static int RedNum[] = {1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36}; // Numbers that are red
	private static int BlackNum[] = {2,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33,35};  // Numbers that are black
	private static int PlaceHolder; // just a place holder
	private static String RoutletteColor = ""; // Color
	
	public void setBank(int Bank) {
		this.BankStatement = Bank;
	}
	
	public int getBank() {
		return BankStatement;
	}
// Bet Red
	public void Red() {
// Generate Random Number 	
		RouletteNumber = (int) Math.round(Math.random() * 36);
		System.out.println(RouletteNumber);
		// Determine if it is red		
		for (int iCounter = 0; iCounter < 18; iCounter++) {
			PlaceHolder = RedNum[iCounter];
			if(PlaceHolder == RouletteNumber) {
				RoutletteColor = "RED";	
			}
		}
		if (RoutletteColor.equals("RED")) {
			System.out.println("You Win!");
			System.out.println("Its Red");
		}
		else {
			System.out.println("You lose");
			System.out.println("Its Black");
		}
		RoutletteColor = "clear"; // Clear variable 
	}
// Bet Black
	public void Black() {
// Generate Random Number 	
		RouletteNumber = (int) Math.round(Math.random() * 36);
		System.out.println(RouletteNumber);
		// Determine if it is Black
		for (int iCounter = 0; iCounter < 18; iCounter++) {
			PlaceHolder = BlackNum[iCounter];
			if(PlaceHolder == RouletteNumber) {
				RoutletteColor = "BLACK";	
			}
		}
		if (RoutletteColor.equals("BlACK")) {
			System.out.println("You Win!");
			System.out.println("Its Black");
		}
		else {
			System.out.println("You lose");
			System.out.println("Its Red");
		}
		RoutletteColor = "clear"; // Clear variable 
	}	
// Bet Odd	
	public void Odd() {
// Generate Random Number 	
		RouletteNumber = (int) Math.round(Math.random() * 36);
		System.out.println(RouletteNumber);
// Determine if it is odd or even		
		if (RouletteNumber % 2 == 0) {
				System.out.println("You Lose");
			}
		else {
				System.out.println("You Win!");
		}
	}	
// Bet Even	
	public void Even() {
// Generate Random Number 	
		RouletteNumber = (int) Math.round(Math.random() * 36);
		System.out.println(RouletteNumber);
// Determine if it is odd or even		
		if (RouletteNumber % 2 == 0) {
				System.out.println("You Win!");
			}
		else {
				System.out.println("You Lose");
			}
	}	
}
