package Section_02;

import java.util.Scanner;

public class FactorPrinter {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = obj.nextInt();
		printFactors(number);
		obj.close();
	}
	public static void printFactors(int number) {
		if(number < 1) {
			System.out.println("Invalid Input");
		}else {
			int temp = 1;
			while(temp <= number) {
				if(number % temp == 0) {
					System.out.print(temp + " ");
				}
				temp++;
			}
		}
	}
}
