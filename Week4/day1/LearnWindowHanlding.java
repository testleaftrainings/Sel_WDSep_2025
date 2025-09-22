package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHanlding {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://leafground.com/window.xhtml");
		// Retrieve the window handler id of the current window
		String parentWindow = driver.getWindowHandle();
		System.out.println("parent Window handler id is "+ parentWindow);
		driver.findElement(By.xpath("//h5[contains(text(),'Confirm')]/following-sibling::button")).click();
		// step 1 : Get the id of all currently opened window
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("Window handler id of currently opened window");
		for (String string : windowHandles) {
			System.out.println(string);
		}
		// step 2: convert set to list
		List<String> listOfWindowId = new ArrayList<String>(windowHandles);
		String childWindow = listOfWindowId.get(1);
		// step 3: retrieve the particular window id pass it as argument within window(_)
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());// Dashboard //Window 
		driver.close();
		// NoSuchWindowException
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());// Dashboard //Window 
		driver.close();

	}
}
