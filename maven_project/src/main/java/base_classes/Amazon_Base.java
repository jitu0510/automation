package base_classes;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Amazon_Base {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void initBrowser() throws IOException {
		FileInputStream inputStream = new FileInputStream("./src/main/resources/application.properties");
		Properties properties = new Properties();
		properties.load(inputStream);
		System.setProperty(properties.getProperty("driverKey"), properties.getProperty("driverValue"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(properties.getProperty("amazonURL"));
		
	}

	
	@AfterMethod
	public void destroyBrowser() {
		driver.quit();
	}
}
