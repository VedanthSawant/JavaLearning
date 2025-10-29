package Section_02;

import java.util.Scanner;

public class DigitSum {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = obj.nextInt();
		int resultSum = SumDigits(number);
		System.out.println(resultSum);
		obj.close();
		
	}
	public static int SumDigits(int number) {
		if (number < 0) {
			return -1;
		}
		int sum = 0;
		while(number > 0) {
			int lastDigit = number % 10;
			number = number / 10;
			sum += lastDigit;
		}
		return sum;
	}

}
