package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class paymentoptionspage {

	
	public WebDriver driver;
	
	public paymentoptionspage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	// Locate the payment mode 
	By cardtype= By.xpath("//div[@text()='Add Debit/Credit Card ']");
	
	By done= By.xpath("//div[@class='wo-part text-center mt-auto px-4 pb-4 ng-star-inserted']");
	 
	public WebElement choosecardtypebtn()
	{
		return driver.findElement(cardtype);
		
		}
	
	public WebElement clkDonebtn()
	{
		return driver.findElement(done);
	}
}
