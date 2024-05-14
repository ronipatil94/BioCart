package genaric;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;


public class Verification 
{
	private static WebDriver driver;
	
	protected Verification(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public static void verifyAllTitles(String expectedtitle)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.titleIs(expectedtitle));
			Reporter.log("Title is matchin Test case passed.");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			// screen shot code. 
			Reporter.log("Title not matching");
			
			
		}
	}

}
