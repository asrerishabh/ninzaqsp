package Product;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import genericUtility.ExcelFileUtility;
import genericUtility.WebDriverUtility;
import genericUtility.baseclass;
import objectRepository.homepage;
import objectRepository.productpage;

public class product_class extends baseclass {
	@Test(groups = { "smoke", "regression" })
	public void createProductclass() throws EncryptedDocumentException, IOException {
		
		ExcelFileUtility eu= new ExcelFileUtility();
	String Quantity=	eu.readDataFromExcel("productpage", 1, 5);
	String SELECT_CATEGORY=	eu.readDataFromExcel("productpage", 1, 4);
		String PRICE_PER_UNIT=eu.readDataFromExcel("productpage", 1, 6);
	String SELECT_VENDOR=	eu.readDataFromExcel("productpage", 1, 7);
	String PRODUCT_NAME=eu.readDataFromExcel("productpage", 1, 3);

		
		homepage hp = new homepage(driver);
		hp.getProductbtn().click();

		productpage pp = new productpage(driver);
		pp.getProductbtn().click();

		pp.getProductcreate().click();
		pp.getProductName().sendKeys("PRODUCT_NAME");

		WebDriverUtility ut = new WebDriverUtility();
		ut.select(pp.getProductCategory(), "SELECT_CATEGORY");

		ut.select(pp.getVendorId(), "SELECT_VENDOR");
		pp.getProductQuantity().sendKeys("Quantity");
		pp.getPrice().sendKeys("PRICE_PER_UNIT");
        pp.getProductbtn1().click();
	}

}
