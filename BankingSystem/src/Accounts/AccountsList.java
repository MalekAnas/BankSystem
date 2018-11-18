package Accounts;

import java.util.ArrayList;
import java.util.LinkedList;

public class AccountsList{

	ArrayList<Account> accountsList = new ArrayList<>();


	public void addNewAccount(Account newAccount) {

		accountsList.add(newAccount);
	}
	
	
	
	public int getIndexByAccountNumber(String accountNumber){
		
		for(int i = 0 ; i < accountsList.size() ; i++) {
			if(accountNumber.equals(accountsList.get(i).getAccountNumber())){
				return i;
			}
			
		}
		return -1;
	}
	
	public Account getAccountByIndex(int x) {
		return accountsList.get(x);
	}



	@Override
	public String toString() {
		String s = "";
		for (Account account : accountsList) {
			 s += "Account info:\n " + account.toString();
		}
		
		return s;
		
		
	}
	
	
	
}

