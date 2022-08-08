package pomClasses;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MultipleproductaddtocartPOMclass 
{
	
	//Webdriver declare
	WebDriver driver;
	
	//find elements ,action method clear
	@FindBy(xpath="//button[ @id='add-to-cart-sauce-labs-backpack']")
	private List<WebElement> allProducts;
	 public void allproductadtocart()
	 {
		 for(int i=0; i<allProducts.size();i++)
		{
					allProducts.get(i).click();
		}
		
	 }
	  public MultipleproductaddtocartPOMclass (WebDriver driver)
		{
		    this.driver = driver;
			
			PageFactory.initElements(driver, this);

		}
	
	
}
