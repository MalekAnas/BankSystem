package Customers;

public class Customer {

	private String name;
	private String address;
	private String ssn;

	public Customer() {
	}

	public Customer(String name, String address, String ssn) {

		this.name = name;
		this.address = address;
		this.ssn = ssn;
	}



	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getSsn() {
		return ssn;
	}

	private void setName(String name) {
		this.name = name;
	}

	private void setAddress(String address) {
		this.address = address;
	}

	

	private void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String toString() {
		return "Name: " + name + "\n" + "Address: " + address + "\n" + "Social Security Number : " + ssn;
	}

	public String basicCustomerInfo() {
		return "Name: " + name + ", Address: " + address + " , Social Security Number : " + ssn;
	}

}
