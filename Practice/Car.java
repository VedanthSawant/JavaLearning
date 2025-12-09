package Practice;

public class Car {
	private String model;
	private String make;
	private String color;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	void printDetails() {
		System.out.print(model + " " + make + " " + color);
	}
	
}
