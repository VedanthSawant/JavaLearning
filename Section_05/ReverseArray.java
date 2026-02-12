package Section_05;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int size = sc.nextInt();
		int[] testArr = new int[size];
		for(int i = 0; i < size; i++) {
			System.out.print("Enter the value: ");
			testArr[i] = sc.nextInt();
			
		}
		System.out.println("Original Array: " + Arrays.toString(testArr));
		reversaArr(testArr);
		sc.close();
		
	}
	private static void reversaArr(int[] arr) {
		int tempValue;
		for(int i = 0, j = arr.length - 1; i <= j; i++, j--) {
			tempValue = arr[i];
			arr[i] = arr[j];
			arr[j] = tempValue;
		}
		System.out.println("Reverse Array: " + Arrays.toString(arr));
	}
	

}
