package Section_01;

import java.util.Scanner;

public class YearsAndDays {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter minutes : ");
		long minutes = obj.nextLong();
		printYearAndDays(minutes);
		obj.close();
		
	}
	public static void printYearAndDays(long minutes) {
		if (minutes < 0) {
			System.out.println("Invalid Value");
		}else {
			int year = (int) minutes / 525600;
			int remMinutes = (int) minutes % 525600;
			int days = remMinutes / (24 * 60); // 24 hours and 60 minutes
			System.out.println(minutes + " min = " + year + " y and " + days + " d");
		}
	}
}
