package week2.day1;

public class PrintOddNumber {

	public static void main(String[] args) throws InterruptedException {
		// requirement is --> Print the first 5  odd numbers from natural number--> 
		System.out.println("Print the first 5 odd numbers in the natural numbers");
		for (int i = 1; i <=10; i++) {
		if (i%2==1) { 
			System.out.println(i);
			Thread.sleep(500);
		}		
		}
		
	}

}
