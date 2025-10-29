package Section_02;

import java.util.Scanner;

public class LastDigitChecker {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int numOne = obj.nextInt();
		System.out.print("Enter second number: ");
		int numTwo = obj.nextInt();
		System.out.print("Enter third number: ");
		int numThree = obj.nextInt();
		boolean result = hasSameLastDigit(numOne, numTwo, numThree);
		System.out.println(result);
		obj.close();
		
	}
	public static  boolean hasSameLastDigit(int numOne, int numTwo, int numThree) {
		if((isValid(numOne)) && (isValid(numTwo)) && (isValid(numThree))) {
			int lastDigitOne = numOne % 10;
			int lastDigitTwo = numTwo % 10;
			int lastDigitThree = numThree % 10;
			if((lastDigitOne == lastDigitTwo) || (lastDigitOne == lastDigitThree) || 
					(lastDigitTwo == lastDigitThree)) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	public static boolean isValid(int number) {
		if(number >= 10 && number <= 1000) {
			return true;
		}else {
			return false;
		}
	}

}
