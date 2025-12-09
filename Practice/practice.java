package Practice;

public class practice {

	public static void main(String[] args) {
		Car car = new Car();
		car.setModel("BMW");
		System.out.println(car.getModel());
		car.printDetails();
	}
}