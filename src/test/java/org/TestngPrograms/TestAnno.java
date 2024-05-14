package org.TestngPrograms;


import java.time.Duration;

import org.BaseClass.HelperClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestAnno extends HelperClass {
	
	
	
	@Test
	public void tc1() {
		
		ChromeBrowser();
		GetUrl("https://au.boohoo.com/");
		Maximize();
	}

	@Test
	public void tc2() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		
	}
	@Test(invocationCount=3 )
	public void Ac4() {
	ChromeBrowser();
	GetUrl("https://www.udacity.com/");
		
	}
	
	
	
}
