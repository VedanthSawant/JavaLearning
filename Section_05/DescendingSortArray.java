package Section_05;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DescendingSortArray {
	public static void main(String[] args) {
		int[] testArray = getInteger(10);
		System.out.println("Ramdom Array : " + Arrays.toString(testArray));
		System.out.println("\n\n\n");
		System.out.println("----------With Sorting----------");
		System.out.println("Decsending Order Sort: " +Arrays.toString(sortAfterSorting(testArray)));
		System.out.println("\n\n\n");
		System.out.println("----------Without Sorting----------");
		System.out.println("Decsending Order Sort: " +Arrays.toString(sortWithoutSorting(testArray)));
		
	}
	public static int[] getRandomArray(int len) {
		Random rand = new Random();
		int[] newArray = new int[len];
		for(int i = 0; i < len; i++) {
			newArray[i] = rand.nextInt(100);
		}
		return newArray;
	}
	
	public static int[] sortAfterSorting(int[] arr) {
		Arrays.sort(arr);
		System.out.println("Ascending Order Sort: " + Arrays.toString(arr));
		int[] orderArray = new int[10];
		for(int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
			orderArray[j] = arr[i];
		}
		return orderArray;
	}
	
	public static int[] sortWithoutSorting(int[] arr) {
		boolean flag = true;
		int temp;
		while(flag) {
			flag = false;
			for(int i = 0; i < arr.length - 1; i++) {
				if(arr[i] < arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					flag = true;
				}
			}
		}
		return arr;
	}
	
	public static int[] getInteger(int len) {
		Scanner sc = new Scanner(System.in);
		int[] newArray = new int[len];
		for(int i = 0; i < len; i++) {
			newArray[i] = sc.nextInt();
		}
		return newArray;
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Element " + i + " contents " + arr[i]);
		}
	}

}
