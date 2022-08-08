package testClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomClasses.LoginPOMsoucedemo;

public class VerifyLoginFunctionTestClss {

	
		@Test
	   public void verifylogin()
	  {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
	
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
				
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is opened");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//login Activity
		LoginPOMsoucedemo lp=new LoginPOMsoucedemo(driver);
		lp.sendusername();
		System.out.println("username Entered");
		
		lp.sendpassword();
		System.out.println("password entered");
		
		lp.clickloginbutton();
		System.out.println("click on login button");
		
		//home page 
		//validation
		String expectedTitle="Swag Labs";//given
		String actualTitle = driver.getTitle();  //actual
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("test case is pass");
		}
		else
		{
			System.out.println("test case is fail");
		}
		
		driver.quit();
		System.out.println("browser closed");
		
		
		
	}

}
