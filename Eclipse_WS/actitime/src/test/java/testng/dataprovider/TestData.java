package testng.dataprovider;

import org.testng.annotations.DataProvider;

public class TestData {

	
	@DataProvider
	  public Object[][] dummydata() 
	  {
	    return new Object[][] 
		{
	      new Object[] { 1, "a", 22.5 },
	      new Object[] { 2, "b" , 33.5},
	    };
	  }
	
	@DataProvider
	  public Object[][] loginData() 
	  {
	    return new Object[][] 
		{
	      new Object[] { "admin", "manager" },
	      new Object[] { "admin", "manager" },
	      new Object[] { "admin", "manager" },
	      new Object[] { "admin", "manager" },
	      new Object[] { "admin", "manager" }
	    };
	  }
	
	@DataProvider
	  public Object[][] createCustomerData() 
	  {
	    return new Object[][] 
		{
	      new Object[] { "Testng-Cust1", "Testng-Cust1-Desc" },
	      new Object[] { "Testng-Cust2", "Testng-Cust2-Desc" },
	      new Object[] { "Testng-Cust3", "Testng-Cust3-Desc" },
	      new Object[] { "Testng-Cust4", "Testng-Cust4-Desc" },
	      new Object[] { "Testng-Cust5", "Testng-Cust5-Desc" },
	    };
	  }
	
}
