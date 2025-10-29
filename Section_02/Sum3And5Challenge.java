package Section_02;

public class Sum3And5Challenge {
	public static void main(String[] args) {
		int sum = 0, counter = 5;
		for (int num = 1; num <= 1000; num++) {
			if (num % 3 == 0 && num % 5 == 0) {
				if (counter > 0) {
					System.out.println(num);
					sum += num;
					counter --;
				}else {
					break;
				}
			}
		}
		System.out.println("Sum of the nmbers are " + sum);
	}

}
