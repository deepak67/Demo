package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

	public WebDriver driver;
	
	//Locating ordernow button
	By ordernowbutton=By.xpath("//div[@class='wo-order-now-btn']");
	
	//Select dropdown to choose different sub categories
	By dropdown= By.xpath("//span[text()='Hi, deepak']");
	
	// Select Myacct sub category from list
	By Myacct= By.xpath("//img[contains(@src,'/assets/icons/freshii/profile.svg')]");
	
	//Select Payment sub category from list
	By payment= By.xpath("//img[contains(@src, '/assets/icons/freshii/payment.svg')]");
	
	// Select History sub category from list
	By history= By.xpath("//span[text()='My History']");
	
	// Select signout
	By signout= By.xpath("//span[text()='Sign Out']");
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public WebElement ordernow()
	{
		return driver.findElement(ordernowbutton);
	}
	
	public WebElement clkdropdown()
	{
		return driver.findElement(dropdown);
	}
	
	public WebElement clkMyacct()
	{
		return driver.findElement(Myacct);
		
	}
	
	public WebElement clkpaymentmethod()
	{
		return driver.findElement(payment);
		
	}
	
	public WebElement clkmyhistory()
	{
		return driver.findElement(history);
		
	}
	
	public WebElement clksignout()
	{
		return driver.findElement(signout);
	}
	
}
