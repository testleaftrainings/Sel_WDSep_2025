package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnBasicLocator {

	public static void main(String[] args) {
		// Basic Locators : ID,Name,ClassName,Linktext, PartialLinktext,Tagname
		// step 1: Set up driver
		// syntax : ChromeDriver objectName = new ConstructorOfTheClass();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		// step 2 : load the url using .get() and maximize the window
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		// step 3 : locate the username field
		WebElement userName = driver.findElement(By.id("username"));
		// step 4 : Enter the valid username --> "demosalesmanager"
		userName.sendKeys("demosalesmanager");
		// step 5 : Locate the password field
		WebElement password = driver.findElement(By.name("PASSWORD"));
		// step 6 : Enter the valid password --> "crmsfa" for the given username
		password.sendKeys("crmsfa");
		// step 7 : Locate the login button then click it
		driver.findElement(By.className("decorativeSubmit")).click();
		// step 8 : Print the title of the page
		driver.findElement(By.partialLinkText("CRM")).click();
		String titleOfTheLeaftaps = driver.getTitle();
		System.out.println(titleOfTheLeaftaps);
		// step 9 : Close the browser
		driver.close();
	}
}
