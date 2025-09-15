package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnVerificationMethod {

	public static void main(String[] args) throws InterruptedException {

    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://leafground.com/checkbox.xhtml");
    WebElement basicCheckBox = driver.findElement(By.xpath("//span[text()='Basic']"));
    //basicCheckBox.click();
    boolean status = driver.findElement(By.xpath("//span[text()='Basic']/preceding-sibling::div/input")).isSelected();
    System.out.println("selected Status of the basic checkbox is "+ status);
    if (!status) {
    	 basicCheckBox.click();
    	 Thread.sleep(1000);
    	 boolean selected = driver.findElement(By.xpath("//span[text()='Basic']/preceding-sibling::div/input")).isSelected();
    	 System.out.println("status after The  Click : "+selected);
	}
    driver.close();
	}

}
