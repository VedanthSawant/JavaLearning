package Section_07;

public class Fish extends Animal{

	public Fish(String type, String size, double weight) {
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
		if(type == "Goldfish") {
			System.out.println("Swish");
		}else {
			System.out.println("Splash");
		}
	}
	
}
