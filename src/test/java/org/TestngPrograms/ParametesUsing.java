package org.TestngPrograms;

import org.BaseClass.FacebookPojo;
import org.BaseClass.HelperClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametesUsing extends HelperClass{
	
	@Test(priority=1)
	public void launchbrowser() {
		ChromeBrowser();
		GetUrl("https://www.facebook.com/");
		
	}
	@Parameters({"uname","pass"})
	@Test(priority=2)
	public void login(String u,String p) {
		FacebookPojo f = new FacebookPojo();
		f.getUsername().sendKeys(u);
	    f.getPassword().sendKeys(p);
	    f.getLogin().click();
	
		System.out.println("pass");
	}
	
	
	

}
