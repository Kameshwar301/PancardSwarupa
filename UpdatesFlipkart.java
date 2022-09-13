package practice.da1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdatesFlipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement loginPage = driver.findElementByXPath("//span[text()='Login']");
		//Username
		driver.findElementByXPath("//input[@class='_2IX_2- VJZDxU']").sendKeys("9976171372");
		//password
		driver.findElementByXPath("//input[@type='password']").sendKeys("Kamesh@301");
		//to click login
		driver.findElementByXPath("(//span[text()='Login'])[2]").click();
		Thread.sleep(2000);
		WebElement account = driver.findElementByXPath("//div[text()='My Account']");
		
		Actions builder = new Actions(driver);
		builder.moveToElement(account).perform();
		
		WebElement wish = driver.findElementByXPath("//div[text()='Wishlist']");
		builder.moveToElement(wish).click().perform();
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[@class='NS64GK'])[3]").click();

	}

}
