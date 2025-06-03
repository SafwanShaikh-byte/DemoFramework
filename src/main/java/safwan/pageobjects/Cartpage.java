package safwan.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import safwan.Abstractcomponents.Abstractcomponent;

public class Cartpage extends Abstractcomponent{

	WebDriver driver;
	
	public Cartpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy (xpath="//select[@id='estimate_country']")
	WebElement selectCountry;
	
	@FindBy (xpath="//select[@id='estimate_country_zones']")
	WebElement selectState;
	
	@FindBy (xpath="//input[@id='estimate_postcode']")
	WebElement pincode;
	
	@FindBy (xpath="(//a[@id='cart_checkout2'])[1]")
	WebElement checkout;
	
	@FindBy (id ="checkout_btn")
	WebElement submit;
	
	
	
	public void cartpage ()
	{
		selectCountry.sendKeys("India");
		selectCountry.click();
		
		selectState.sendKeys("Bihar");
		selectState.click();
		
		pincode.sendKeys("380055");
		checkout.click();
		submit.click();
		
	}
}
