package org.TestngPrograms;

import org.testng.annotations.Test;

public class GroupsTesting {
	
	
	@Test(groups= {"apple","oppo"})
	public void Apple1() {
		System.out.println("Apple Testing");
		
	}
	@Test(groups= {"apple"})
	public void Apple2() {
		System.out.println("Apple Testing2 ");
	}
	@Test(groups= {"apple","vivo"})
	public void Vivo1() {
		System.out.println("Vivo Testing1 ");
	}
	@Test(groups= {"vivo"})
	public void Vivo2() {
		System.out.println("Vivo Testing2 ");
	}
	@Test(groups= {"mi"})
	public void  Mi1() {
		System.out.println("MI Testing1 ");
	}

	@Test(groups= {"mi"})
	public void MI2() {
		System.out.println("Mi Testing2 ");
	}


}
