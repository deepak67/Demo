package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class confirmationpage {

	
private static final String DONE = null;



public  WebDriver driver;
	
	
	// confirm order for beverages 
	By confirmyourorder = By.xpath("//div[@id='wo-final-quantity-special-component']//div[2]//button[contains(text(),'DONE')]");
	
	//locate add to bag button to confirm frozenyogurt order
	By confirmorderforyogurt=By.xpath("//div[@id='wo-customize-freshii-item-component']//div[4]//button[contains(text(),'ADD TO BAG')]");
	
	//Locate and Select checkout 
	By chkout=By.xpath("//button[@class='common-button px-5 mx-2']");
	
	// Select ASAP to pick up the order 
	By asap= By.xpath("//button[@class='mx-2 my-1 common-button-default']");
public confirmationpage(WebDriver driver)
{
	this.driver=driver;
	
}

public WebElement confirmorder()
{
	return driver.findElement(confirmyourorder);
}

public WebElement confirmyogurtorder()
{
	return driver.findElement(confirmorderforyogurt);
}

public WebElement checkout()
{
	return driver.findElement(chkout);
}

public WebElement clkASAP()
{
	return driver.findElement(asap);
}


}