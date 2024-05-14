package org.TestngPrograms;

import org.BaseClass.HelperClass;
import org.testng.annotations.Test;

public class ParallelTesting extends HelperClass{
	
	@Test
	public void Jiocenima() {
		ChromeBrowser();
		Maximize();
		GetUrl("https://www.jiocinema.com/");
		System.out.println(Thread.currentThread().getId());
		
		
	}
	@Test
	public void Amezon() {
		ChromeBrowser();
		Maximize();
		GetUrl("https://www.amazon.in");
		System.out.println(Thread.currentThread().getId());
		
	}
	@Test
	public void Facebook() {
		ChromeBrowser();
		Maximize();
		GetUrl("https://www.facebook.com/");
		System.out.println(Thread.currentThread().getId());
		
		
	}
	@Test
	public void SanpDeal() {
		ChromeBrowser();
		Maximize();
		GetUrl("https://www.snapdeal.com/");
		System.out.println(Thread.currentThread().getId());
		
		
		
	}
	

}
