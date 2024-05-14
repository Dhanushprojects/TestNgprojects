package org.TestngPrograms;

import org.BaseClass.HelperClass;
import org.testng.Assert;
import org.testng.annotations.Test;



public class ListenersHandle extends HelperClass{
	
	@Test(retryAnalyzer=Failed.class)
	public void Tc1() {
		ChromeBrowser();
		Maximize();
		GetUrl("https://seleniumbase.io/demo_page");
	}
	
	@Test(retryAnalyzer=Failed.class)
	public void Tc2() {
		
		ChromeBrowser();
		Maximize();
		GetUrl("https://www.globalsqa.com/demo-site/");
		Assert.assertTrue(false);
		
	}
	
	
	
	

}
