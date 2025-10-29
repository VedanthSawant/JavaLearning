package Section_01;

import java.util.Scanner;

public class Challenge_03 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Please enter players name: ");
		String name = obj.nextLine();
		System.out.print("Please enter the players score: ");
		double score = obj.nextDouble();
		
		int pos = calculateHighScorePosition(score);
		calculateHighScorePosition(name, pos);
		obj.close();
		
	}
	public static void calculateHighScorePosition(String name, int pos) {
		System.out.println(name + " managed to get into position " + pos + " on the high score list.");
		
	}
	public static int calculateHighScorePosition(double score) {
		if (score >= 1000) {
			return 1;
		}else if (score >= 500 && score < 1000) {
			return 2;
		}else if (score >= 100 && score < 500) {
			return 3;
		}else {
			return 4;
		}
	}

}
