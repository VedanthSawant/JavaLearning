package Section_01;

import java.util.Scanner;

public class MegaBytesConverter {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter KiloBytes: ");
		int kiloBytes = obj.nextInt();
		printMegaBytesAndKiloBytes(kiloBytes);
		obj.close();
	}
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if (kiloBytes < 0) {
			System.out.println("Invalid Value");
		}else {
			int megabytes = kiloBytes / 1024;
			int kilobytes = kiloBytes % 1024;
			System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + kilobytes + " KB");
		}
	}
}
