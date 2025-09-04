package week1.day2;

public class LearnSelectionStatement {

	public static void main(String[] args) {
		// if(condition ){
		// body of block--> if condition is passed this block will get execute
		// }
		// else{ body of the else block --> if condition is failed}
		boolean primeAccount = true;
		if (primeAccount) {
			System.out.println("Movie starts to play");
		} else {
			System.out.println("It will navigate to the login page");
		}
		int a = 4, b = 3;
		// a<b---> false
		if (a < b) {
			System.out.println("b is greater than a");
		}
		// a==b --> false
		else if (a == b) {
			System.out.println("value of a and b is same");
		} else {
			System.out.println("a is greather than b");
		}

		// switch statement
		String browserName = "firefox";
		switch (browserName) {
		case "chrome":
			System.out.println("chrome browser will be used to execute the current script");
			break;
		case "edge":
			System.out.println("edge browser will be used to execute the current script");
			break;
		default:
			System.out.println("please enter available browser name");
			break;
		}

	}

}
