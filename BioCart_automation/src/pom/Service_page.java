package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import genaric.Verification;

public class Service_page extends Verification{

	
	public Service_page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public   void verifyservicepageTitle(Object expected_title) throws IOException {
		verifyAllTitles(expected_title);
	}
} 
