package test_classes;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base_classes.FlipKart_Base;
import pom.FlipKartPage;

public class Flipkart_002_Test extends FlipKart_Base{
	
	//Getting Gross Margin Content
	@Test
	public void grossMarginData() throws InterruptedException {
		FlipKartPage flipKartPage = new FlipKartPage(driver);
		flipKartPage.getCloseLoginPageCrossButton().click();
		Thread.sleep(2000);
		flipKartPage.getBecomeASellerLink().click();
		Thread.sleep(2000);
		flipKartPage.getFeesAndCommissionLink().click();
		Thread.sleep(2000);
		WebElement grossMarginElement = flipKartPage.getGrossMarginElement();
		Thread.sleep(2000);
		System.out.println(grossMarginElement.getText());
		
	}

}
