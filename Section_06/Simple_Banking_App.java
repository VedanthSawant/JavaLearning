package Section_06;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions) {
	public Customer(String name, double InitialDeposit) {
		this(name.toUpperCase(), new ArrayList<Double>(500));
		transactions.add(InitialDeposit);
	}
}

public class Simple_Banking_App {
	public static void main(String[] args) {
		Customer bob = new Customer("bob", 1000.0);
		System.out.println(bob);
		
		Bank bank = new Bank("HDFC");
		bank.addNewCustomer("Joe", 4000.0);
		System.out.println(bank);
		
		bank.addTransactions("Joe", -10.25);
		bank.addTransactions("Joe", -75.01);
		bank.printStmt("Joe");
	}

}


class Bank{
	private String name;
	private ArrayList<Customer> customers = new ArrayList<>(5000);
	
	public Bank(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Bank [name=" + name + ", customers=" + customers + "]";
	}

	private Customer getCustomer(String customerName) {
		for(var customer: customers) {
			if(customer.name().equalsIgnoreCase(customerName)) {
				return customer;
			}
		}
		System.out.printf("Customer (%s) wasn't found %n", customerName);
		return null;
	}
	
	public void addNewCustomer(String customerName, double initialDeposite) {
		if(getCustomer(customerName) == null) {
			Customer customer = new Customer(customerName, initialDeposite);
			customers.add(customer);
			System.out.println("New Customer Added: " + customer);
		}
	}
	
	public void addTransactions(String name, double transAmt) {
		Customer customer = getCustomer(name);
		if(customer != null) {
			customer.transactions().add(transAmt);
		}
	}
	
	public void printStmt(String customerName) {
		Customer customer = getCustomer(customerName);
		if(customer == null) {
			return;
		}
		System.out.println("-".repeat(30));
		System.out.println("Customer Name: " + customer.name());
		System.out.println("Transactions");
		for(double d: customer.transactions()) {
			System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "debit" : "credit");
		}
		
	}
}