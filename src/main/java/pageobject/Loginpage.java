package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {

	
	
	public WebDriver driver;
	
	//Locate the email input text field to enter email
	By email= By.xpath("//input[@type='email']");
	
	//Locate the password text field to enter password 
	By password= By.xpath("//input[@type='password']");
	
	//Locate the login button to click on it
	By Loginbutton= By.xpath("//button[@class='common-button'][.='login']");
	
	
public Loginpage (WebDriver driver)

{
	this.driver=driver;
	
}
	
	public WebElement getemail()
	{
		return driver.findElement(email);
		
	}


public WebElement getpass()
{
	return driver.findElement(password);
	
}


public WebElement getLoginbutton()
{
	return driver.findElement(Loginbutton);
	
}


}
