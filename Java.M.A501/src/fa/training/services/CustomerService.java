package fa.training.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import fa.training.entities.Customer;
import fa.training.entities.Order;

public class CustomerService {
	ArrayList<Customer> customers = new ArrayList<Customer>();
	
	ArrayList<Order> customer = new ArrayList<Order>();
	
	public ArrayList<Customer> createCustomer(){
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("--Enter Custmer information--");
		

		while(true) {
			
			System.out.println("Enter name: ");
			String name = sc.nextLine();
			System.out.println("Enter phone: ");
			String phone = sc.nextLine();
			System.out.println("Enter address: ");
			String address = sc.nextLine();
			System.out.println("Enter order infor: ");
			
			
			List<Order> orders = new ArrayList<>(); 

			System.out.println("Enter order number (10 digits): "); 
			String orderNumber = sc.nextLine();
			System.out.println("Enter order date (format: yyyy-mm-dd): "); 
			String orderDate = sc.nextLine(); 
			Order order = new Order(orderNumber, orderDate); 
			orders.add(order);
			
			
			Customer customer  = new Customer(name, phone, address, orders);
			
			customers.add(customer);
			
			System.out.print("Do you want to enter another customer? (y/n): ");
			String input = sc.nextLine();
			if (input.equalsIgnoreCase("n")) {
			break;
			}
		
			
			
		}
		
		return customers;

	
	}	
	

}
