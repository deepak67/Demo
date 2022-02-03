package Regression.FreshiiProject;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.Homepage;
import pageobject.Landingpage;
import pageobject.Loginpage;
import resource.Base;

public class FWA_016 extends Base {

	@BeforeTest
	public void Initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider="getdata")
	public void Loginpagenavigation(String email, String passwd) throws IOException
	{
		Landingpage lp =new Landingpage(driver);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		lp.getlogin().click();
		//Thread.sleep(500);
		
	//Loginpage lg = new Loginpage(driver);
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	Loginpage lg = new Loginpage(driver);
	//driver.get("https://uatfreshiiorder.tacitdev.ca/ca/lang/en");
		lg.getemail().sendKeys(email);
lg.getpass().sendKeys(passwd);
		
		lg.getLoginbutton().click();
		
	}

	@DataProvider
	public  static Object[][] getdata()
	{
		Object[][] data= {{"dpdeepakparmar092@gmail.com","Jasmeetdeepak12#"}};
	
				return data;
				}
	
	@Test
	public void vermyacct() throws InterruptedException
	{
		Homepage hp=new Homepage(driver);
		hp.clkdropdown().click();
		Thread.sleep(50);
		hp.clkMyacct().click();
		String title=driver.findElement(By.cssSelector("h4.text-capitalize")).getText();
	//String title=	driver.getTitle();
	//System.out.println(title);
		String expectedtitle="My Account";
      assertEquals(title, expectedtitle);
	}
	
	@AfterTest
	 public void teardown()
	{
		driver.close();
	}
}
	

