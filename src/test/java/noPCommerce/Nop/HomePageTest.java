package noPCommerce.Nop;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.HomePageobject;

public class HomePageTest extends base{
	



	@BeforeTest
	public void invokingBrowser() throws IOException {
		
		driver=intilaiseBrowser();
		
		driver.get(prop.getProperty("URL"));
	}
	
	
	@Test(priority=0)
	public void logoTest() {
		
		HomePageobject hp=new HomePageobject (driver);
		
	boolean True =hp.logo().isDisplayed();
	AssertJUnit.assertTrue(True);
		
		
	}
	
	
	@Test(priority=1)
	public void textValidate() {
		
		HomePageobject hp=new HomePageobject (driver);
		
		String actual=hp.pageText().getText();
		
		String required=prop.getProperty("Text");
		
		if (required.equalsIgnoreCase(actual)) {
			
			System.out.println("Text found correctly");
		}
		
		else {
			
			System.out.println("Text found in correctly");
		}
		
	
	}
	
	
	@Test(priority=2)
	public void validateRegister() {
		
		Actions a=new Actions(driver);
		HomePageobject hp=new HomePageobject (driver);
		
		WebElement optionButton=hp.option();
		WebElement register=hp.register();
		
	
		
		a.moveToElement(optionButton).click().build().perform();
        register.click();

		
		String actualUrl=driver.getCurrentUrl();
		String requiredUrl=prop.getProperty("RegisterURL");
		
		AssertJUnit.assertEquals(requiredUrl, actualUrl);
		
		
		
	}
	
	
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
	}
	
	

}
