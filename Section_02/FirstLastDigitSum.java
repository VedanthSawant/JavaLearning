package Section_02;

import java.util.Scanner;

public class FirstLastDigitSum {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = obj.nextInt();
		int result = sumFirstAndLastDigit(number);
		System.out.println(result);
		obj.close();
		
	}
	public static int sumFirstAndLastDigit(int number) {
		if (number < 0) {
			return -1;
		}
		int lastDigit = number % 10;
		while(number >= 10) {
			number = number / 10;
		}
		return lastDigit + number;
	}

}
