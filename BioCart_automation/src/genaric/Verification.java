package genaric;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Verification {
	public  WebDriver driver;

	protected Verification(WebDriver driver) {
		this.driver = driver;
	}

	public  void verifyAllTitles(Object expected_title) throws IOException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.titleIs((String) expected_title));
			Reporter.log("Title is matchin Test case passed.");
		} catch (Exception ex) {
			
			ex.printStackTrace();
			Date d = new Date();
			d.toString().replaceAll(":", "-");
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			File tem_mem = ts.getScreenshotAs(OutputType.FILE);
			File pamt_mem = new File("./Screenshots/"+driver.getTitle()+" "+d+".png");
			FileHandler.copy(tem_mem, pamt_mem);
			Reporter.log("Title not matching");

		}
	}

}
