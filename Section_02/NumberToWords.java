package Section_02;

import java.util.Scanner;

public class NumberToWords {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = obj.nextInt();
		numberToWords(number);
		obj.close();
	}
	public static void numberToWords(int number) {
		String output = "";
		if (number < 0) {
			System.out.println("Invalid Value");
		}else if(number == 0){
			System.out.println("Zero");
		}else {
			int reverseNum = reverse(number);
			int reversedDigits = getDigitCount(reverseNum);
			while(reverseNum > 0) {
				int lastDigit = reverseNum % 10;
				switch(lastDigit) {
					case 0: output += " Zero"; break;
					case 1:	output += " One"; break;
					case 2: output += " Two"; break;
					case 3: output += " Three"; break;
					case 4: output += " Four"; break;
					case 5: output += " Five"; break;
					case 6: output += " Six"; break;
					case 7: output += " Seven"; break;
					case 8: output += " Eight"; break;
					case 9: output += " Nine"; break;
				}
				reverseNum /= 10;
			}
			int originalDigits = getDigitCount(number);
			for (int i = 0; i < (originalDigits - reversedDigits); i++) {
				output += " Zero";
	        }
			System.out.println(output);
		}
		
	}
	public static int reverse(int number) {
		int reverseNum = 0;
		boolean isNegative = number < 0;
        number = Math.abs(number);
		while(number > 0) {
			int lastDigit = number % 10;
			number = number / 10;
			reverseNum = lastDigit + reverseNum * 10;
		}
		return isNegative ? -reverseNum : reverseNum;
	}
	public static int getDigitCount(int number) {
		if(number < 0) {
			return -1;
		}else if(number == 0){
			return 1;
		}else {
			int count = 0;
			while(number > 0) {
				number = number / 10;
				count = count + 1;
			}
			return count;
		}
	}

}
