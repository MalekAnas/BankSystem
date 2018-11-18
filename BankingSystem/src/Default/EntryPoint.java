package Default;

import java.util.LinkedList;
import java.util.Scanner;

import Accounts.AccountsList;
import Connections.Connection;
import Customers.CustomersList;

public class EntryPoint {
	
	public static void main(String[] args) {
		
		Scanner keyRead = new Scanner(System.in);
		AccountsList myAccountList = new AccountsList();
		CustomersList clientList = new CustomersList();
		LinkedList<Connection> connectionList = new LinkedList();
		
		
		Menu menu = new Menu();
		menu.printFirstMenu();
		menu.performActionFirstMenu();
	}
	
}
