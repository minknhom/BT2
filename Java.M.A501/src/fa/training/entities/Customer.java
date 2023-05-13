package fa.training.entities;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private String phoneNumber;
	private String address;
	private List<Order> order;
	
	
	public Customer() {
		super();
	}


	public Customer(String name, String phoneNumber, String address, List<Order> order) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.order = order;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public List<Order> getOrder() {
		return order;
	}


	public void setOrder(List<Order> order) {
		this.order = order;
	}
	
	
	
	
}
