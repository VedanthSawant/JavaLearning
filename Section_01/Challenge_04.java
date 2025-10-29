package Section_01;

import java.util.Scanner;

public class Challenge_04 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter height in feet: ");
		int heightInFeet = obj.nextInt();
		System.out.print("Enter height in inches: ");
		int heightinInches = obj.nextInt();
		double inCentimeters = convertToCentimeters(heightInFeet, heightinInches);
		System.out.println(heightInFeet + " Feet and " + heightinInches + " inches is equal to " + 
		inCentimeters + " centimeters");
		obj.close();
		
	}
	public static double convertToCentimeters(int heightInInches) {
		return heightInInches * 2.54;
	}
	public static double convertToCentimeters(int heightInFeet, int heightInInches) {
		int htInInches = heightInFeet * 12;
		return convertToCentimeters(htInInches + heightInInches);
	}

}
