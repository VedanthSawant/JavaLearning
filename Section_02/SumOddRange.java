package Section_02;

import java.util.Scanner;

public class SumOddRange {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the lower limit: ");
		int lowerLimit = obj.nextInt();
		System.out.print("Enter the higher limit: ");
		int highLimit = obj.nextInt();
		int result = sumOdd(lowerLimit, highLimit);
		System.out.println(result);
		obj.close();
		
	}
	public static boolean isOdd(int number) {
		if (number <= 0) {
			return false;
		}else {
			if (number % 2 != 0) {
				return true;
			}else {
				return false;
			}
		}
	}
	public static int sumOdd(int start, int end) {
		int sum = 0;
		if (start > 0 && end > 0 && end >= start) {
			for(int num = start; num <= end; num++) {
				if(isOdd(num)) {
					sum += num;
				}
			}
			return sum;
		}else {
			return -1;
		}
		
	}
}
