package Safwan.Tests;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		WebDriver driver;
		System.setProperty("WebDriver.Chrome.driver","D:\\Browser Drivers\\Chrome Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser opened");
		
		//Homepage
		driver.get("https://automationteststore.com/index.php?rt=account/login");
		
		//Registration Form
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		driver.findElement(By.id("AccountFrm_firstname")).sendKeys("Safwan");
		driver.findElement(By.id("AccountFrm_lastname")).sendKeys("Shaikh");
		driver.findElement(By.id("AccountFrm_email")).sendKeys("Shaikh.safwan35@gmail.com");
		driver.findElement(By.id("AccountFrm_telephone")).sendKeys("7778880120");
		driver.findElement(By.id("AccountFrm_fax")).sendKeys("25501181");
		driver.findElement(By.id("AccountFrm_company")).sendKeys("XYZ Private Solutions Pvt Ltd");
		driver.findElement(By.id("AccountFrm_address_1")).sendKeys("Makarba");
		driver.findElement(By.id("AccountFrm_address_2")).sendKeys("Ahmedabad");
		driver.findElement(By.id("AccountFrm_city")).sendKeys("Ahmedabad");
		
		WebElement Country = driver.findElement(By.id("AccountFrm_country_id"));
	    Country.sendKeys("India");
		
		WebDriverWait wait1 = new WebDriverWait (driver,Duration.ofSeconds(10));
		List<WebElement> suggestions1 = wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("AccountFrm_country_id")));
		
		for (WebElement option1 : suggestions1) {
		    if (option1.getText().equalsIgnoreCase("India")) 
		    {
		    	option1.click();
		        break;
		    }
		}
		
		WebElement Region = driver.findElement(By.id("AccountFrm_zone_id"));
		Region.sendKeys("Gujarat");
		
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(10));
		List<WebElement> suggestions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("AccountFrm_zone_id")));
		
		for (WebElement option : suggestions) {
		    if (option.getText().equalsIgnoreCase("Gujarat")) {
		        option.click();
		        break;
		    }
		}
		    driver.findElement(By.id("AccountFrm_postcode")).sendKeys("380001");
		   		    
		    
		    
			driver.findElement(By.id("AccountFrm_loginname")).sendKeys("Safwan123");
			driver.findElement(By.id("AccountFrm_password")).sendKeys("pbdev@123");
			driver.findElement(By.id("AccountFrm_confirm")).sendKeys("pbdev@123");
			
			driver.findElement(By.id("AccountFrm_newsletter1")).click();
			driver.findElement(By.id("AccountFrm_agree")).click();
			driver.findElement(By.cssSelector("button[title='Continue']")).click();
			
			
			
	}

	}

