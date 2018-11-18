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
		
		transactions.forEach((t)-> {
			if(t.getType().equals("Credit"))
				System.out.println(t.getAccountNumber() + "\t\t " 
						+ t.getAmount() + "\t\t" + t.getType());
		});
	}
	
	public static void transactionsSummary(ArrayList<Transaction> transactions) {
		double withdrawals = 0.0;
		double deposits = 0.0;
		
		for (Transaction t : transactions) {
			if(t.getType().equals("Debit")) {
				withdrawals += t.getAmount();
			}else if(t.getType().equals("Credit")) {
				deposits += t.getAmount();
			}
		}
		
		System.out.println("total withdrawals amount:" + withdrawals);
		System.out.println("total deposits amount:" + deposits);

	}
	
	
	
}
