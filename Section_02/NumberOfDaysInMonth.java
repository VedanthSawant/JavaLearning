package Section_02;

import java.util.Scanner;

public class NumberOfDaysInMonth {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter month(1 to 12): ");
		int month = obj.nextInt();
		System.out.print("Enter year: ");
		int year = obj.nextInt();
		int result = getDaysInMonth(month, year);
		System.out.println(result);
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
	public static int getDaysInMonth(int month, int year) {
		if (year < 1 || year > 9999) {
			return -1;
		}else {
			return switch(month) {
					case 1,3,5,7,8,10,12 -> 31;
					case 4,6,9,11 -> 30;
					case 2 -> {
						if(isLeapYear(year)) {
							yield 29;
						}else {
							yield 28;
						}
					}
					default -> -1;
			};
		}
	}
}
