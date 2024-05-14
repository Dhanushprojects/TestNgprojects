package org.TestngPrograms;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class BaseClass {
    
 public static WebDriver driver;
	
	
	public  static void ChromeBrowser() {
		 driver = new ChromeDriver();
		
	}

	public  static void GetUrl(String url) {
		driver.get(url);
	}
	  
	   
	  
}
