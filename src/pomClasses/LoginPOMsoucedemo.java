package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMsoucedemo 
{
	//Web driver declaration
	WebDriver driver;   //global
	
	//find element ,Element action an method create
	
	@FindBy (xpath="//input[@id='user-name']")
	private WebElement username;
	
	public void sendusername()
	{
		username.sendKeys("standard_user");
	}
	
	@FindBy (xpath="//input[@id='password']")
	private WebElement password;
	
	public void sendpassword() 
	{
		password.sendKeys("secret_sauce");
	}
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginbutton;
	
	public void clickloginbutton()
	{
		loginbutton.click();
	}
	
	//constructor of a class
	//local
	public LoginPOMsoucedemo (WebDriver driver)
	{
	    this.driver = driver;
		
		PageFactory.initElements(driver, this);

	}
	
	
	
	
}
