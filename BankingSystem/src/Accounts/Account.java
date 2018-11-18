package Accounts;



public class Account {
	

	private double balance = 0;
	private int accountNumber;
	private double interest = 0.02;
	public static int nextAccountNum = 1000000;

	public Account() {
		accountNumber = nextAccountNum++;

	}

	
	


	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterest() {
		return interest * 100;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public void withdrawl(double amount) {
		if (amount + 5 > balance) { // 5 is the charge of the withdrawl proccess

			System.out.println("You so not have enough money in your account!");

		}

		balance -= amount + 5;
		chekInterest();
		System.out.println("You did withdrawl " + amount + "pounds" + ", the fee is 5 pounds");
		System.out.println("You have " + balance + " pounds left in your account.");
	}

	public void deposit(double amount) {

		if (amount < 0) {
			System.out.println("You can not deposite negative amount!");
		}
		chekInterest();
		amount = amount + amount * interest;
		balance += amount;

		System.out.println("You did deposite " + amount + " pounds, with an interest rate " + (interest * 100) + "%");
		System.out.println("You hava " + balance + " pounds in your account.");
	}

	public void chekInterest() {

		if (balance > 10000) {
			interest = 0.05;

		} else {
			interest = 0.02;
		}

	}
	
	
	

}
