package Reports;

import java.util.ArrayList;

import Transaction.Transaction;

public class Reports {
	public static void listDeposits(ArrayList<Transaction> transactions) {
		System.out.println("Account# \t\t+ Amount \t\t+ Type" );

		transactions.forEach((t)-> {
			if(t.getType().equals("Debit"))
				System.out.println(t.getAccountNumber() + "\t\t " 
						+ t.getAmount() + "\t\t" + t.getType());
		});
	}
	
	public static void listWithdrawls(ArrayList<Transaction> transactions) {
		System.out.println("Account# \t\t+ Amount \t\t+ Type");
		
		transactions.forEach((t)->{
			System.out.println(t.getAccountNumber() + "\t\t" + t.getAmount() +"\t\t" + t.getType());
		});
	}
}
