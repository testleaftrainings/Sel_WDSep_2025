package week3.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnImplicitlyWait {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		List<WebElement> elements = driver.findElements(By.tagName("a"));
//		String text = elements.get(5).getText();
//		System.out.println(text);
		for (WebElement webElement : elements) {
			String valueOftheElement = webElement.getText();
			System.out.println(valueOftheElement);
		}

	}

}
