package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genaric.Verification;

public class Home_Page extends Verification 
{

	public static WebDriver driver;

	
	// find all the web
	@FindBy(xpath="")
	private static WebElement loginBtn;
	
	@FindBy(xpath="")
	private static WebElement usernameField;
	
	
	
	// initialize all the elements, using the constructor of this class. (Constructor injection)
	
	 Home_Page()
	 {
		 super(driver);
		 PageFactory.initElements(driver, this);
	 }
	
	// actions on the webewlements
	
	public static void clickonLoginButton()
	{
		loginBtn.click();
	}
	
	
	public static void enterUsername(String username)
	{
		usernameField.sendKeys(username);
	}
	
	public static void verifyHomepageTitle(String exceptedtitle)
	{
		verifyAllTitles(exceptedtitle);
	}
}
