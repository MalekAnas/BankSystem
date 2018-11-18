package Accounts;

import java.util.LinkedList;

public class AccountsList {

	LinkedList<Account> accountsList = new LinkedList<>();


	public void addNewAccount(Account newAccount) {

		accountsList.add(newAccount);
	}
	
	
	
	public int getAccountByAccountNmber(String accountNumber){
		
		for(int i = 0 ; i < accountsList.size() ; i++) {
			if(accountNumber.equals(accountsList.get(i).getAccountNumber())){
				return i;
			}
			
		}
		return -1;
		
		
		
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

