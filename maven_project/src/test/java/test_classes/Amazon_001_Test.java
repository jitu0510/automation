package test_classes;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import base_classes.Amazon_Base;
import pom.AmazonPage;

public class Amazon_001_Test extends Amazon_Base{

	@Test
	public void testGamingLaptopImage() throws InterruptedException {
		AmazonPage amazonPage = new AmazonPage(driver);
		
		Select select = new Select(amazonPage.getSearchDropDownBox());
		
		select.selectByVisibleText("Electronics");
		Thread.sleep(5000);
		amazonPage.getSearchButton().click();
		String url1 = driver.getCurrentUrl();
		Thread.sleep(2000);
		amazonPage.getSpeakersImage().click();
		String url2 = driver.getCurrentUrl();
		
		Assert.assertNotEquals(url1, url2, "Url is not changing after clicking on the Speakers image");
		
		System.out.println("Url is changing after clicking on the Speakers image");
	}
	
	
}
