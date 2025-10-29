package Section_02;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = obj.nextInt();
		boolean result = isPrime(number);
		if (result) {
			System.out.println(number + " is not a prime number.");
		}else {
			System.out.println(number + " is a prime number");
		}
		obj.close();
		
	}
	public static boolean isPrime(int number) {
		if (number > 1) {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					return true;
				}
			}
		}
		return false;
	}

}
