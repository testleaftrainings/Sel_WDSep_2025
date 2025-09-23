package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnKeyborarAndMouseEvents {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://leafground.com/drag.xhtml");
		Actions act = new Actions(driver);
		// keyboard events
		act.sendKeys(driver.findElement(By.xpath("//input[@placeholder='Search...']")), "Testleaf")
		.keyDown(Keys.SHIFT) // pressing the shift key
		.keyDown(Keys.HOME) // pressing the Home key
		.keyUp(Keys.HOME)  // releasing the Home key
		.keyUp(Keys.SHIFT) // releasing the shift key
		.pause(2000)
		.keyDown(Keys.TAB)
		.keyUp(Keys.TAB)
		.perform();
		// mouse events
		act.dragAndDrop(driver.findElement(By.id("form:drag_content")), driver.findElement(By.id("form:drop_content"))).perform();
	}
}
