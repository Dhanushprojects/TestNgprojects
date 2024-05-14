package org.TestngPrograms;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.BaseClass.HelperClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter extends HelperClass {
	
	
	@Parameters("test")
	@Test
	public void test(String s) throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ChromeBrowser();
		Maximize();
		GetUrl("https://www.udacity.com/");
	
			//Thread.sleep(5000);
	WebElement accept = driver.findElement(By.
			xpath("//input[@placeholder='What do you want to learn?']"));
			accept.click();
		accept.sendKeys(s);
	}
	
	

}
