package Section_02;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = obj.nextInt();
		boolean result = isPerfectNumber(number);
		System.out.println(result);
		obj.close();
		
	}
	public static boolean isPerfectNumber(int number) {
		if (number < 1) {
			return false;
		}
		int tempNum = number/2;
		int perfectSum = 0;
		while(tempNum > 0) {
			if(number % tempNum == 0) {
				perfectSum += tempNum;
			}
			tempNum--;
		}
		if (perfectSum == number) {
			return true;
		}else {
			return false;
		}
	}

}
