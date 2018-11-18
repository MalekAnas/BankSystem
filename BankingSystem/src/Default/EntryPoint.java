package Default;

import java.util.LinkedList;
import java.util.Scanner;

import Accounts.Account;
import Accounts.AccountsList;
import Accounts.Checking;
import Accounts.Savings;
import Connections.Connection;
import Customers.CustomersList;

public class EntryPoint {
	
	static Menu menu;
	static Scanner keyRead = new Scanner(System.in);
	static AccountsList myAccountList = new AccountsList();
	static CustomersList clientList = new CustomersList();
	static LinkedList<Connection> connectionList = new LinkedList();
	
	public static void main(String[] args) {
		menu = new Menu();
		menu.printFirstMenu();
		performActionFirstMenu();
	}
	
	private static void performActionFirstMenu() {
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
			menu.printFirstMenu();
			performActionFirstMenu();
			break;
		case 2:
			break;
		}
	}
	
	private static int getUserChoice() {
		System.out.println("\nEnter your choice here:");
		int choice = Integer.parseInt(keyRead.nextLine());
		return choice;

	}
	
	private static void createANewAccount() {

//		getNewCustomerInfo();
//		String ssn = getNewCustomerInfo();
		menu.printNewAccountMenu();
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
		menu.printFirstMenu();
		performActionFirstMenu();

	}
	
}
