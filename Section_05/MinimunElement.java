package Section_05;

import java.util.Arrays;
import java.util.Scanner;

public class MinimunElement {
	public static void main(String[] args) {
		int[] numberArr = readIntegers();
		System.out.println(Arrays.toString(numberArr));
		int minValue = findMin(numberArr);
		System.out.println("Minimun value in the array is " + minValue);
		
	}
	private static int[] readIntegers() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number seperated by commas eg 10,20,30: ");
		String input = sc.nextLine();
		
		String[] sInput = input.split(",");
		int[] numbers = new int[sInput.length];
		for(int i = 0; i < sInput.length; i++) {
			numbers[i] = Integer.parseInt(sInput[i]);
		}
		return numbers;
	}
	
	private static int findMin(int[] arr) {
		int min = 0;
		for(int i = 0; i < arr.length; i++) {
			if(i == 0) {
				min = arr[i];
			}else {
				if(arr[i] < min) {
					min = arr[i];
				}
			}
		}
		return min;
	}

}
