package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Application {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Account conta;
				
		
		System.out.print("Enter account number: ");
		int accountNumber = scan.nextInt();
		System.out.print("Enter account holder: ");
		scan.nextLine();
		String holder = scan.nextLine();
		System.out.print("Is there initial deposit (y/n)? ");
		char response = scan.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double variable = scan.nextDouble();
			conta = new Account(holder, accountNumber, variable);
		} else {
			conta = new Account(holder, accountNumber);
		}
		
		System.out.println("\nAccount data: ");
		conta.toString();
		
		System.out.print("Enter a deposit value: ");
		conta.deposit(scan.nextDouble());
		System.out.println("\nUpdated account data: ");
		conta.toString();
		
		System.out.print("Enter a withdraw value: ");
		conta.withdraw(scan.nextDouble());
		System.out.println("\nUpdated account data: ");
		conta.toString();
		
		scan.close();
		
	}
}
