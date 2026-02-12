package Section_05;

import java.util.Arrays;
import java.util.Random;

public class ArraysDemo {
	public static void main(String[] args) {
		int[] firstArray = getRandomArray(10);
		System.out.println(Arrays.toString(firstArray));
		Arrays.sort(firstArray);
		System.out.println(Arrays.toString(firstArray));
		
		int[] secondArray = new int[10];
		System.out.println(Arrays.toString(secondArray));
		Arrays.fill(secondArray, 5);
		System.out.println(Arrays.toString(secondArray));
		
		int[] ThirdArray = getRandomArray(10);
		System.out.println(Arrays.toString(ThirdArray));
		int[] fourthArray = Arrays.copyOf(ThirdArray, ThirdArray.length);
		System.out.println(Arrays.toString(fourthArray));
		
		int[] smallArray = Arrays.copyOf(ThirdArray, 5);
		System.out.println(Arrays.toString(smallArray));
		
		int[] largeArray = Arrays.copyOf(ThirdArray, 12);
		System.out.println(Arrays.toString(largeArray));
		
		String[] sArray = {"aaa", "bbb", "ccc", "ddd", "eee"};
		Arrays.sort(sArray);
		System.out.println(Arrays.toString(sArray));
		if(Arrays.binarySearch(sArray, "ccc") >= 0) {
			System.out.println("Found in the list");
		}
		
		int s1[] = {1,2,3,4,5};
		int s2[] = {1,2,3,4,5};
		if(Arrays.equals(s1, s2)) {
			System.out.println("Both arrays are equal");
		}else {
			System.out.println("Arrays are not equal");
		}
		
	}
	private static int[] getRandomArray(int len) {
		Random rand = new Random();
		int[] newArray = new int[len];
		for(int i = 0; i < len; i++) {
			newArray[i] = rand.nextInt(100);
		}
		return newArray;
	}
}
