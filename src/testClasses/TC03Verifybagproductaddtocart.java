package testClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomClasses.BagproductAddtocartPOM;
import pomClasses.LoginPOMsoucedemo;
import pomClasses.LogoutPOMclass;

public class TC03Verifybagproductaddtocart
{
	
	@Test
	public void verifybagproduct()
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
		
		//LoginActivity
				//usrname+pass+login--action
				
				LoginPOMsoucedemo lp = new LoginPOMsoucedemo(driver);
				lp.sendusername();
				System.out.println("username is entered");
				
				lp.sendpassword();
				System.out.println("password is entered");
				
				lp.clickloginbutton();
				System.out.println("loginButton is clicked");
				
				//bag product
				BagproductAddtocartPOM bp=new BagproductAddtocartPOM(driver);
				bp.bagproduct();
				System.out.println("bagproduct clicked");
				

				String expectedCount = "1";  //given
				String actualCount=bp.gettextfromcartbutton();
				System.out.println("gettextfromcartbutton");
				
				if(expectedCount.equals(actualCount))
				{
					System.out.println("tc is passed");
				}
				else
				{
					System.out.println("tc is failed");
				}
							
							
						
				
		
	}
}
