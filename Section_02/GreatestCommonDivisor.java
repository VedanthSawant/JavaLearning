package Section_02;

import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int first = obj.nextInt();
		System.out.print("Enter second number: ");
		int second = obj.nextInt();
		int result = getGreatestCommonDivisor(first, second);
		System.out.println(result);
		obj.close();
		
	}
	public static int getGreatestCommonDivisor(int first, int second) {
		if (first < 10 || second < 10) {
			return -1;
		}else {
			int limit = 0;
			if(first > second) {
				limit = second;
			}else {
				limit = first;
			}
			while(limit > 0) {
				if(first % limit == 0 && second % limit == 0) {
					return limit;
				}
				limit--;
			}
			return limit;
		}
	}

}
