package Section_02;

import java.util.Scanner;

public class enchancedSwitch {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter day of week(0 to 6): ");
		int day = obj.nextInt();
		printDayofWeek(day);
		obj.close();
		
	}
	public static void printDayofWeek(int day) {
		String weekDay = switch(day) {
			case 0 -> "Monday";
			case 1 -> "Tuesday";
			case 2 -> "Wednesday";
			case 3 -> "Thursday";
			case 4 -> "Friday";
			case 5 -> "Saturday";
			case 6 -> "Sunday";
			default -> "Invalid day";
		};
		System.out.println(day + " is " + weekDay);
	}
}
