package Section_01;


public class Challange_01 {
	public static void main(String[] args) {
		double valueOne = 20.00;
		double valueTwo = 80.00;
		double resultOne = (valueOne + valueTwo ) * 100;
		double resultOneRem = resultOne % 39.00;
		boolean isZero = resultOneRem == 0.00 ? true : false;
		System.out.println(isZero);
		if (!isZero) {
			System.out.println("got some remainder");
		}
		
	}

}