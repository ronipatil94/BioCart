package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import genaric.Verification;

public class Home_Page extends Verification {

	public   WebDriver driver;

	// find all the web
	@FindBy(xpath = "//a[text()='Home']")
	private   WebElement homelink;

	@FindBy(xpath = "//a[@class='custom-logo-link']")
	private   WebElement companylogo;

	@FindBy(xpath = "a[text()='About']")
	private   WebElement aboutlink;

	@FindBy(xpath = "//a[text()='Services']")
	private   WebElement serviceslink;

	@FindBy(xpath = "//a[text()='Contact']")
	private   WebElement contactlink;

	@FindBy(xpath = "//a[text()='Payment Policy']")
	private   WebElement paymentPolicylink;

	@FindBy(xpath = "//span[text()='Sanger Based Services']")
	private   WebElement Sanger_Based_ServicesButton;

	@FindBy(xpath = "//span[text()='NGS Based  Services']")
	private   WebElement NGS_Based_ServicesButton;

	@FindBy(xpath = "//span[text()='Bioinformatics Services']")
	private   WebElement Bioinformatics_ServicesButton;

	@FindBy(xpath = "//span[text()='Products & Services']")
	private   WebElement Products_and_ServicesButton;

	// initialize all the elements, using the constructor of this class.
	// (Constructor injection)

	public Home_Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	// actions on the webewlements

	public   void clickonhomelink() {
		homelink.click();
	}

	public   void clickonCompanyLogo() {
		companylogo.click();

	}

	public   void clickonaboutlink() {
		aboutlink.click();
	}

	public   void clickonserviceslink() {
		serviceslink.click();
	}

	public   void clickonContactlink() {
		contactlink.click();
	}

	public   void clickonpaymentPolicylink() {
		paymentPolicylink.click();
	}

	public   void clickonSanger_Based_ServicesButton() {
		Sanger_Based_ServicesButton.click();
	}

	public   void clickonNGS_Based_ServicesButton() {
		NGS_Based_ServicesButton.click();
	}

	public   void clickonBioinformatics_ServicesButton() {
		Bioinformatics_ServicesButton.click();
	}

	public   void clickonProducts_and_ServicesButton() {
		Products_and_ServicesButton.click();
	}

	public   void verifyHomepageTitle(Object expected_title) throws IOException {
		verifyAllTitles(expected_title);
	}

	
}
