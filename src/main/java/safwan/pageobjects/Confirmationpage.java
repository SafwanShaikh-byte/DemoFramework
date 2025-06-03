package safwan.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import safwan.Abstractcomponents.Abstractcomponent;

public class Confirmationpage extends Abstractcomponent {
	
	WebDriver driver;
	
	public Confirmationpage (WebDriver driver)
	{
		super (driver);
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (xpath = "(//span[@class='maintext'])[1]")
	WebElement confirmmessage;
	
	public String getConfirmationMessage()
	{
		 String confirm = confirmmessage.getText();
		 System.out.println("Confirmation Message : " + confirm );
		 return confirm;
		 
	}

}
