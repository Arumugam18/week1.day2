package week1.day2;

public class LearnMethods {

	public static void main(String[] args) {
		LearnMethods car = new LearnMethods();
		car.printCarName();
		int carregnumber = car.getCarRegNumber();
		System.out.println(carregnumber);
		String carVarient = car.getCarVarient();
		System.out.println(carVarient);
		int multiplyTwoNumbers = car.multiplyTwoNumbers(9, 4);
		System.out.println(multiplyTwoNumbers);
	}

	public void printCarName() {
		System.out.println("Celerio");
	}

	public int getCarRegNumber() {
		return 2219;
	}

	public String getCarVarient() {
		return "Zetec Hatchback";
	}

	public int multiplyTwoNumbers(int a, int b) {
		return a * b;
	}
}
