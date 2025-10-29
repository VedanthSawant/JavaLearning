package Section_02;

public class Challenge_01 {
	public static void main(String[] args) {
		for (double i = 7.50; i <= 10.00; i += 0.25) {
			System.out.println("100 at " + i + "% interest = " + (100 * ( i / 100)));
		}
	}
}
