package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://leafground.com/table.xhtml");
		String name = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td[1]")).getText();
		System.out.println(name);
		// size()---> it will retrieve the size of the collection
		int totalNoOfRows = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr")).size();
		int totalNoOfColumns = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td")).size();
		System.out.println("total no of rows :"+ totalNoOfRows+" * total no of columns  :"+totalNoOfColumns);
		for (int i = 1; i <= totalNoOfRows; i++) {// outerloop --> iteration of row  inside the table
			System.out.print("|");
			for (int j = 1; j <= totalNoOfColumns; j++) { // innner loop --> iteration of column inside the table
				String data = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(data+"|");
			}
			System.out.println();
		}
	}
}
