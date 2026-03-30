package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.BusinessException;

public class Program {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scn = new Scanner(System.in);
		
		IO.println("Enter account data");
		IO.print("Number: ");
		Integer number = scn.nextInt();
		IO.print("Holder: ");
		scn.nextLine();
		String holder = scn.nextLine();
		IO.print("Initial balance: ");
		Double balance = scn.nextDouble();
		IO.print("Withdraw limit: ");
		Double withdrawLimit = scn.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		IO.println();
		IO.print("Enter amount for withdraw: ");
		Double amount = scn.nextDouble();
		
		try {
			acc.withdraw(amount);
			IO.println("New balance: " + acc.getBalance());
		} catch (BusinessException e) {
			IO.println("Withdraw error: " + e.getMessage());
		}
		
		scn.close();
	}
}
