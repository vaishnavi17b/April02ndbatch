package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BagproductAddtocartPOM 
{
	//webdriver Declare
	 WebDriver driver;
	 
	 //find elements elemennt action method create
	 @FindBy(xpath="(//button[text()='Add to cart'])[1]")
		 private WebElement bagbutton;
	 public void bagproduct()
	 {
		 bagbutton.click();
	 }
	 
	 //cart option
	 @FindBy(xpath="//a[@class='shopping_cart_link']")
	 private WebElement cartoption;
	 public String gettextfromcartbutton()
	 {
		 String totalproduct=cartoption.getText();
		 return  totalproduct;
	 }
	 
	  public BagproductAddtocartPOM( WebDriver driver)
	  {
		  this.driver = driver;
			
			PageFactory.initElements(driver, this);

	  }
}
