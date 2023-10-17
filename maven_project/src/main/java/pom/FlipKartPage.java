package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipKartPage {
	
	public FlipKartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@title='Search for Products, Brands and More']")
	private WebElement searchProductsTextBox;
	
	@FindBy(xpath = "//div[@class='_1YokD2 _3Mn1Gg']//div[@class='_1AtVbE col-12-12']//div[@class='_13oc-S']")
	private List<WebElement> phones;
	
	@FindBy(xpath = "//div[@class='JFPqaw']//span[@role = 'button']")
	private WebElement closeLoginPageCrossButton;
	
	@FindBy(xpath = "//span[text()='Become a Seller']")
	private WebElement becomeASellerLink;
	
	@FindBy(xpath = "(//a[contains(text(),'Fees and Commission')])[2]")
	private WebElement feesAndCommissionLink;
	
	@FindBy(xpath = "//div[@id='grossMargin']")
	private WebElement grossMarginElement;
	
	@FindBy(xpath = "//button[text()='Start Selling']")
	private WebElement startSellingButton;
	
	@FindBy(xpath = "//input[@name='mobileNumber']")
	private WebElement mobileNumberTextBox;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement emailIdTextBox;
	
	@FindBy(xpath = "//input[@name='pan']")
	private WebElement panTextBox;
	
	@FindBy(xpath = "//div[text()='Only Books']")
	private WebElement onlyBooksSelectBox;
	
	@FindBy(xpath = "//span[text()='Register & Continue']")
	private WebElement registerAndContinueButton;
	
	public WebElement getSearchProductsTextBox() {
		return searchProductsTextBox;
	}

	public List<WebElement> getPhones() {
		return phones;
	}

	public WebElement getCloseLoginPageCrossButton() {
		return closeLoginPageCrossButton;
	}

	public WebElement getBecomeASellerLink() {
		return becomeASellerLink;
	}

	public WebElement getFeesAndCommissionLink() {
		return feesAndCommissionLink;
	}

	public WebElement getGrossMarginElement() {
		return grossMarginElement;
	}

	public WebElement getStartSellingButton() {
		return startSellingButton;
	}

	public WebElement getMobileNumberTextBox() {
		return mobileNumberTextBox;
	}

	public WebElement getEmailIdTextBox() {
		return emailIdTextBox;
	}

	public WebElement getPanTextBox() {
		return panTextBox;
	}

	public WebElement getOnlyBooksSelectBox() {
		return onlyBooksSelectBox;
	}

	public WebElement getRegisterAndContinueButton() {
		return registerAndContinueButton;
	}
	
	
	

}
