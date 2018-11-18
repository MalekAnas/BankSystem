package Customers;

import java.util.ArrayList;



public class CustomersList {
	ArrayList<Customer> clientsList = new ArrayList();
	
	public void addNewCustomer(Customer newCustomer) {
		
		clientsList.add(newCustomer);
	}
	
	
	
	public boolean checkSsnExistance(String ssnSignIn) {
		for (Customer customer : clientsList) {
			if(customer.getSsn().equals(ssnSignIn)) {
				return true;
			}
		}

		return false;
		
	}
	


	public int searchCustomerBySsn(String ssn) {

		for (int i = 0; i < clientsList.size(); i++) {
			if (ssn.equals((clientsList.get(i).getSsn())))
				return i;
		}

		return -1;

	}

	
	public Customer getCustomer(int i) {
			
			return clientsList.get(i);
		}	

	public int getNumberOfCustomers() {
		return clientsList.size();
	}
	

	public void setCustomersList(ArrayList<Customer> customersList) {
		this.clientsList = customersList;
	}

	public void clearCustomersList() {
		clientsList.clear();
	}
}
