package base_classes;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class FlipKart_Base {
	public static WebDriver driver;
	@BeforeMethod
	public synchronized void openBrowser() throws IOException {
		FileInputStream inputStream = new FileInputStream("./src/main/resources/application.properties");
		Properties properties = new Properties();
		properties.load(inputStream);
		String key = properties.getProperty("driverKey");
		String value = properties.getProperty("driverValue");
		System.setProperty(key, value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(properties.getProperty("flipkartURL"));
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
		
	}
	
	

}
