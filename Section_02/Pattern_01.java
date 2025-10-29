package Section_02;

public class Pattern_01 {
	public static void main(String[] args) {
		int i = 1;
		for (i = 1; i <= 5; i ++) {
			for (int j = 1; j <= i; j ++) {
				System.out.print(i + " ");
			}
			System.out.println("\n");
		}
	}

}
