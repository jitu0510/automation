package test_classes;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import base_classes.Amazon_Base;
import pom.AmazonPage;

public class Amazon_002_Test extends Amazon_Base{

	//Fetching the terms and conditions for becoming a seller
	@Test
	public void fetchTermsAndConditions() throws IOException, InterruptedException {
		AmazonPage amazonPage = new AmazonPage(driver);
		amazonPage.getSellLink().click();
		amazonPage.getTermsAndConditionsElement().click();
		
		WebElement termsAndConditions =  amazonPage.getTermsAndConditionsContent();
		TakesScreenshot screenshot = (TakesScreenshot) termsAndConditions;
		
		File dest = new File("./screenshots/terms&conditions.png");
		
		File src  = screenshot.getScreenshotAs(OutputType.FILE);
		Files.copy(src, dest);
		
		System.out.println("Screenshot of T&C captured");
		
		
		
	}
	
}
