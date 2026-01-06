package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productpage {
public productpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[text()='Products']")
private WebElement productbtn;

@FindBy(className=("material-icons"))
private WebElement productcreate;

public WebElement getProductbtn() {
	return productbtn;
}


public WebElement getProductcreate() {
	return productcreate;
}


public WebElement getProductbtn11() {
	return productbtn11;
}


public WebElement getProductId() {
	return productId;
}


public WebElement getProductName() {
	return productName;
}


public WebElement getProductCategory() {
	return productCategory;
}


public WebElement getProductQuantity() {
	return productQuantity;
}


public WebElement getVendorId() {
	return vendorId;
}


public WebElement getPrice() {
	return price;
}


public WebElement getProductbtn1() {
	return productbtn1;
}
@FindBy(xpath="\"//span[text()='Add Product'])")
private WebElement productbtn11 ;


@FindBy(name="productId")
private WebElement productId ;


@FindBy(name="productName")
private WebElement productName ;


@FindBy(name="productCategory")
private WebElement productCategory ;


@FindBy(name="quantity")
private WebElement productQuantity ;


@FindBy(name="vendorId")
private WebElement vendorId ;


@FindBy(name="price")
private WebElement price ;


@FindBy(xpath="//button[@type='submit']")
private WebElement productbtn1 ;


}
