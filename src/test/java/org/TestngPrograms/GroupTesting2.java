package org.TestngPrograms;

import org.testng.annotations.Test;

public class GroupTesting2 {
	
	
	@Test(groups= {"apple","oppo"})
	public void Oppo1() {
		System.out.println("Oppo Testing1");
		
	}
	
	@Test(groups= {"oppo"})
	public void Oppo2() {
		System.out.println("Oppo Testing2");
		
	}
	
	@Test(groups= {"moto","mi"})
	public void Moto1() {
		System.out.println("Moto Testing1");
		
	}
	
	@Test(groups= {"moto"})
	public void Moto2() {
		System.out.println("Moto Testing2");
		
	}
	@Test(groups= {"samsung"})
	public void Samsung1() {
		System.out.println("Samsung Testing1");
		
	}
	@Test(groups= {"samsung","vivo"})
	public void Samsung2() {
		System.out.println("Samsung Testing2");
		
	}
	
	
	


}


