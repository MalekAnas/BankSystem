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
	
	Menu menu;
	
	public static void main(String[] args) {
		
		Scanner keyRead = new Scanner(System.in);
		AccountsList myAccountList = new AccountsList();
		CustomersList clientList = new CustomersList();
		LinkedList<Connection> connectionList = new LinkedList();
		
		menu = new Menu();
		menu.printFirstMenu();
		menu.performActionFirstMenu();
	}
	
	private static void createANewAccount() {

		getNewCustomerInfo();
		String ssn = getNewCustomerInfo();
		System.out.println("Choose the type of the account (saving or checking): ");
		System.out.println("1) Saving Account.");
		System.out.println("2) Checking Account.");
		menu.printCreateAccountMenu();
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
		printFirstMenu();
		performActionFirstMenu();

	}
	
}
