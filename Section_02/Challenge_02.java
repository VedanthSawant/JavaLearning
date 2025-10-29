package Section_02;

import java.util.Scanner;

public class Challenge_02 {
	public static void main(String[] args) {
		boolean quit = false;
		double min = 0, max = 0;
		Scanner obj = new Scanner(System.in);
		while(!quit) {
			System.out.print("Enter a number (or character to quit): ");
			
			if(!obj.hasNextInt()) {
				quit = true;
				break;
			}
			double userInput = obj.nextDouble();
			if(min == 0 && max == 0) {
				max = userInput;
				min = userInput;
			}else {
				if(userInput > max) {
					max = userInput;
				}else if(userInput < min) {
					min = userInput;
				}
			}
			
		}
		System.out.println("Maximun number is " + max);
		System.out.println("Minumun number is " + min);
		obj.close();
	}
}
