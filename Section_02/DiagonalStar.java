package Section_02;

import java.util.Scanner;

public class DiagonalStar {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = obj.nextInt();
		printSquareStar(number);
		obj.close();
		
	}
	public static void printSquareStar(int number) {
		if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        // Outer loop → rows
        for (int row = 1; row <= number; row++) {

            // Inner loop → columns
            for (int col = 1; col <= number; col++) {

                // 4 conditions for printing a star
                if (row == 1 || row == number ||           // first or last row
                    col == 1 || col == number ||           // first or last column
                    row == col ||                          // main diagonal
                    col == (number - row + 1)) {           // secondary diagonal

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // move to next line after each row
            System.out.println();
        }
	}

}
