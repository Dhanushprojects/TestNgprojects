package org.TestngPrograms;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Allannotations {
	
	
	@BeforeSuite
	public void Beforesuit() {
		System.out.println("Beforesuit1");
	}
    @BeforeTest
	public void BeforecTest() {
		System.out.println("BeforecTes2");
		
	}
    @org.testng.annotations.BeforeClass
	public void BeforeClass() {
    	System.out.println("BeforeClass3");
		
	}
    @BeforeMethod
	public void BeforeMethods() {
    	System.out.println("BeforeMethods4");
		
	}
    @org.testng.annotations.BeforeGroups
	public void BeforeGroups() {
    	System.out.println("BeforeGroups5");
		
	}
	@org.testng.annotations.Test
	public void  Test() {
		System.out.println("Test6");
		
	}
    @AfterMethod
	public void AfterMathods() {
    	System.out.println("AfterMathod7");
		
	}
    @AfterGroups
    public void AfterGroup() {
    	System.out.println("AfterGroup8");
    }
    @org.testng.annotations.AfterClass
    public void AfterClass() {
    	System.out.println("AfterClass9");
    }
    @org.testng.annotations.AfterTest
    public void AfterTest() {
    	System.out.println("AfterTest10");
    	
    }
    @AfterSuite
    public void Aftersuit() {
    	System.out.println("Aftersuit10");
    	
    }
    
}



