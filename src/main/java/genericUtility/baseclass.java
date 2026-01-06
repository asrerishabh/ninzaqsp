package genericUtility;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import objectRepository.homepage;
import objectRepository.loginpage;


public class baseclass {
	public WebDriver driver;
	propertiesFileUtilities pfu = new propertiesFileUtilities();
	
	@BeforeClass(groups = { "smoke", "regression" })
	public void launchTheBrowser() throws IOException {
		ChromeOptions settings = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("profile.password_manager_leak_detection", false);
		settings.setExperimentalOption("prefs", prefs);
		
		//String BROWSER = pfu.readDataFromPropertiesFile("BROWSER");
		String BROWSER=System.getProperty("BROWSER");
		if (BROWSER.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver(settings);
		else if (BROWSER.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		else if (BROWSER.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else if (BROWSER.equalsIgnoreCase("safari"))
			driver = new SafariDriver();
		
		Reporter.log("Launching the Browser");
		driver.manage().window().maximize();
		WebDriverUtility wdU = new WebDriverUtility();
		wdU.implicitWait(driver);
	}
	
	@BeforeMethod(groups = { "smoke", "regression" })
	public void login() throws IOException {
//	Login 
		
		loginpage logp = new loginpage(driver);
		driver.get(pfu.readDataFromPropertiesFile("URL"));
		
		logp.getUsernameTF().sendKeys(pfu.readDataFromPropertiesFile("USERNAME"));
		logp.getPasswordTF().sendKeys(pfu.readDataFromPropertiesFile("PASSWORD"));
		logp.getSignInBtn().submit();
	}
		
//	@AfterMethod(groups= {"smoke","regression"})
//	public void logout() {			
////			logout
//			homepage hp = new homepage(driver);
//			hp.getLogoutBtn().click();
//			driver.quit();
//	}
}
	
	
