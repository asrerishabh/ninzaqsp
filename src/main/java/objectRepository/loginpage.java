package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
WebDriver driver;
	
	public loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "username")
	private WebElement usernameTF;
	
	@FindBy(id = "inputPassword")
	private WebElement passwordTF;
	
	@FindBy (xpath = "//button[text()='Sign In']")
	private WebElement signInBtn;

	@FindBy(xpath = "//div[@role='alert']")
	private WebElement toastMsg;

	@FindBy(xpath = "//button[@aria-label='close']")
	private WebElement closeToastMsg;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getToastMsg() {
		return toastMsg;
	}

	public WebElement getCloseToastMsg() {
		return closeToastMsg;
	}

	public WebElement getUsernameTF() {
		return usernameTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getSignInBtn() {
		return signInBtn;
	}
	
}