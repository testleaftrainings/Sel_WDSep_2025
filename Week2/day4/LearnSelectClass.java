package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectClass {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.navigate().to("https://leafground.com/select.xhtml");
		Thread.sleep(2000);
		WebElement selectDropdown = driver.findElement(By.className("ui-selectonemenu"));
		Select option = new Select(selectDropdown);
		option.selectByIndex(2);// It will select the playwright from dropdown
		// selectByVisibleText()
		option.selectByVisibleText("Playwright");// selectByValue()
	}

}
