package Section_07;

public class Dog extends Animal{

	public Dog(String type, String size, double weight) {
		super(type, size, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(String speed) {
		if(speed.equalsIgnoreCase("slow")) {
			System.out.println(getExplicitType() + " Walking");
		}else {
			System.out.println(getExplicitType() + " Running");
		}
	}

	@Override
	public void makeNoise() {
		if(type == "Wolf") {
			System.out.println("Howling");
		}else {
			System.out.println("Woof");
		}
	}
	
}
