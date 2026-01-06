package objectRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	WebDriver driver;

	public homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Campaigns")
	private WebElement campaignsLink;

	@FindBy(linkText = "Products")
	private WebElement productbtn;

	@FindBy(xpath = "//div[text()='Logout ']")
	private WebElement logoutBtn;

	@FindBy(className = "user-icon")
	private WebElement userIcon;


	public WebElement getProductbtn() {
		return productbtn;
	}

	public WebElement getCampaignsLink() {
		return campaignsLink;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	public WebElement getUserIcon() {
		return userIcon;
	}
}

