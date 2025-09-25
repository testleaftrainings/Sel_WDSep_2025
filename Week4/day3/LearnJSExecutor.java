package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnJSExecutor {

	public static void main(String[] args) {
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
		WebElement submitButton = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/form/p[3]/input"));
		driver.executeScript("arguments[0].click();", submitButton);
		driver.executeScript("window.scrollBy(0,1000);");
	}
}
