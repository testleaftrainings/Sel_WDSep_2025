package week4.day3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class LearnBrowserOptions {

	public static void main(String[] args) throws IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--start-maximized");
		ChromeDriver driver = new ChromeDriver(options);
	
//		EdgeOptions opt = new EdgeOptions();
//		opt.addArguments("--inprivate");
//		EdgeDriver driver =new EdgeDriver(opt);
//		driver.get("https://www.speedtest.net/");
		
//		FirefoxOptions opt = new FirefoxOptions();
//		opt.addArguments("--private");
//		opt.addArguments("--start-maximized");
//		FirefoxDriver driver =new FirefoxDriver(opt);
		driver.get("https://www.speedtest.net/");
		// Step 1 : stored the temporary file as a local variable
		File src = driver.getScreenshotAs(OutputType.FILE);
		// Step 2 : we have created the folder and file name along with the file format 
		File target = new File("./snap/browserMode.png");
		// step 3 : transfer the data from the temp to physical file
		FileUtils.copyFile(src, target);
	}
}
