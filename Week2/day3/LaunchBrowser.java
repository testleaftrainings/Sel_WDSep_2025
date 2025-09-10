package week2.day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// step 1: Set up driver
		// syntax : ChromeDriver  objectName = new ConstructorOfTheClass();
		ChromeDriver driver = new ChromeDriver();
		// step 2 : load the url and maximize the window
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		// step 3 : Close the browser
		driver.close();
		
		
		

	}

}
