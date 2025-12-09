package Section_02;

import java.util.Scanner;

public class InputCalculator {
	public static void main(String[] args) {
		inputThenPrintSumAndAverage();
		
	}
	public static void inputThenPrintSumAndAverage() {
		Scanner obj = new Scanner(System.in);
		int counter = 0, sum = 0;
		while(true) {
			System.out.print("Enter a number (or character to quit): ");
			if(!obj.hasNextInt()) {
				break;
			}
			int userInput = obj.nextInt();
			sum += userInput;
			counter ++;
			
		}
		double avg = Math.round((double) sum/counter);
		System.out.println("SUM = " + sum + " AVG = " + (int) avg);
		obj.close();
		
	}

}
