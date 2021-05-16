package testng.order;

import org.testng.annotations.Test;

public class OrderOfExecution {

	
	
	@Test(priority = 1)
	public void launch()
	{
		
	}
	
	@Test(priority = 2)
	public void login()
	{
		
	}
	
	@Test(priority = 3)
	public void createCutomer()
	{
		
	}
	
	@Test(priority = 4)
	public void logout()
	{
		
	}
}
