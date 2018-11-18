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

	AccountsList myAccountList = new AccountsList();

	CustomersList clientList = new CustomersList();

	LinkedList<Connection> connectionList = new LinkedList();

	public static void main(String[] args) {

		Menu menu = new Menu();
		menu.printFirstMenu();
		menu.performActionFirstMenu();

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

	void performActionFirstMenu() {
		int choice;
		System.out.println();
		choice = getUserChoice();

		switch (choice) {
		case 0:
			System.out.println("Program finished, Thank you ");
			System.exit(0);
			break;
		case 1:
			createANewAccount();
			printFirstMenu();
			performActionFirstMenu();
			break;
		case 2:
			break;
		}
	}

	private String getNewCustomerInfo() {

		System.out.println("Enter your name: ");

		String name = keyRead.nextLine();

		System.out.println("Enter your address: ");
		String address = keyRead.nextLine();

		System.out.println("Enter your social security number: ");
		String ssn = keyRead.nextLine();

		Customer newCustomer = new Customer(name, address, ssn);
		clientList.addNewCustomer(newCustomer);

		System.out.println("Welcome " + name + " !\n\n");
		return ssn;
	}

	int getUserChoice() {
		System.out.println("\nEnter your choice here:");
		int choice = Integer.parseInt(keyRead.nextLine());

		return choice;

	}
	
	void printNewAccountMenu() {
		System.out.println("Choose the type of the account (saving or checking): ");
		System.out.println("1) Saving Account.");
		System.out.println("2) Checking Account.");
	}

	private void createANewAccount() {

		getNewCustomerInfo();
		String ssn = getNewCustomerInfo();
		int choice = getUserChoice();

		Account account = new Account();

		if (choice == 1) {
			account = new Savings();
			myAccountList.addNewAccount(account);
		} else if (choice == 2) {
			account = new Checking();
			myAccountList.addNewAccount(account);
		}

		System.out.println(myAccountList.toString());

	}

}
