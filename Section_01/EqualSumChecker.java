package Section_01;

import java.util.Scanner;

public class EqualSumChecker {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int numOne = obj.nextInt();
		System.out.print("Enter second number: ");
		int numTwo = obj.nextInt();
		System.out.print("Enter the target value: ");
		int target = obj.nextInt();
		boolean result = hasEqualSum(numOne, numTwo, target);
		System.out.println(result);
		obj.close();
	}
	public static boolean hasEqualSum(int numOne, int numTwo, int target) {
		int result = numOne + numTwo;
		if (result == target) {
			return true;
		}else {
			return false;
		}
	}
}
