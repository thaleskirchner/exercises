package util;

public class CurrencyConverter {
	public static double iof = 1.06;
	
	public static double converter(double dollar, double dollarAmount) {
		
		double total = dollar * dollarAmount * iof;
		
		return total;
		
	}
}
