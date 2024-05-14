package org.TestngPrograms;

import org.BaseClass.FacebookPojo;
import org.BaseClass.HelperClass;
import org.testng.annotations.Test;

public class DataProvider extends HelperClass
{
	
	
	
	
@org.testng.annotations.DataProvider(name="data")	
private Object[][] Datas() {
	
	return new Object[][] {
		
		{"value","f£5667"},
		{"java","g@4567"},
		{"selenium","q$%^&"}
		
		
		
	};
	
	
	
}
	
	
	
    @Test(dataProvider="data")
	public void login(String u,String p) {
		ChromeBrowser();
		GetUrl("https://www.facebook.com/");
		FacebookPojo f = new FacebookPojo();
		f.getUsername().sendKeys(u);
	    f.getPassword().sendKeys(p);
	    f.getLogin().click();
		
	}
	
	
	
	
	

}
