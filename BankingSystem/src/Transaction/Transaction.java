package Transaction;

import Accounts.Account;
import Connections.Connection;

public class Transaction {
	
	private double amount;
	private String type;
	private int accountNumber;
	
	public Transaction() {
		amount = 0;
		type = "";
		accountNumber = -1;
	}
	
	public Transaction(double amount, String type, int accountNumber) {
		this.amount = amount;
		this.type = type;
		this.accountNumber = accountNumber;
	}
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	
}
