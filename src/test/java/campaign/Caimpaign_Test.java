package campaign;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.ExcelFileUtility;
import genericUtility.baseclass;
import genericUtility.javautility;
import objectRepository.caimpaignpage;

@Listeners(listner.listner.class)
public class Caimpaign_Test extends baseclass {
	ExcelFileUtility efu = new ExcelFileUtility();
	ExcelFileUtility eLib = new ExcelFileUtility();
	caimpaignpage cp;

	@Test
	public void campaignWithMendatoryFields() throws InterruptedException, EncryptedDocumentException, IOException {
		cp = new caimpaignpage(driver);
		// WebDriver driver = new ChromeDriver(settings);

		cp.getAddCreateCampaignBtn1().click();
		javautility.enterRandomString(cp.getCampaignName(), 8);

		String TARGET_SIZE = eLib.readDataFromExcel("Campaign", 1, 1);
		System.out.println("adding changes");
// for testing only
		WebElement createButton = cp.getSubmitButton();
		createButton.click();
		Assert.assertTrue(cp.getToastmsg1().getText().contains("Successfully Added"));

	}

	@Test
	public void campaignWithAllFields() throws EncryptedDocumentException, IOException {
		cp = new caimpaignpage(driver);
		cp.getAddCreateCampaignBtn1().click();
		javautility.enterRandomString(cp.getCampaignName(), 6);
		javautility.getRequiredDate(5);
		// String expecteddate =efu.readDataFromExcel("Campaign", 1 , 2);
		String targetaudiance = efu.readDataFromExcel("Campaign", 1, 3);
		String caimpaignstatus = efu.readDataFromExcel("Campaign", 1, 4);
		String description = efu.readDataFromExcel("Campaign", 1, 5);
		WebElement createButton = cp.getSubmitButton();
		createButton.click();
		Assert.assertTrue(cp.getToastmsg1().getText().contains("Successfully Added"));

	}

}
