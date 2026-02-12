package Section_06;

import java.util.ArrayList;

public class Branch {
	private String name;
	private ArrayList<NewCustomer> customers = new ArrayList<>();
	
	public Branch(String name) {
		this.name = name;
		this.customers = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public ArrayList<NewCustomer> getCustomers() {
		return customers;
	}
	
	private NewCustomer findCustomer(String customerName) {
        for (NewCustomer name : customers) {
            if (name.getName().equals(customerName)) {
                return name;
            }
        }
        return null;
    }
	public boolean newCustomer(String customerName, Double initialTransactions) {
		if (findCustomer(customerName) != null) {
            return false;
        }
		customers.add(new NewCustomer(customerName, initialTransactions));
        return true;
    }
	
	public boolean addCustomerTransaction(String customerName, Double transactions) {
		NewCustomer customer = findCustomer(customerName);
        if (customer == null) {
            return false;
        }
        customer.addTransaction(transactions);
        return true;
    }
}
