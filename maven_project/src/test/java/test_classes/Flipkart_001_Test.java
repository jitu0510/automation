package test_classes;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base_classes.FlipKart_Base;
import pom.FlipKartPage;

public class Flipkart_001_Test extends FlipKart_Base{
	
	//Number of Phones listed in the first page
	@Test
	public void countNumberOfPhones() throws InterruptedException {
		FlipKartPage flipKartPage = new FlipKartPage(driver);
		flipKartPage.getCloseLoginPageCrossButton().click();
		//flipKartPage.getSearchProductsTextBox().click();
		
		
		flipKartPage.getSearchProductsTextBox().sendKeys("Mobiles");
		Thread.sleep(2000);
		flipKartPage.getSearchProductsTextBox().sendKeys(Keys.DOWN);
		flipKartPage.getSearchProductsTextBox().sendKeys(Keys.ENTER);
		
		List<WebElement> phones = flipKartPage.getPhones();
		
		System.out.println("Number of phones visible: "+phones.size());
		
	}

}
