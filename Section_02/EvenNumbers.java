package Section_02;

public class EvenNumbers {
	public static void main(String[] args) {
		int range = 5, oddCount = 0, evenCount = 0;
		while(range <= 20) {
			boolean result = isEvenNumber(range);
			if (result) {
				evenCount++;
				System.out.println(range + " is an even number");
			}else {
				oddCount++;
			}
			if (evenCount == 5) {
				break;
			}
			range++;
			
		}
		System.out.println("Total even numbers are " + evenCount + " and total number of odd"
				+ " numbers are " + oddCount);
		
	}
	public static boolean isEvenNumber(int number) {
		if (number % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}

}
