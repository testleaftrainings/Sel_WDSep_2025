package week2.day1;

public class LearnPrivate {
// can we create a object for the class which we wanted , within the main method
// of the different class..?
	// answer --> yes
	public static void main(String[] args) {
		LearnMethodsAndObjects object = new LearnMethodsAndObjects();
		System.out.println(object.addNum(45, 8799));
		LearnMethodsAndObjects method = new LearnMethodsAndObjects();
		System.out.println(method.addNum(898635, 452317));

	}

}
