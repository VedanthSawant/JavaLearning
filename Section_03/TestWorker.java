package Section_03;

public class TestWorker {
	
	public static void main(String[] args) {
		
		Employee Tim = new Employee("Tim", "03/04/1997", "22/11/2023");
		System.out.println(Tim);
		System.out.println("Age = " + Tim.getAge());
		System.out.println("Pay = " + Tim.collectPay());
		
		SalariedEmployee Joe = new SalariedEmployee("Joe", "03/04/1990", "22/08/2023", 35000);
		System.out.println(Joe);
		System.out.println("Joe's payment = $" + Joe.collectPay());
		
		Joe.retire();
		System.out.println("Joe's Pension check = $" + Joe.collectPay());
	}

}
