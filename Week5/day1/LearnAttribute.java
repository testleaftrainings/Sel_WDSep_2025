package week5.day1;

import org.testng.annotations.Test;

public class LearnAttribute {
	@Test(priority = 2,dependsOnMethods = {"runCreateLead"}, alwaysRun = true)
	public void runEditLead() {
		System.out.println("-----Modifying the existing Lead--------");
	}

	@Test(priority = 3, enabled = false)
	public void runAssertion() {
		System.out.println("-----Assertion is done--------");
	}
	
	@Test(priority = 1, invocationCount = 3,threadPoolSize = 2,timeOut = 3000)
	public void runCreateLead() throws InterruptedException {
		Thread.sleep(2500);
		System.out.println("-----Unique Lead is created-----");
	}

}
