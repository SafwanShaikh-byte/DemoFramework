package Safwan.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import safwan.pageobjects.LandingPage;

import java.util.List;

public class Shoes {
	public static void main(String[] args) {
		// ✅ Correct system property key
		System.setProperty("WebDriver.Chrome.driver",
				"D:\\Browser Drivers\\Chrome Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("✅ Browser opened");

		// Open the website
		driver.get("https://automationteststore.com/index.php?rt=account/login");
		
		// Perform login
		driver.findElement(By.id("loginFrm_loginname")).sendKeys("Safwan123");
		driver.findElement(By.id("loginFrm_password")).sendKeys("pbdev@123");
		driver.findElement(By.xpath("//button[@title='Login']")).click();

		driver.get("https://automationteststore.com/index.php?rt=product/category&path=68_69");

		List<WebElement> addtoCarts = driver.findElements(By.cssSelector("a.productcart"));
		System.out.println("Found " + addtoCarts.size() + " products on the page.");

		WebElement product1 = driver.findElement(By.xpath("(//a[@class='prdocutname'])[1]"));
		String productname = product1.getText();
		product1.click();
		driver.findElement(By.id("option344747")).click();
		driver.findElement(By.cssSelector(".cart")).click();
		
				
		WebElement selectCountry = driver.findElement(By.xpath("//select[@id='estimate_country']"));
		selectCountry.sendKeys("India");
		selectCountry.click();
		
		WebElement selectState = driver.findElement(By.xpath("//select[@id='estimate_country_zones']"));
		selectState.sendKeys("Bihar");
		selectState.click();
		
		driver.findElement(By.xpath("//input[@id='estimate_postcode']")).sendKeys("380055");
		driver.findElement(By.xpath("(//a[@id='cart_checkout2'])[1]")).click();
		driver.findElement(By.id("checkout_btn")).click();
		
		System.out.println("Product 1 : " + productname + " added into the cart");
		
		
				
        //driver.quit();

		//driver.switchTo().window(originalWindow);

	}
}
