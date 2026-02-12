package Section_06;

import java.util.ArrayList;

public class NewBank {
	private String name;
	private ArrayList<Branch> branches = new ArrayList<>();
	
	public NewBank(String name) {
		this.name = name;
		this.branches = new ArrayList<>();
	}
	
	public Branch findBranch(String branchName) {
		for (Branch branch : branches) {
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
	}
	
	public boolean addBranch(String branchName) {
		if (findBranch(branchName) != null) {
            return false;
        }
		branches.add(new Branch(branchName));
        return true;
    }
	
	public boolean addCustomer(String branchName, String customerName, Double initialTran) {
		Branch branch = findBranch(branchName);
	    if (branch == null) {
	        return false;
	    }
	    return branch.newCustomer(customerName, initialTran);	
	}
	
	public boolean addCustomerTransaction(String branchName, String customerName, Double transaction) {
		Branch branch = findBranch(branchName);
	    if (branch == null) {
	        return false;
	    }
	    return branch.addCustomerTransaction(customerName, transaction);	
	}
	
	public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }

        System.out.println("Customer details for branch " + branch.getName());

        ArrayList<NewCustomer> customers = branch.getCustomers();
        for (int i = 0; i < customers.size(); i++) {
        	NewCustomer customer = customers.get(i);
            System.out.println("Customer: " + customer.getName() + "[" + (i + 1) + "]");

            if (printTransactions) {
                System.out.println("Transactions");
                ArrayList<Double> transactions = customer.getTransactions();
                for (int j = 0; j < transactions.size(); j++) {
                    System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
                }
            }
        }

        return true;
    }

}
