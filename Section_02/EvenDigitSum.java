package Section_02;

import java.util.Scanner;

public class EvenDigitSum {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int number = obj.nextInt();
		int result = getEvenDigitSum(number);
		System.out.println(result);
		obj.close();
		
	}
	public static int getEvenDigitSum(int number) {
		if(number < 0) {
			return -1;
		}
		int sum = 0;
		while(number > 0) {
			int lastDigit = number % 10;
			number = number / 10;
			if (lastDigit % 2 == 0) {
				sum += lastDigit;
			}
		}
		return sum;
	}

}
