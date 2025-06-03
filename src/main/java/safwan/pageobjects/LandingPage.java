package safwan.pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import safwan.Abstractcomponents.Abstractcomponent;

public class LandingPage extends Abstractcomponent{

	// TODO Auto-generated method stub

	WebDriver driver;

	public LandingPage(WebDriver driver) {
		// Driver Initialization using init Element
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "loginFrm_loginname")
	WebElement username;

	@FindBy(id = "loginFrm_password")
	WebElement passwordele;

	@FindBy(xpath = "//button[@title='Login']")
	WebElement submit;
	
	@FindBy(xpath = "//div[@class='alert alert-error alert-danger']")
	WebElement errormessage;
	
	public String errormessag()
	{
		waitForElementToAppear(errormessage);
		return errormessage.getText();
	}

	public void loginApplication(String email, String password) {
		username.sendKeys(email);
		passwordele.sendKeys(password);
		submit.click();
	}

	public void goTo()

	{
		driver.get("https://automationteststore.com/index.php?rt=account/login");
	}

	public void shoecat() 
	{
		driver.get("https://automationteststore.com/index.php?rt=product/category&path=68_69");
	}

}
