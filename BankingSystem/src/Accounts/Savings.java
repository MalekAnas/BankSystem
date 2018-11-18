package Accounts;

public class Savings extends Account {

	
	
	
	
	public Savings(){
		nextAccountNum ++;
		this.setBalance(getBalance());
		this.chekInterest();
	}
	
	
	
	
	
	
	@Override
	public void setInterest(double interest) {
		// TODO Auto-generated method stub
		super.setInterest(interest);
	}
	
	@Override
	public void setBalance(double balance) {
		// TODO Auto-generated method stub
		super.setBalance(balance);
	}
	
	@Override
	public int getAccountNumber() {
		// TODO Auto-generated method stub
		return super.getAccountNumber();
	}
	
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return super.getBalance();
	}
	
	@Override
	public double getInterest() {
		// TODO Auto-generated method stub
		return super.getInterest();
	}
	
	
	
	@Override
	public String toString() {
		return "\t\t\t\t Saving Account " + "\n" + "Your Account Number Is =" + getAccountNumber() + "\n" + "Your Balance is: " + getBalance() + "\n"
				+ "Interest rate is : " + getInterest() +"%" +"\n" ;
	}
 
}
