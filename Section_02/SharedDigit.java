package Section_02;

import java.util.Scanner;

public class SharedDigit {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int numOne = obj.nextInt();
		System.out.print("Enter second number: ");
		int numTwo = obj.nextInt();
		boolean result = hasSharedDigit(numOne, numTwo);
		System.out.println(result);
		obj.close();
		
	}
	public static boolean hasSharedDigit(int numOne, int numTwo) {
		if((numOne >= 10 && numOne <=99) && (numTwo >= 10 && numTwo <= 99)) {
			int tempOne = numOne;
			while (tempOne > 0) {
				int lastDigitOne = tempOne % 10;
				int tempTwo = numTwo;
				while(tempTwo > 0) {
					int lastDigitTwo = tempTwo % 10;
					if (lastDigitOne == lastDigitTwo) {
						return true;
					}
					tempTwo = tempTwo / 10;
				}
				tempOne = tempOne / 10;
			}
			return false;
		}else {
			return false;
		}
	}

}
