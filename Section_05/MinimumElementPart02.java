package Section_05;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementPart02 {
	public static void main(String[] args) {
		int arrLen = readInteger();
		int[] numberArr = readElements(arrLen);
		System.out.println(Arrays.toString(numberArr));
		int minValue = findMin(numberArr);
		System.out.println("Minimun value in the array is " + minValue);
		
	}
	private static int readInteger() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int len = sc.nextInt();
		return len;
	}
	private static int[] readElements(int len) {
		Scanner sc = new Scanner(System.in);
		int[] numArr = new int[len];
		for(int i = 0; i < len; i++) {
			System.out.print("Enter the value: ");
			numArr[i] = sc.nextInt();
		}
		return numArr;
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
