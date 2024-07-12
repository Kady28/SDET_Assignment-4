package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rahulshetty {

WebDriver driver;

	
	@BeforeTest(enabled = true)
	public void bt() throws InterruptedException {
     
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		Thread.sleep(4000);



	        try {
	            // Navigate to the main page with iframes
	            //driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	            // Switch to the first iframe (index 0)
	            driver.switchTo().frame(0);

	            // Find and click the button inside the first iframe
	            WebElement button = driver.findElement(By.xpath("//input[@value='radio1']"));
	            button.click();

	            // Switch back to the default content (main page)
	            driver.switchTo().defaultContent();

	            // Click on the back button on the main page
//	            WebElement backButton = driver.findElement(By.id("backButton"));
//	            backButton.click();
	            
	            driver.navigate().back();

	        } finally {
	            // Close the browser session
	            driver.quit();
	        }
	    }
}
