package Section_04;

public class Car {
	private String description;

	public Car(String description) {
		this.description = description;
	}
	
	public void stratEngine() {
		System.out.println("Car -> startEngine");
	}
	
	protected void runEngine() {
		System.out.println("Car -> runEngine");
	}
	
	public void drive() {
		System.out.println("Car -> driving, type is " + getClass().getSimpleName());
		runEngine();
	}

}

class gasPowered extends Car{
	
	private double avgKmPerLiter;
	private int cylinders = 6;
	
	public gasPowered(String description) {
		super(description);
	}

	public gasPowered(String description, double avgKmPerLiter, int cylinders) {
		super(description);
		this.avgKmPerLiter = avgKmPerLiter;
		this.cylinders = cylinders;
	}

	@Override
	public void stratEngine() {
		// TODO Auto-generated method stub
		System.out.printf("Gas -> All %d cylinders are fored up, Ready!%n", cylinders);
	}

	@Override
	protected void runEngine() {
		// TODO Auto-generated method stub
		System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLiter);
	}
	
}

class ElectricClass extends Car{
	
	private double avgKmPerCharge;
	private int batterySize = 6;
	
	public ElectricClass(String description) {
		super(description);
	}

	public ElectricClass(String description, double avgKmPerCharge, int batterySize) {
		super(description);
		this.avgKmPerCharge = avgKmPerCharge;
		this.batterySize = batterySize;
	}

	@Override
	public void stratEngine() {
		// TODO Auto-generated method stub
		System.out.printf("Bev -> switch %d kEh battery on, Ready!%n", batterySize);
	}

	@Override
	protected void runEngine() {
		// TODO Auto-generated method stub
		System.out.printf("BEV -> usage under the average: %.2f %n", avgKmPerCharge);
	}
	
}

class HybridCar extends Car{
	
	private double avgKmPerLiter;
	private int cylinders = 6;
	private int batterySize;
	
	public HybridCar(String description) {
		super(description);
	}

	public HybridCar(String description, double avgKmPerLiter, int cylinders, int batterySize) {
		super(description);
		this.avgKmPerLiter = avgKmPerLiter;
		this.cylinders = cylinders;
		this.batterySize = batterySize;
	}

	@Override
	public void stratEngine() {
		// TODO Auto-generated method stub
		System.out.printf("Hybrid -> %d cylinders are fired up.%n", cylinders);
		System.out.printf("Hybrid -> switch %d kWh battery on, Ready!%n", batterySize);
	}

	@Override
	protected void runEngine() {
		// TODO Auto-generated method stub
		System.out.printf("Hybrid -> usage exceeds the average: %.2f %n", avgKmPerLiter);
	}
	
}

