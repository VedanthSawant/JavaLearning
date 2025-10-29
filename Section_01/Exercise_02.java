package Section_01;

public class Exercise_02 {
	public static void main(String[] args) {
		byte bytenum = 100;
		short shortnum = 1000;
		int intnum = 100000;
		long total = 50000L + (10L * (bytenum + shortnum + intnum));
		System.out.println("Final answer is "+ total);
		
	}

}

