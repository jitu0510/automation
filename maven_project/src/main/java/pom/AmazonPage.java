package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {
	
	public AmazonPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "searchDropdownBox")
	private WebElement searchDropDownBox;
	
	@FindBy(id = "nav-search-submit-button")
	private WebElement searchButton;
	
	@FindBy(xpath = "//img[@alt='Speakers']")
	private WebElement speakersImage;

	@FindBy(xpath = "//strong[text()='*TnC']/..")
	private WebElement termsAndConditionsElement;
	
	@FindBy(xpath = "//div[@class='content']//div[@class='text align-start color-squid-ink font-size-medium ember font-normal']")
	private WebElement termsAndConditionsContent;
	
	@FindBy(xpath = "//a[text()='Sell']")
	private WebElement sellLink;
	
	@FindBy(xpath = "//div[@id='navFooter']//div[@role='presentation']//a")
	private List<WebElement> footerLinks;
	
	public WebElement getSearchDropDownBox() {
		return searchDropDownBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getSpeakersImage() {
		return speakersImage;
	}

	public WebElement getTermsAndConditionsElement() {
		return termsAndConditionsElement;
	}

	public WebElement getTermsAndConditionsContent() {
		return termsAndConditionsContent;
	}

	public WebElement getSellLink() {
		return sellLink;
	}

	public List<WebElement> getFooterLinks() {
		return footerLinks;
	}
	
	
	

}
