package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Aplicacao {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double dollar;
		double dollarAmount;
		
		System.out.printf("What is the dollar price? ");
		dollar = scan.nextDouble();
		System.out.printf("\nHow many dollars will be bought? ");
		dollarAmount = scan.nextDouble();
		
		double total = CurrencyConverter.converter(dollar, dollarAmount);
		
		System.out.printf("\nAmount to be paid in reais = %.2f", total);
		
		scan.close();
	}
}
