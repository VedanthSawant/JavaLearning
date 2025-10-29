package Section_01;

import java.util.Scanner;

public class DecimalComparator {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter first double number: ");
		double numOne = obj.nextDouble();
		System.out.print("Enter second double number: ");
		double numTwo = obj.nextDouble();
		boolean result = areEqualByThreeDecimalPlaces(numOne, numTwo);
		System.out.println(result);
		obj.close();
	}
	public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo) {
		numOne = ((long)(numOne * 1000)) / 1000.0;
		numTwo = ((long)(numTwo * 1000)) / 1000.0;
		if (numOne == numTwo) {
			return true;
		}else {
			return false;
		}
	}
}
