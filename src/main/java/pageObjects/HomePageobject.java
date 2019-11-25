package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageobject {

	
	
	
	
	
	public WebDriver driver ;
	
	
	public HomePageobject(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//a[@class='desktop-logo']//img")
	WebElement logo;
	
	
	@FindBy(xpath="//h1[contains(text(),'Free and open-source eCommerce platform')]")
	WebElement homePagetext;
	
	@FindBy(css="span[class='ico-user sprite-image']")
	WebElement option;
	
	@FindBy(xpath="//a[@class='ico-register']")
	WebElement register;
	

	public WebElement logo() {
		
		return logo;
	}
	
public WebElement pageText() {
		
		return homePagetext;
	}

public WebElement option() {
	
	return option;
}

public WebElement register() {
	
	return register;
}


	
	
	
	
}
