package Safwan.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class newpage {
	public static void main(String[] args) {
		// ✅ Correct system property key
		System.setProperty("WebDriver.Chrome.driver",
				"D:\\Browser Drivers\\Chrome Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("✅ Browser opened");

		// Open the website
		driver.get("https://automationteststore.com/index.php?rt=account/login");
		String originalWindow = driver.getWindowHandle();

		// Perform login
		driver.findElement(By.id("loginFrm_loginname")).sendKeys("Safwan123");
		driver.findElement(By.id("loginFrm_password")).sendKeys("pbdev@123");
		driver.findElement(By.xpath("//button[@title='Login']")).click();

		WebDriver newWindow = driver.switchTo().newWindow(WindowType.TAB);
		newWindow.get("https://automationteststore.com/index.php?rt=product/category&path=68_69");

		List<WebElement> addtoCarts = driver.findElements(By.cssSelector("a.productcart"));
		System.out.println("Found " + addtoCarts.size() + " products on the page.");

		for (int i = 0; i < addtoCarts.size(); i++)
		{
			try {
			List<WebElement> refreshedLinks = driver.findElements(By.cssSelector("a.productcart"));
			String productName = refreshedLinks.get(i).getText();
			System.out.println("➡️ Opening product: " + productName);
			refreshedLinks.get(i).click();
			
			List<WebElement> sizeDropdown = driver.findElements(By.name("option[227]"));
            if (!sizeDropdown.isEmpty()) 
            {
                WebElement dropdown = sizeDropdown.get(0);
                dropdown.findElement(By.xpath(".//option[2]")).click(); // Choose second option (index starts at 1)
                System.out.println("🧦 Size selected.");			
			}
			
            WebElement addToCartBtn = driver.findElement(By.cssSelector("a.cart"));
            addToCartBtn.click();
            System.out.println("🛒 Added to cart!");

            Thread.sleep(1500); // Wait for UI to update

            driver.navigate().back(); // Go back to product list
            Thread.sleep(1000);
            
			}
			catch (Exception e) {
                System.out.println("❌ Failed on product #" + (i + 1));
                e.printStackTrace();
                driver.navigate().back();
			
		}
		
		System.out.println("✅ All products added to cart.");
        //driver.quit();

		//driver.switchTo().window(originalWindow);

	}
}
}