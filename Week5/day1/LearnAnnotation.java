package week5.day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LearnAnnotation {

	// preconditions @before: report ,open browser,load url, refresh

	// tear down @after : screenshot,cookies, close browser,report

	@Test
	public void runCreateLead() {
		System.out.println("-----Unique Lead is created-----");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Refresh/reload's the webpage");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Screenshot is saved");

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Url of the client application is loaded");

	}

	@AfterClass
	public void afterClass() {
		System.out.println("Browser cookies were erased");

	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Setting up the environment : browser is opened");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("Close the browser");

	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Report is started");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Report is flushed");

	}

	@Test
	public void runEditLead() {
		System.out.println("-----Modifying the existing Lead--------");
	}

	@Test
	public void runassertion() {
		System.out.println("-----Assertion is done--------");
	}

}
