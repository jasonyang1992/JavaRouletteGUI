package mainPackage;

public class Roulette {

// Bank 
	private int Bank = 10000;
	private static int CurrentBet;
// Roulette Number	
	private static int RouletteNumber;
// Odd Even	
	private static String ResultOddEven;
	
	public void setBank(int Bank) {
		this.Bank = Bank;
	}
	
	public int getBank() {
		return Bank;
	}
	
	public static void OddEven() {
// Generate Random Number 	
		RouletteNumber = (int) Math.round(Math.random() * 36);
// Determine if it is odd or even		
		if (RouletteNumber % 2 == 0) {
				ResultOddEven = "EVEN";
			}
		else {
				ResultOddEven ="ODD";
		}
	}	
}
