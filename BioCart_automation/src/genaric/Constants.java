package genaric;

import java.io.File;

public interface Constants {

	String rootDirectory = System.getProperty("user.dir");
    String excelSheetName = "biokart_data.xlsx";
    String excelSheetPath = rootDirectory + File.separator + excelSheetName;
	String excel_path = excelSheetPath;
	
	String chrome_key ="webdriver.chrome.driver";
	String chromedrivername = "chromedriver.exe";
    String chromepath = rootDirectory + File.separator + excelSheetName;
    
    String chrome_value = chromepath;
    
    
    String urlofapplication ="https://www.biokart.com";
    
	
}
