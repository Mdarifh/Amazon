package Amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSimpleAutomation {

	public static void main(String[] args) {
		
		// Setup ChromeDriver using WebDriverManager
				WebDriverManager.chromedriver().setup();
				
				// Initialize the ChromeDriver instance
				WebDriver driver = new ChromeDriver();
				
				 // Open Amazon India
				driver.get("https://www.amazon.in");
				
				// Set the browser window to maximize
		        driver.manage().window().maximize();
		        
		       
		            // Open Amazon India
		            driver.get("https://www.amazon.in/");
		            driver.manage().window().maximize();

		            // Implicit Wait
		            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Wrist Watches");
		            driver.findElement(By.id("nav-search-submit-button")).click();

		            // Step 2: Filter by "Leather" under Watch Band Material
		            driver.findElement(By.xpath("//span[text()='Leather']")).click();

		            // Step 3: Filter by "Fastrack" brand
		            driver.findElement(By.xpath("//span[text()='Fastrack']")).click();

		            // Step 4: Navigate to the 2nd page of search results
		            driver.findElement(By.xpath("//a[text()='2']")).click();
		            System.out.println("Product successfully added to the cart!");

		            // Step 5: Add the 1st product in the 1st row to the cart
		            WebElement firstProduct = driver.findElement(By.xpath("(//div[@data-component-type='s-search-result'])[1]"));
		            firstProduct.findElement(By.xpath(".//input[@aria-label='Add to Cart']")).click();

		            System.out.println("Product successfully added to the cart!");

		            // Close the browser
		            driver.quit();

	}

}
