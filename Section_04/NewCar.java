package Section_04;

public class NewCar {
	
	private boolean engine = true;
	private int cylinders;
	private String name;
	private int wheels = 4;
	
	public NewCar(int cylinders, String name) {
		this.cylinders = cylinders;
		this.name = name;
	}
	
	public String startEngine() {
		return getClass().getSimpleName() + " -> " + Thread.currentThread().getStackTrace()[1].getMethodName() + "()";
	}
	
	public String accelerate() {
		return getClass().getSimpleName() + " -> " + Thread.currentThread().getStackTrace()[1].getMethodName() + "()";
	}
	
	public String brake() {
		return getClass().getSimpleName() + " -> " + Thread.currentThread().getStackTrace()[1].getMethodName() + "()";
	}

	public int getCylinders() {
		return cylinders;
	}

	public String getName() {
		return name;
	}

}

class Mitsubishi extends NewCar {

	public Mitsubishi(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public String startEngine() {
		return super.startEngine();
	}

	@Override
	public String accelerate() {
		return super.accelerate();
	}

	@Override
	public String brake() {
		return super.brake();
	}
}

class Holden extends NewCar {

	public Holden(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public String startEngine() {
		return super.startEngine();
	}

	@Override
	public String accelerate() {
		return super.accelerate();
	}

	@Override
	public String brake() {
		return super.brake();
	}
}

class Ford extends NewCar {

	public Ford(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public String startEngine() {
		return super.startEngine();
	}

	@Override
	public String accelerate() {
		return super.accelerate();
	}

	@Override
	public String brake() {
		return super.brake();
	}
}
