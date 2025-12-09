package Section_03;

public class TestCustomer {
	public static void main(String[] args) {
		Customer custOne = new Customer("Tim", 1000, "tim@gmail.com");
		System.out.println(custOne.getName());
		System.out.println(custOne.getCreditLimit());
		System.out.println(custOne.getEmail());
		
		Customer custTwo = new Customer();
		System.out.println(custTwo.getName());
		System.out.println(custTwo.getCreditLimit());
		System.out.println(custTwo.getEmail());
		
		Customer custThree = new Customer("Joe", "joe@email.com");
		System.out.println(custThree.getName());
		System.out.println(custThree.getCreditLimit());
		System.out.println(custThree.getEmail());
	}

}
