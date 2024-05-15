package genaric;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class OpenClose_Apllication implements Constants {

	public static WebDriver driver; // global variable .

	@BeforeMethod
	public static void openApplication() {
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // minimize(), refresh()
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(urlofapplication);
	}

	@AfterMethod
	public static void closeApplication() {
		driver.quit();
	}
}
