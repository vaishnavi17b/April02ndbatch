package testClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomClasses.LoginPOMsoucedemo;
import pomClasses.LogoutPOMclass;

public class TC02VerfyLogoutTestclass 

{
	
	@Test
	public void verifylogout()
	{
		//Test Steps
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
	
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
				
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is opened");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		//LoginActivity
		//usrname+pass+login--action
		
		LoginPOMsoucedemo lp = new LoginPOMsoucedemo(driver);
		lp.sendusername();
		System.out.println("username is entered");
		
		lp.sendpassword();
		System.out.println("password is entered");
		
		lp.clickloginbutton();
		System.out.println("loginButton is clicked");
		
		//HomePage
		//settingBtn+logOutBtn-->HomePOM
		
		LogoutPOMclass hp = new LogoutPOMclass (driver); 
		hp.clickSettingButton();
		System.out.println("clicked on setting button");
		
		hp.clickLogOutButton();
		System.out.println("clicked on logOut Button");
		
		//login page
		//validation
		String expectedTitle = "Swag Labs";	   //given	
		String actualTitle = driver.getTitle();  //actual
			
			if(expectedTitle.equals(actualTitle))
			{
		        System.out.println("Test case is passed");
			}
			else
			{
				System.out.println("Test case is failed");
			}
			
			
			driver.quit();
			System.out.println("broswer is closed");
	}
}
