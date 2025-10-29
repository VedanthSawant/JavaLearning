package Section_02;

import java.util.Scanner;

public class FlourPacker {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the Big Packet Count: ");
		int bigCount = obj.nextInt();
		System.out.print("Enter the Small Packet Count: ");
		int smallCount = obj.nextInt();
		System.out.print("Enter the goal: ");
		int goal = obj.nextInt();
		boolean result = canPack(bigCount, smallCount, goal);
		System.out.println(result);
		obj.close();
		
	}
	public static boolean canPack(int bigCount, int smallCount, int goal) {
		if(bigCount < 0 || smallCount < 0 || goal < 0) {
			return false;
		}else {
			int finalGoal = 0;
			for(int i = bigCount; i > 0; i--) {
				finalGoal += 5;
				if(finalGoal > goal) {
					finalGoal -= 5;
					break;
				}else {
					bigCount--;
				}
			}
			for(int i = smallCount; i > 0; i--) {
				finalGoal ++;
				if(finalGoal > goal) {
					finalGoal --;
					break;
				}else {
					smallCount--;
				}
			}
			if (finalGoal >= goal) {
				return true;
			}else {
				return false;
			}
		}
	}

}
