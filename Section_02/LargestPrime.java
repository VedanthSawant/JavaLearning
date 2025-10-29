package Section_02;

import java.util.Scanner;

public class LargestPrime {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = obj.nextInt();
		int largestPrime = getLargestPrime(number);
		System.out.println(largestPrime);
		obj.close();
		
	}
	public static int getLargestPrime(int number) {
		if(number <= 1) {
			return -1;
		}else {
			int largestPrime = 0;
			for(int i = 2; i <= number; i++) {
				while(number % i == 0) {
					number = number / i;
					if(i > largestPrime) {
						largestPrime = i;
					}
				}
			}
			return largestPrime;
		}
	}
}
