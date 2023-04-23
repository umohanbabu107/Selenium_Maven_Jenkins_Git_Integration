package mavenTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest1 {
	
	@Test
	public void add1() {
		int a = 10; 
		int b = 20;
		int c = a+b;
		
		Assert.assertEquals(c, 30);
		
	}
	
	@Test
	public void div1() {
		int a = 30;
		int b = 15;
		int c = a/b;
		Assert.assertEquals(c, 2);
	}
	
	@Test
	public void mul1() {
		int a = 15;
		int b = 2;
		int c=a*b;
		Assert.assertEquals(c, 30);
		
	}


}
