package Section_01;

import java.util.Scanner;

public class SecondsAndMinutesChallenge {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter seconds: ");
		int seconds = obj.nextInt();
		if (seconds < 0) {
			System.out.println("Seconds should be always a positive number.");
		}else {
			System.out.println(getDurationString(seconds));
		}
		obj.close();
		
	}
	public static String getDurationString(int seconds) {
		int hours = seconds / 3600;
		int remSeconds = seconds % 3600;
		int minutes  = remSeconds / 60;
		int calSeconds = remSeconds % 60; 
		return hours + "h " + getDurationString(minutes, calSeconds);
	}
	public static String getDurationString(int minutes, int seconds) {
		return minutes + "m " + seconds + "s";
	}

}
