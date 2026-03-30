package entities;

public class Account {
	private String holder;
	private int accountNumber;
	private double balance;
	
	public Account(String name, int accountNumber, double initialBalance) {
		this.holder = name;
		this.accountNumber = accountNumber;
		deposit(initialBalance);
	}
	
	public Account(String name, int accountNumber) {
		this.holder = name;
		this.accountNumber = accountNumber;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount + 5;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void setName(String name) {
		this.holder = name;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getName() {
		return holder;
	}
	
	@Override
	public String toString() {
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f\n\n", accountNumber, holder, balance);
		return super.toString();
	}
}
