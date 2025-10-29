package Section_01;

import java.util.Scanner;

public class pounds_to_kg {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter pounds: ");
		
		double pounds = myObj.nextDouble();
		double kg = pounds * 0.45359237;
		System.out.println(pounds + " pound is equal to " + kg + " kg.");
		myObj.close();
	}

}
