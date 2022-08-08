package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPOMclass 
{
	//POM Class
//	1.WebDriver declare
//	2.WebElement inspect -->@FindBy
//	3.WebElement action-->method-->encapsulation
//	4.Class constructor-->WebDriver driver arg;
	
	WebDriver driver;
	
	//settingButton
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement settingButton;
	
	public void clickSettingButton()
	{
		settingButton.click();
	}
	
	//logOut button
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logOutButton;
	
	public void clickLogOutButton()
	{
		logOutButton.click();
	}
	
	//constructor of a class
		//local
		public LogoutPOMclass  (WebDriver driver)
		{
		    this.driver = driver;
			
			PageFactory.initElements(driver, this);

		}

}
