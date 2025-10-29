package Section_02;

import java.util.Scanner;

public class NumberPalindrome {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = obj.nextInt();
		boolean result = isPalindrome(number);
		System.out.println(result);
		obj.close();
		
	}
	public static boolean isPalindrome(int number) {
		int reverse = 0;
		number = Math.abs(number);
		int original = number;
		while(number > 0) {
			int lastDigit = number % 10;
			reverse = reverse * 10;
			reverse = reverse + lastDigit;
			number = number / 10;
		}
		if(original ==  reverse) {
			return true;
		}else {
			return false;
		}
	}
}
