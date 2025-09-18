package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://leafground.com/frame.xhtml");
		// shift the driver focus from root html doc to specific iframe's html doc
		// based on index 
		driver.switchTo().frame(0);
		// NoSuchFrameException ---> if index value is exceeding the current frame count
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();// NoSuchElementException
		// shift the driver focus back to the root html doc
		driver.switchTo().defaultContent();
		// based of webelement
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='nested.xhtml']")));
		System.out.println(driver.findElement(By.id("Click")).getText());
		// shift the driver focus back to the root html doc
		driver.switchTo().defaultContent();
		// based on webelement
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='page.xhtml']")));
		// based on id/name attribute
		driver.switchTo().frame("frame2");
		WebElement innerFrameButton = driver.findElement(By.id("Click"));
		innerFrameButton.click();
		System.out.println(innerFrameButton.getText());
		// shift the driver focus back to the parent frame's html doc
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
	}

}
