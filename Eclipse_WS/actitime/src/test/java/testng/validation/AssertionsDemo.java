package testng.validation;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsDemo {

	
	@Test
	public void addition()
	{
		System.out.println("Adding 2 numbers");
		Assert.assertEquals(5+10, 14);
		System.out.println("Ended");
	}
	
	
	@Test
	public void additionUsingVerify()
	{
		SoftAssert sa = new  SoftAssert();
		System.out.println("Adding 2 numbers");
		sa.assertEquals(5+10, 14);
		System.out.println("Ended");
		sa.assertAll();
	}
	
	
	
}
