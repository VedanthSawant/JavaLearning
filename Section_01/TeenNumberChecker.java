package Section_01;

import java.util.Scanner;

public class TeenNumberChecker {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter fisrt number: ");
		int numOne = obj.nextInt();
		System.out.print("Enter second number: ");
		int numTwo = obj.nextInt();
		System.out.print("Enter third number: ");
		int numThree = obj.nextInt();
		boolean result = hasTeen(numOne, numTwo, numThree);
		System.out.println(result);
		obj.close();
		
	}
	public static boolean hasTeen(int numOne, int numTwo, int numThree) {
		if (numOne >= 13 && numOne <= 19) {
			return true;
		}else if (numTwo >= 13 && numTwo <= 19) {
			return true;
		}else if (numThree >= 13 && numThree <= 19) {
					return true;
		}else {
			return false;
		}
	}
	public static boolean isTeen(int num) {
		if (num >= 13 && num <= 19) {
			return true;
		}else {
			return false;
		}
	}

}
