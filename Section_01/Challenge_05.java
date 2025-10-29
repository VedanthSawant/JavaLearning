package Section_01;

import java.util.Scanner;

public class Challenge_05 {
	
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter radius of circle: ");
		double radius = obj.nextDouble();
		System.out.println("Area of circle is " + area(radius));
		System.out.print("Enter base of triangle: ");
		double x = obj.nextDouble();
		System.out.print("Enter height of triangle: ");
		double y = obj.nextDouble();
		System.out.println("Area of triangle is " + area(x, y));
		obj.close();
		
	}
	public static double area(double radius) {
		if (radius < 0) {
			return -1.0;
		}
		double circleArea = Math.PI * (Math.pow(radius, 2));
		return circleArea;
	}
	public static double area(double x, double y) {
		if (x < 0 || y < 0) {
			return -1.0;
		}
		double triangleArea = 0.5 * x * y;
		return triangleArea;
	}

}
