package Section_01;

import java.util.Scanner;

public class SpeedConverter {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter kilometers Per Hour value: ");
		double kilometersPerHour = obj.nextDouble();
		long miles = toMilesPerHour(kilometersPerHour);
		printConversion(kilometersPerHour);
		obj.close();
	}
	public static long toMilesPerHour(double kilometersPerHour) {
		if (kilometersPerHour < 0) {
			return -1;
		}
		long miles = Math.round(kilometersPerHour * 0.621371);
		return (long) miles;
	}
	public static void printConversion(double kilometersPerHour) {
		if (kilometersPerHour < 0) {
			System.out.println("Invalid value");
		}else {
			System.out.println(kilometersPerHour + " km/h = " + Math.round(kilometersPerHour * 0.621371) + " mi/h");
		}
	}
}
