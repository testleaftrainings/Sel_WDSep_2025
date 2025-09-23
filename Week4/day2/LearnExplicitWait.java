package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {

	public static void main(String[] args) {
		int expectedCountOfWindowTobeOpened=3;
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://leafground.com/window.xhtml");
		driver.findElement(By.xpath("//span[text()='Open with delay']/parent::button")).click();
	    int actualCountOfwindow = driver.getWindowHandles().size();
	    System.out.println("actual Count Of window : "+actualCountOfwindow);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		Boolean status = wait.until(ExpectedConditions.numberOfWindowsToBe(expectedCountOfWindowTobeOpened));
		//driver.getWindowHandles().size() == expectedNumberOfWindow
		if (status) {
			driver.quit();
		}
	}

}
