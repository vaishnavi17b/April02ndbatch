package testClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.LoginPOMsoucedemo;
import pomClasses.MultipleproductaddtocartPOMclass;

public class TC04verifyallproductAddtocart {

	public static void main(String[] args) 
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
				
				//allproduct addtocart
				MultipleproductaddtocartPOMclass mp = new MultipleproductaddtocartPOMclass (driver);
				mp.allproductadtocart();
				System.out.println("allproduct adtocart");
						
				
				
				
	}

}
