package Safwan.stepDefinition;

import java.io.IOException;

import Safwan.Testcomponents.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import safwan.pageobjects.Cartpage;
import safwan.pageobjects.Confirmationpage;
import safwan.pageobjects.LandingPage;
import safwan.pageobjects.Orderpage;
import safwan.pageobjects.Productcatalogue;

public class stepDefinition extends BaseTest {
	
	public LandingPage landingPage;
	public Productcatalogue productcatalogue;
	public Confirmationpage confirmationPage;
	
	@Given ("I landed on Ecommerce Page")
	public void I_landed_on_Ecommerce_Page() throws IOException 
	{
		landingPage = launchapp();
		// code
	}
	
	@Given("Logged in with username {string} & password {string}")
	public void Logged_in_username_and_password(String username, String password)
	{
		landingPage.loginApplication(username,password);
		landingPage.shoecat();
	    System.out.println("Land on Show Category Page");
		
	}
	
	@When ("I want to add the product in Cart")
	public void I_want_to_add_the_product_in_Cart()
	{
		Orderpage orderpage = new Orderpage(driver);
		orderpage.Produadd();
	}
	
	@When("Checkout the Confirmationpage")
	public void checkout_the_confirmationpage() {
	    Cartpage cartpage = new Cartpage(driver);
	    cartpage.cartpage();
	    System.out.println("Proceeded to confirmation page");
	}

	@Then("{string} is displayed")
	public void is_displayed(String expectedText) {
	    Confirmationpage confirmationPage = new Confirmationpage(driver);
	    String actualText = confirmationPage.getConfirmationMessage();
	    
	    if (!actualText.equalsIgnoreCase(expectedText)) {
	        throw new AssertionError("Expected: " + expectedText + ", but got: " + actualText);
	    }
	    
	    System.out.println("Confirmation message verified: " + actualText);
	}

	   
	

}
