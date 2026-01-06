package genericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void waitUntilElementToBeVisible(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void select(WebElement element,int index) {
		Select obj=new Select(element);
		obj.selectByIndex(index);
	}
	
	public void select(WebElement element,String value) {
		Select obj=new Select(element);
		obj.selectByValue(value);
	}
	
	public void select(String text,WebElement element) {
		Select obj=new Select(element);
		obj.selectByVisibleText(text);
	}
}
