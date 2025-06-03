package safwan.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import safwan.Abstractcomponents.Abstractcomponent;

public class Orderpage extends Abstractcomponent {

	WebDriver driver;
	
	@FindBy(xpath="(//i[@class='fa fa-cart-plus fa-fw'])[1]")
	WebElement prodadd;
	
	@FindBy(id="option344747")
	WebElement size;
	
	@FindBy(css=".cart")
	WebElement addtocart;
	
	
	public Orderpage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void Produadd()
	{
	prodadd.click();
	String product1 = prodadd.getText();
	size.click();
	addtocart.click();
	}
	
}
