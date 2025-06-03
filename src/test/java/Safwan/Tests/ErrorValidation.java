package Safwan.Tests;

import org.testng.annotations.Test;

import Safwan.Testcomponents.BaseTest;
import safwan.pageobjects.LandingPage;

import java.io.IOException;

public class ErrorValidation extends BaseTest {
	
	@Test(groups = {"ErrorHandling"})
	public void negative() throws IOException
	{
		LandingPage landingpage = new LandingPage(driver);
		landingpage.loginApplication("Sawan123", "pbdev@123");
	}
	
	@Test
	public void submitOrder() throws IOException {

		// Open the Landing Page
				
		LandingPage landingPage = launchapp(); 
		landingPage.errormessag();
		System.out.println("Warning Message :");
				
		}
}
