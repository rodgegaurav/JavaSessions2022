package constructorconcept;

import java.util.ArrayList;

public class Customer {
	
	String firstname;
	String lastname;
	boolean isPrime;
	String phone;
	String address;
	String email;
	ArrayList<String> ordersList;
	
	public Customer(String firstname, String phone, String email) {
		this.firstname=firstname;
		this.phone=phone;
		this.email=email;
		
	}

	public Customer(String firstname, String phone, String address, String email) {
		
		this.firstname = firstname;
		this.phone = phone;
		this.address = address;
		this.email = email;
	}

	public Customer(String firstname, boolean isPrime, String phone, String email) {
		
		this.firstname = firstname;
		this.isPrime = isPrime;
		this.phone = phone;
		this.email = email;
	}

	public Customer(String firstname, String lastname, ArrayList<String> ordersList) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.ordersList = ordersList;
	}

	public Customer(String firstname, String lastname, boolean isPrime, String phone, String address, String email,
			ArrayList<String> ordersList) {
			
		this.firstname = firstname;
		this.lastname = lastname;
		this.isPrime = isPrime;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.ordersList = ordersList;
	}

}
