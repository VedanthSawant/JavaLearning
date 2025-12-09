package Section_04;

public class TestCar {
	public static void main(String[] args) {
		Car car = new Car("Farrai");
		runRace(car);
		
		Car ferrari = new gasPowered("Farrari", 15.4, 6);
		runRace(ferrari);
		
		Car tesla = new ElectricClass("Tesla", 568, 75);
		runRace(tesla);
		
		Car fararriHybrid = new HybridCar("Farrari Hybrid", 16, 8, 8);
		runRace(fararriHybrid);
	}
	
	public static void runRace(Car car) {
		car.stratEngine();
		car.drive();
	}

}
