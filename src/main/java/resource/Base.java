package resource;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
 
public WebDriver driver;
public Properties prop;
 
public WebDriver initializeDriver() throws IOException {
	
	//WebDriver driver = new ChromeDriver()
		
		 prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\dpdee\\eclipse-workspace\\FreshiiProject\\src\\main\\java\\resource\\data.properties");
		prop.load(fis);
	String browsername = prop.getProperty("browser");
	System.out.println(browsername);
	if (browsername.equals("Google Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\java\\resource\\chromedriver.exe");
		// System.setProperty("wedbdriver.chrome.driver","C:\\Users\\dpdee\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	else if(browsername.equals("firefox"))
	{
		//System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir")+ 
				 driver = new FirefoxDriver();
	}
	
	else if(browsername.equals("iE"))
	{
		//System.setProperty("webdriver.internetexplorer.driver", System.getProperty("user.dir")+
			 driver = new InternetExplorerDriver();
	}
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	
}		
}


