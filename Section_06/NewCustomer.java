package Section_06;

import java.util.ArrayList;

public class NewCustomer {
	private String name;
	private ArrayList<Double> transactions = new ArrayList<>();
	
	public NewCustomer(String name, Double initialTransaction) {
		this.name = name;
		this.transactions = new ArrayList<>();
		this.transactions.add(initialTransaction);
	}

	public String getName() {
		return name;
	}

	public ArrayList<Double> getTransactions() {
		return transactions;
	}
	
	public void addTransaction(double transaction) {
        this.transactions.add(transaction);
    }
}
