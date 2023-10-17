package test_classes;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base_classes.Amazon_Base;
import pom.AmazonPage;

public class Amazon_003_Test extends Amazon_Base{

	@Test
	public void testAllFooterLinks() throws InterruptedException {
		AmazonPage amazonPage = new AmazonPage(driver);
		List<WebElement> footerLinks  = amazonPage.getFooterLinks();
		
		int workingLinksCount = 0;
		int totalNumberOfLinks = footerLinks.size();
		System.out.println("Total Numer of Links Present: "+totalNumberOfLinks);
		
	
		
		
		for(WebElement link : footerLinks) {
			String url1 = driver.getCurrentUrl();
			//String linkText = link.getText();
			link.click();
			String url2 = driver.getCurrentUrl();
			if(!url1.equals(url2)) {
				System.out.println(" URL is working");
				workingLinksCount++;
				driver.navigate().back();
			}else {
				System.out.println(link.getText()+" URL is not Working");
			}
			
		}
		System.out.println("Total Number of Working Links: "+workingLinksCount);
	}
}
