package testng.dataprovider;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class DataproviderDemo {
  @Test(dataProvider = "dummydata", dataProviderClass = TestData.class)
  public void f(Integer n, String s, Double d) 
  {
	  Reporter.log(n + " and " +  s + " and " +  d + "<br>");
  }

  
}
