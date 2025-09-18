package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://leafground.com/alert.xhtml");
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		Thread.sleep(1000);
		// Simple modal alert
		driver.switchTo().alert().accept();
		// UnhandledAlertException
		String verificationTextFromSimpleAlert = driver.findElement(By.id("simple_result")).getText();
		System.out.println(verificationTextFromSimpleAlert);
		// confirmation modal alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		System.out.println(driver.switchTo().alert().getText());
		// NoAlertPresentException
		driver.switchTo().alert().dismiss();
		// prompt alert
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following-sibling::button")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Bhuvanesh");
		alert.accept();
		System.out.println(driver.findElement(By.id("confirm_result")).getText());
	}
}
