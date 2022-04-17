package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int add = calc.add(11, 13, 29);
		System.out.println("Output for Addition is = " + add);
		int sub = calc.sub(46, 39);
		System.out.println("Output for Subtraction is = " + sub);
		double mul = calc.mul(1452.254, 1245.258);
		System.out.println("Output for Multiplication is = " + mul);
		float div = calc.divide(29F, 6F);
		System.out.println("Output for Division is = " + div);
	}

}