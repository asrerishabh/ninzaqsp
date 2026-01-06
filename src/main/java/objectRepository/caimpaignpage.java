package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class caimpaignpage {
	WebDriver driver;
	 public caimpaignpage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	
	@FindBy(xpath="//button[@class='btn btn-info']")
	 private WebElement addCreateCampaignBtn1;
	
	@FindBy(name="campaignName")
	 private WebElement campaignName;
	
	@FindBy(name="targetSize")
	 private WebElement targetSize;
	
	@FindBy(xpath="//button[text()='Create Campaign']")
	 private WebElement submitButton;
	 
	@FindBy(xpath="//div[text()='Campaign uyuiu Successfully Added']")
	 private WebElement toastmsg1;

	@FindBy(name="expectedCloseDate")
	 private WebElement expectedCloseDate;
	 
	@FindBy(name="targetAudience")
	 private WebElement targetAudience;
	 
	@FindBy(name="description")
	 private WebElement description;
	 
	@FindBy(name= "campaignStatus")
	 private WebElement campaignStatus;
	 
	
	
//	private WebElement toastmsg;
	
//	public WebElement getToastmsg() {
//		return toastmsg;
//	}

	public WebElement getTargetSize() {
		return targetSize;
	}

	public WebElement getToastmsg1() {
		return toastmsg1;
	}

	
	public WebElement getExpectedCloseDate() {
		return expectedCloseDate;
	}

	
	public WebElement getTargetAudience() {
		return targetAudience;
	}

	

	public WebElement getCampaignStatus() {
		return campaignStatus;
	}

	
	
	public WebElement getDescription() {
		return description;
	}

	public WebElement getAddCreateCampaignBtn1() {
		return addCreateCampaignBtn1;
	}

	public WebElement getCampaignName() {
		return campaignName;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

}
