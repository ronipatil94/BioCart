package scripts.homepage_scenarios;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;
import genaric.ExcelDataClass;
import genaric.OpenClose_Apllication;
import pom.Home_Page;
import pom.Service_page;

public class OpenHomepage extends OpenClose_Apllication {
//	public static WebDriver driver;
//	public   WebDriver driver;

	@Test(priority = 1)
	public void openhomepage() throws IOException {

		
			// open the brower, tand enter the url .
//			get title of the page. (actual title )

			// driver.getTitle();
//			expected title 
//			get tht title fromthe excel Sheet.

			String expected_title = (String) ExcelDataClass.getData("Sheet1", 0, 0);
			Reporter.log(expected_title);
			// verify the title.

			Home_Page hp = new Home_Page(driver);

			hp.verifyHomepageTitle(expected_title);
	}
		

	@Test(priority = 2)
	public void clickservicelink() throws IOException {

			Home_Page hp = new Home_Page(driver);
			
			hp.clickonserviceslink();
			
			String expected_title= (String) ExcelDataClass.getData("Sheet1" , 0, 0);
			
			Service_page sp =new Service_page(driver);
			sp.verifyservicepageTitle(expected_title);
			
		
		

	}
}
