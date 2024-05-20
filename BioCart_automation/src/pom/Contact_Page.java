package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genaric.Verification;

public class Contact_Page extends Verification {

	public static WebDriver driver;

	// find all the web
	@FindBy(xpath = "")
	private static WebElement loginBtn;

	@FindBy(xpath = "")
	private static WebElement usernameField;

	// initialize all the elements, using the constructor of this class.
	// (Constructor injection)

	Contact_Page() {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	// actions on the webelements

	public static void clickonLoginButton() {
		loginBtn.click();
	}

	public static void enterUsername() {
		usernameField.sendKeys("ecoders");
	}

	public  void verifyContactPageTitle(String exceptedtitle) throws IOException {
		verifyAllTitles(exceptedtitle);
	}

}
