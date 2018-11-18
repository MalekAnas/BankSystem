package Accounts;

public class Checking extends Account {

	
	

	public Checking(){
		
		nextAccountNum ++;
		this.setBalance(getBalance());
		this.chekInterest();
	}
	
	@Override
	public double getInterest() {
		// TODO Auto-generated method stub
		return super.getInterest();
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
	public void setBalance(double balance) {
		// TODO Auto-generated method stub
		super.setBalance(balance);
	}

	@Override
	public void setInterest(double interest) {
		// TODO Auto-generated method stub
		super.setInterest(interest);
	}
	
	@Override
	public String toString() {
		return "\t\t\t\t Checking Account " + "\n" + "Your Account Number Is =" + getAccountNumber() + "\n" + "Your Balance is: " + getBalance() + "\n"
				+ "Interest rate is : " + getInterest() +"%" +"\n" ;
	}

	
	
}
