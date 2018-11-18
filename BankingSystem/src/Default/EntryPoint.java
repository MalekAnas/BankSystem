package Default;

import java.util.ArrayList;
import java.util.Scanner;
import Accounts.Account;
import Accounts.AccountsList;
import Accounts.Checking;
import Accounts.Savings;
import Connections.Connection;
import Customers.Customer;
import Customers.CustomersList;
import Reports.Reports;
import Transaction.Transaction;

public class EntryPoint {

	static Menu menu;
	static Scanner keyRead = new Scanner(System.in);
	static AccountsList myAccountList = new AccountsList();
	static CustomersList clientList = new CustomersList();
	static ArrayList<Connection> connectionList = new ArrayList();
	static ArrayList<Transaction> transactionList = new ArrayList();

	public static void main(String[] args) {
		menu = new Menu();
		menu.printFirstMenu();
		performActionFirstMenu();
	}

	void performReportAction() {

		int choice = menu.getUserChoice();
		switch (choice) {
		case 1:
			Reports.listDeposits(transactionList);
			break;
		case 2:
			Reports.listWithdrawls(transactionList);
			break;
		case 3:
			Reports.transactionsSummary(transactionList);
			break;
		case 4:
			Reports.numberOfCustomers(clientList);
			break;
		case 5:
			Reports.listAccounts(myAccountList);
			break;
		}

	}

	private static void performActionFirstMenu() {
		int choice;
		System.out.println();
		choice = menu.getUserChoice();

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
			linkAccountToUser();
			menu.printFirstMenu();
			performActionFirstMenu();
			break;
		case 3:
			makeAdeposit();
			menu.printFirstMenu();
			performActionFirstMenu();
			break;
		case 4:
			makeAWithdrawl();
			menu.printFirstMenu();
			performActionFirstMenu();
			break;
		case 5:
			addNewCustomer();
			menu.printFirstMenu();
			performActionFirstMenu();

			break;
		case 6:

			prinAreport();
			break;

		}
	}

	private static void prinAreport() {
		// TODO Auto-generated method stub

	}

	private static void makeAWithdrawl() {
		int accountIndex = -1;
		int accountNumber = -1;
		while (accountIndex < 0) {
			System.out.println("Enter account number: ");
			accountNumber = Integer.parseInt(keyRead.nextLine());
			accountIndex = myAccountList.getIndexByAccountNumber(accountNumber);
			if (accountIndex == -1) {
				System.out.println("Account `" + accountNumber + "` does not exist!");
			}
		}
		Account withdrawalAccount = myAccountList.getAccountByIndex(accountIndex);
		
		// add Exception Handling
		System.out.println("Enter the withdrawl amount: ");
		double withdrawlAmount = Double.parseDouble(keyRead.nextLine());
		withdrawalAccount.withdrawl(withdrawlAmount);
		transactionList.add(new Transaction(withdrawlAmount, "Credit", accountNumber));
	}

	private static void makeAdeposit() {
		int accountIndex = -1;
		int accountNumber = -1;
		while (accountIndex < 0) {
			System.out.println("Enter account number: ");
			accountNumber = Integer.parseInt(keyRead.nextLine());
			accountIndex = myAccountList.getIndexByAccountNumber(accountNumber);
			if (accountIndex == -1) {
				System.out.println("Account `" + accountNumber + "` does not exist!");
			}
		}
		Account depositAccount = myAccountList.getAccountByIndex(accountIndex);

		// add Exception Handling
		System.out.println("Enter the deposit amount");
		double depositAmount = Double.parseDouble(keyRead.nextLine());
		depositAccount.deposit(depositAmount);
		transactionList.add(new Transaction(depositAmount, "Debit", accountNumber));
	}

	private static void createANewAccount() {

		menu.printNewAccountMenu();
		int choice = menu.getUserChoice();

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

	private static void linkAccountToUser() {

		int accountIndex = -1;
		int accountNumber = 0;
		while (accountIndex < 0) {
			System.out.println("Enter account number: ");
			accountNumber = Integer.parseInt(keyRead.nextLine());
			accountIndex = myAccountList.getIndexByAccountNumber(accountNumber);
			if (accountIndex == -1) {
				System.out.println("Account `" + accountNumber + "` does not exist!");
			}
		}

		int customerIndex = -1;
		String customerSsn = "";
		while (customerIndex < 0) {
			System.out.println("Enter customer ssn: ");
			customerSsn = keyRead.nextLine();
			customerIndex = clientList.searchCustomerBySsn(customerSsn);
			if (customerIndex == -1) {
				System.out.println("SSN `" + customerSsn + "` does not exist!");
			}
		}

		connectionList.add(new Connection(accountNumber, customerSsn));
		System.out.println("Linked account number `" + accountNumber + "` with customer " + customerSsn);
	}

	private static void addNewCustomer() {
		System.out.println("Enter customer name: ");

		String name = keyRead.nextLine();

		System.out.println("Enter customer address: ");
		String address = keyRead.nextLine();

		System.out.println("Enter customer social security number: ");
		String ssn = keyRead.nextLine();

		Customer newCustomer = new Customer(name, address, ssn);
		clientList.addNewCustomer(newCustomer);

		System.out.println("Added new customer `" + name + "` !\n\n");

		Customer c = clientList.getCustomer(0);
		System.out.println(c.getSsn());
//		return ssn;

	}

}
