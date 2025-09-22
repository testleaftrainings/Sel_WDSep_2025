package week4.day1;

public class ChildClass extends LearnFinalKeyword {
	// String browser;
//	public void getBrowser() {
//	}

	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		String browser2 = cc.browser;
		System.out.println(browser2);
	}
}
