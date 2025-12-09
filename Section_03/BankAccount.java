package Section_03;

public class BankAccount {
	private int accountNumber;
	private double accountBalnce;
	private String customerName;
	private String email;
	private int phoneNumber;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double getAccountBalnce() {
		return accountBalnce;
	}
	public void setAccountBalnce(double accountBalnce) {
		this.accountBalnce = accountBalnce;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void depositeMoney(double money) {
		this.accountBalnce += money;
		System.out.println("Deposit of " + money + " is done. New Balance is " + this.accountBalnce);
	}
	
	public void withdrawMoney(double money) {
		double currentBalance = this.accountBalnce;
		currentBalance -= money;
		if(currentBalance >= 0) {
			this.accountBalnce -= money;
			System.out.println("Withdrawal of " + money + " is done. New Balance is " + this.accountBalnce);
		}else {
			System.out.println("You current balance is "+ this.accountBalnce + " You cannot "
					+ "withdraw this much amount.");
		}
	}

}
