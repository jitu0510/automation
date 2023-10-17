package test_classes;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import base_classes.FlipKart_Base;
import pom.FlipKartPage;

public class Flipkart_003_Test extends FlipKart_Base{
	
	//Registering as a seller
	@Test
	public void SellerRegistration() throws IOException {
		FlipKartPage flipKartPage = new FlipKartPage(driver);
		flipKartPage.getCloseLoginPageCrossButton().click();
		flipKartPage.getBecomeASellerLink().click();
		flipKartPage.getStartSellingButton().click();
		
		FileInputStream inputStream = new FileInputStream("./src/test/resources/test_data/flipkart_testdata.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = workbook.getSheet("seller");
		
		System.out.println(sheet.getRow(0).getCell(0).getRawValue());
		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		System.out.println(sheet.getRow(0).getCell(2).getStringCellValue());
		
		
		
		
		flipKartPage.getMobileNumberTextBox().sendKeys(sheet.getRow(0).getCell(0).getRawValue());
		flipKartPage.getEmailIdTextBox().sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
		flipKartPage.getOnlyBooksSelectBox().click();
		flipKartPage.getPanTextBox().sendKeys(sheet.getRow(0).getCell(2).getStringCellValue());
		
		flipKartPage.getRegisterAndContinueButton().click();
		
		
	}

}
