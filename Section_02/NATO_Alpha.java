package Section_02;

import java.util.Scanner;

public class NATO_Alpha {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter characters from A to E only: ");
		String name = obj.nextLine();
		NATO(name);
		obj.close();
		
	}
	public static void NATO(String name) {
		for(int i=0;i<name.length();i++) {
			switch(name.charAt(i)) {
			case 'A': case 'a':
				System.out.println("A -> Able.");
				break;
			case 'B': case 'b':
				System.out.println("B -> Baker.");
				break;
			case 'C': case 'c':
				System.out.println("C -> Charlie.");
				break;
			case 'D': case 'd':
				System.out.println("D -> Dog.");
				break;
			case 'E': case 'e':
				System.out.println("E -> Easy.");
				break;
			default: 
				System.out.println("Please enter charecters form A to E only.");
				break;
			}
		}
	}
}
