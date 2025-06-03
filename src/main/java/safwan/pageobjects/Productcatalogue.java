package safwan.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import safwan.Abstractcomponents.Abstractcomponent;

public class Productcatalogue extends Abstractcomponent {

	// TODO Auto-generated method stub

	WebDriver driver;

	public Productcatalogue(WebDriver driver) {
		// Driver Initialization using init Element
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//List<WebElement> addtoCarts = driver.findElements(By.cssSelector("a.productcart"));
	
	@FindBy(css = "a.productcart")
	List<WebElement> products;

	By productsBy = By.cssSelector("a.productcart");
	
	
	
		
}
