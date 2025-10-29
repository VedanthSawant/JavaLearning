package Section_01;

import java.util.Scanner;

public class BarkingDog {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Is dog barking (true/false): ");
		boolean barking = obj.nextBoolean();
		System.out.print("Enter hour of the day: ");
		int hourOfDay = obj.nextInt();
		System.out.println(shouldWakeUp(barking, hourOfDay));
		obj.close();
	}
	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
		if (hourOfDay < 0 || hourOfDay > 23) {
			return false;
		}else {
			if (barking) {
				if (hourOfDay < 8 || hourOfDay > 22 ) {
					return true;
				}else {
					return false;
				}
			}else {
				return false;
			}
		}
	}
}
