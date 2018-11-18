package Default;

import java.util.LinkedList;
import java.util.Scanner;
import Accounts.Account;
import Accounts.AccountsList;
import Accounts.Checking;
import Accounts.Savings;
import Connections.Connection;
import Customers.Customer;
import Customers.CustomersList;
import Exceptions.CompleteYourInfo;
import Transaction.Transaction;

public class Menu {

	String accountNumber;
	String ssn;

	Scanner keyRead = new Scanner(System.in);

	int getUserChoice() {
		System.out.println("\nEnter your choice here:");
		int choice = Integer.parseInt(keyRead.nextLine());
		return choice;
	}
	
	void printFirstMenu() {
		System.out.println("+----------------------------------------------+");
		System.out.println("|         Welcome to Malek's BankSystem        |");
		System.out.println("+----------------------------------------------+");
		System.out.println();
		System.out.println();
		System.out.println("1) Create new Account.");
		System.out.println("2) Link account to user.");
		System.out.println("3) Make a deposit");
		System.out.println("4) Make a withdrawl.");
		System.out.println("5) Make a transaction.");
		System.out.println("6) Print a report.");
		System.out.println("0) Exit.");
	}
	
	void printNewAccountMenu() {
		System.out.println("Choose the type of the account (saving or checking): ");
		System.out.println("1) Saving Account.");
		System.out.println("2) Checking Account.");
	}
	
	
	
	
	
	
//	private String getNewCustomerInfo() {
//
//		System.out.println("Enter your name: ");
//
//		String name = keyRead.nextLine();
//
//		System.out.println("Enter your address: ");
//		String address = keyRead.nextLine();
//
//		System.out.println("Enter your social security number: ");
//		String ssn = keyRead.nextLine();
//
//		Customer newCustomer = new Customer(name, address, ssn);
//		clientList.addNewCustomer(newCustomer);
//
//		System.out.println("Welcome " + name + " !\n\n");
//		return ssn;
//	}

}
