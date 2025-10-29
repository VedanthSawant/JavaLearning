package Section_01;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = obj.nextInt();
		boolean isLeap = isLeapYear(year);
		if (isLeap) {
			System.out.println(year + " is a Leap Year.");
		}else {
			System.out.println(year + " is not a Leap Year.");
		}
		obj.close();
	}
	public static boolean isLeapYear(int year) {
		if (year >= 1 && year <= 9999) {
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0) {
						return true;
					}else {
						return false;
					}
					
				}else {
					return true;
				}
			}else {
				return false;
			}
		}else {
			return false;
		}
	}

}
