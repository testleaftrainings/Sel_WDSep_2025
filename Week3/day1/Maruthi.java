package week3.day1;

public class Maruthi extends Car {
	// MOU -> Design company , automobile spare manufacture
	public void nameOfTheCar() {
		System.out.println("baleno");
	}
	public void bandLogo() {
		System.out.println("S");
	}
	public void serviceOfTheCar() {
		System.out.println("till 2 years  warrany and First 4  no cost free service");
	}
	public static void main(String[] args) {
		Maruthi product = new Maruthi();
		product.brake();
		product.accelarator();
		product.headlight();
		product.horn();
		product.steering();
		product.designOfCar();
		product.bandLogo();
		product.nameOfTheCar();
		product.serviceOfTheCar();
	}
}
