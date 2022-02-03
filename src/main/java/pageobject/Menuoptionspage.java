package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Menuoptionspage {
	
	
	public  WebDriver driver;
	
	// Locate the beverages with its unique ID
	By beverages= By.id("category-btn-67998");
	
	// Locate the juices with its unique ID
	By juices= By.id("category-btn-67999");
	
	//Locate the frozenYogurt with its unique ID
	By frozenyogurt=By.id("category-btn-67997");
	
	// Locate the particular bev drink to add it to cart
	By choosebevdrink = By.xpath("//span[text()='Nitro Cold Brew Coffee with Oat Miilk']");
	
	//Locate the particular juice drink to add it to cart
	By choosejuicedrink=By.xpath("//span[text()='Green Genius Juice']");
	
	//Locate the FrozenYogurt 
	By choosefrozenyogurt= By.xpath("//span[text()='Frozen Yogurt']");
			
public Menuoptionspage(WebDriver driver)
{
	this.driver=driver;
	
}

public WebElement clickbeverages()
{

	WebElement element = driver.findElement(beverages);
	if (element.isDisplayed() && element.isEnabled()) {
	    element.click();
	}
return element;
}

public WebElement getbevdrink()
{
	WebElement element= driver.findElement(choosebevdrink);
	if(element.isDisplayed()&& element.isEnabled()) {
		element.click();
	}
	return element;
}

public WebElement clickjuices()
{

	WebElement element = driver.findElement(juices);
	if (element.isDisplayed() && element.isEnabled()) {
	    element.click();
	}
return element;
}

public WebElement getjuicedrink()
{
	WebElement element= driver.findElement(choosejuicedrink);
	if(element.isDisplayed()&& element.isEnabled()) {
		element.click();
	}
	return element;
}

public WebElement clkfrozenyogurt()
{
	WebElement element= driver.findElement(frozenyogurt);
	if(element.isDisplayed()&& element.isEnabled()) {
		element.click();
	}
	return element;
	
}
public WebElement getfrozenyogurt()
{
	WebElement element= driver.findElement(choosefrozenyogurt);
	if(element.isDisplayed()&& element.isEnabled()) {
		element.click();
	}
	return element;

}}
