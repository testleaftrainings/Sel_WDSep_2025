package week3.day1;

public class Toyato extends Car {
	public void nameOfTheCar() {
		System.out.println("Glanza");
	}
	public void bandLogo() {
		System.out.println("T");
	}
	public void serviceOfTheCar() {
		System.out.println("till 1 years  warrany");
	}
	public static void main(String[] args) {
		Toyato product = new Toyato();
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
