package org.TestngPrograms;

import org.BaseClass.HelperClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting extends HelperClass{
	
	
	@Parameters("browser")
	@Test
	public void browsers(String brows) {
		
		if(brows.equals("Chrome")) {
			ChromeBrowser();
			GetUrl("https://www.jiocinema.com/");
			
			
		}else if(brows.equals("Edge")) {
			FirefoxBrowser();
			GetUrl("https://www.jiocinema.com/");
		
		}else if(brows.equals("Firefox")) {
			
			MicrosoftBrowser();
			GetUrl("https://www.jiocinema.com/");
			
		}
		Maximize();
		
	}
	}
