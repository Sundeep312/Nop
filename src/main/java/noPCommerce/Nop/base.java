package noPCommerce.Nop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	
	public WebDriver driver;
	public Properties prop;
	
	
	public WebDriver intilaiseBrowser() throws IOException {
		
	 prop=new Properties();
	 
	 FileInputStream fis=new FileInputStream(System.getProperty("user.dir") + "/src/main/java/resources/Data.Properties");
	 
	 prop.load(fis);
	 
	String browserName= prop.getProperty("Browser");
	
	System.out.println(browserName);
	
	if(browserName.equalsIgnoreCase("Chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/sundeeppamulapati/Documents/Eclipse-Auto/chromedriver");
		
		driver=new ChromeDriver();
		
	}
	
	else if(browserName.equalsIgnoreCase("fireFox")) {

		System.setProperty("webdriver.gecko.driver", "/Users/sundeeppamulapati/Documents/Eclipse-Auto/geckodriver");
		
		driver=new FirefoxDriver();
		
		
	}
	 
	
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 
	 return driver;
		
		
		
	}

}
