package Section_01;

import java.util.Scanner;

public class IntEqualityPrinter {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int numOne = obj.nextInt();
		System.out.print("Enter second number: ");
		int numTwo = obj.nextInt();
		System.out.print("Enter third number: ");
		int numThree = obj.nextInt();
		printEqual(numOne, numTwo, numThree);
		obj.close();
	}
	public static void printEqual(int numOne, int numTwo, int numThree) {
		if (numOne < 0 || numTwo < 0 || numThree < 0) {
			System.out.println("Invalid Value");
		}else if ((numOne == numTwo) && (numTwo == numThree)) {
			System.out.println("All numbers are equal");
		}else if ((numOne != numTwo) && (numTwo != numThree) && (numOne != numThree)) {
			System.out.println("All numbers are different");
		}else {
			System.out.println("Neither all are equal or different");
		}
	}
}
