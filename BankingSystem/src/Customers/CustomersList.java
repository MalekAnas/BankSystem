package Customers;

import java.util.LinkedList;



public class CustomersList {
	LinkedList<Customer> clientsList = new LinkedList();
	
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
	

	public LinkedList<Customer> customersList = new LinkedList<>();

	private int searchCustomerBySsn(String ssn) {

		for (int i = 0; i < customersList.size(); i++) {
			if (ssn == (customersList.get(i).getSsn()))
				return i;
		}

		return -1;

	}

	
public Customer getCustomer(int i) {
		
		return customersList.get(i);
	}	


	public LinkedList<Customer> getCustomersList() {
		return customersList;
	}

	public void setCustomersList(LinkedList<Customer> customersList) {
		this.customersList = customersList;
	}

	public void clearCustomersList() {
		customersList.clear();
	}
}
