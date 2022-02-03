package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class chooselocation {
	
	
	public WebDriver driver;
	
	// Find the locations which are online 
	By findonlinelocation =By.xpath("//button[contains(text(),'Online']");
	
	// Choose the location to pickup order
	By locationchoose= By.xpath("//div[@class='wo-actions-wrap ng-star-inserted']");

	public chooselocation(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public WebElement pickuplocation()
	{
		return driver.findElement(locationchoose);
	}
	
	public WebElement findonlinelocations()
	{
		return driver.findElement(findonlinelocation);
	}
}
