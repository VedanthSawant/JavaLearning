package Section_01;

import java.util.Scanner;

public class AddToIntegers {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter first interger number: ");
		int numOne = obj.nextInt();
		System.out.print("Enter second interger numner: ");
		int numTwo = obj.nextInt();
		int result = numOne + numTwo;
		System.out.println(numOne + " + " + numTwo + " = " + result);
		obj.close();
	}
}
