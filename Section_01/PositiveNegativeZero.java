package Section_01;

import java.util.Scanner;

public class PositiveNegativeZero {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = obj.nextInt();
		checkNumber(number);
		obj.close();
	}
	public static void checkNumber(int number) {
		if (number > 0) {
			System.out.println("positive");
		}else if (number < 0) {
			System.out.println("negative");
		}else {
			System.out.println("zero");
		}
	}

}
