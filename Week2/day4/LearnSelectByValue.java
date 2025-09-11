package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectByValue {

	public static void main(String[] args) {
		// Basic Locators : ID,Name,ClassName,Linktext, PartialLinktext,Tagname
		// step 1: Set up driver
		// syntax : ChromeDriver objectName = new ConstructorOfTheClass();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		// step 2 : load the url using .get() and maximize the window
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		// step 3 : locate the username field
		// Text based xpath
		String text = driver.findElement(By.xpath("//label[text()='Username']")).getText();
		System.out.println(text);
		// attribute based xpath
		WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
		// step 4 : Enter the valid username --> "demosalesmanager"
		userName.sendKeys("demosalesmanager");
		// step 5 : Locate the password field
		// collection based xpath
		WebElement password = driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]"));
		// step 6 : Enter the valid password --> "crmsfa" for the given username
		password.sendKeys("crmsfa");
		// step 7 : Locate the login button then click it
		// Partial Match based xpath--> attribute
		driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
		// step 8 : Print the title of the page
		driver.findElement(By.partialLinkText("CRM")).click();
		String titleOfTheLeaftaps = driver.getTitle();
		System.out.println(titleOfTheLeaftaps);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		// step 9 :  identify the element & instantiate the select class
		WebElement selectDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select option = new Select(selectDropdown);
		option.selectByValue("LEAD_EMPLOYEE");
	}
}
