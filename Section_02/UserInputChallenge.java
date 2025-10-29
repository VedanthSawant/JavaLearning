package Section_02;


import java.util.Scanner;

public class UserInputChallenge {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int count = 1; 
		Double sum = 0.0;
		do {
			System.out.print("Enter number #" + count + ": ");
			String nextNumber = obj.nextLine();
			try {
				Double number = Double.parseDouble(nextNumber);
				sum += number;
				count++;
			}catch(NumberFormatException e) {
				System.out.println("Invalid Number");
			}
		}while(count <= 5);
		System.out.println("Sum of all 5 numbers is " + sum);
		obj.close();
		
	}

}
