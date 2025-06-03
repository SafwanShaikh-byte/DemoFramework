package Safwan.Tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Safwan.Testcomponents.BaseTest;
import safwan.pageobjects.Cartpage;
import safwan.pageobjects.Confirmationpage;
import safwan.pageobjects.LandingPage;
import safwan.pageobjects.Orderpage;
import safwan.pageobjects.Productcatalogue;

public class Submitorder extends BaseTest {
	
	@Test(dataProvider = "getData",groups="Purchase")
	public void submitOrder(HashMap<String,String> input) throws IOException {

		// Open the Landing Page
		
		LandingPage landingPage = launchapp();
		landingPage.loginApplication(input.get("username"),input.get("password"));
		landingPage.shoecat();
	    System.out.println("Land on Show Category Page");
		
		
		//Get the product List
		Productcatalogue productcatalogue = new Productcatalogue(driver);
				
		//Order Page
		Orderpage orderpage = new Orderpage(driver);
		orderpage.Produadd();
		
		//Cart Page
		Cartpage cartpage = new Cartpage(driver);
		cartpage.cartpage();
		
		//Confirmation Message
		Confirmationpage message = new Confirmationpage(driver);
		message.getConfirmationMessage();
		
		//close the browser
		BaseTest basetest = new BaseTest();
		tearDown();
		
		}
	
	//Using Json File collecting data from Json File
	@DataProvider
	public Object[][] getData() throws IOException 
	{

		List<HashMap<String, String>> data = getJsonDataToMap(System.getProperty("user.dir") + "//src//test//java//Safwan//data//Purchaseorder.json");
		return new Object[][] { { data.get(0) }, { data.get(1) } };

	}
	
	//Using Dataprovider	
	 /*@DataProvider
//	  public Object[][] getData()
//	  {
//	    return new Object[][]  {{"Safwan123","pbdev@123"}, {"Sawan123","pbdev@123"} };
//	    
//	  }*/
	
	
	//Using Hashmap
	/*@DataProvider(name = "getData")
	public Object[][] getdata()
	{
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("username", "Safwan123");
		map.put("password", "pbdev@123");
		
		HashMap<String,String> map1 = new HashMap<String,String>();
		map1.put("username", "Sfwan123");
		map1.put("password", "pbdev@123");
		
		return new Object [][] {{map},{map1}};
	}*/
	
	//Using Json File
	
	
	

}

