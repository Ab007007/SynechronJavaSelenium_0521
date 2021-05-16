package testng.order;

import org.testng.annotations.Test;

public class OrderOfExecutionUsingDependsOn {

	@Test
	public void launch() {

	}

	@Test(dependsOnMethods = "launch")
	public void login() {

	}

	@Test(dependsOnMethods = { "launch", "login" })
	public void createCutomer() {

	}

	@Test(dependsOnMethods = { "launch", "login", "createCutomer" })
	public void logout() {

	}
}
