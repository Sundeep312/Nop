package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageobject {

	
	
	
	
	
	public WebDriver driver ;
	
	
	public RegisterPageobject(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="FirstName")
	WebElement FirstName;
	
	
	@FindBy(id="LastName")
	WebElement LastName;
	
	@FindBy(id="Email")
	WebElement Email;
	
	@FindBy(id="ConfirmEmail")
	WebElement ConfirmEmail;
	
	@FindBy(id="Username")
	WebElement UserName;
	
	@FindBy(id="check-availability-button")
	WebElement AvailaBility;
	
	
	

	public WebElement FirstName() {
		
		return FirstName;
	}
	
public WebElement LastName() {
		
		return LastName;
	}

public WebElement Email() {
	
	return Email;
}

public WebElement ConfirmEmail() {
	
	return ConfirmEmail;
}

public WebElement UserName() {
	
	return UserName;
}
	
public WebElement AvailaBility() {
	
	return AvailaBility;
}

	
	
	
}
