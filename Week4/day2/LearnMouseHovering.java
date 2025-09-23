package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHovering {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.myntra.com");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Men']")))
		.pause(Duration.ofSeconds(2))
		.click(driver.findElement(By.xpath("//a[text()='T-Shirts']"))).perform();
		act.scrollToElement(driver.findElement(By.partialLinkText("Contact Us"))).perform();
	}
}
