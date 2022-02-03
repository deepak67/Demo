package Regression.FreshiiProject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.Homepage;
import pageobject.Landingpage;
import pageobject.Loginpage;
import resource.Base;

public class FWA_019 extends Base {
	
	@BeforeTest
	public void Initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider="getdata", priority=1)
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
	 
	@Test(priority=2)
	public void clksignout()
	{
		Homepage hm= new Homepage(driver);
		hm.clkdropdown().click();
		hm.clksignout().click();
	}
	
	@AfterTest
    public void teardown()
	{
		driver.close();
	}
}

