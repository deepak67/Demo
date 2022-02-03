package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {

	
	public WebDriver driver;
	 
	// Select login button to enter user credentials.
	By Login = By.xpath("//img[@alt='Account Icon']");	
	
	//constructor
	public Landingpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebElement getlogin()
	{
		return driver.findElement(Login);
	}
	
	
}
