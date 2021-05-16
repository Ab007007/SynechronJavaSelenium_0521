package testng.group;

import org.testng.annotations.Test;

public class Cars {

	@Test(groups = { "maruthi", "regression" })
	public void swift() {

	}

	@Test(groups = "maruthi")
	public void alto() {

	}

	@Test(groups = "maruthi")
	public void ertiga() {

	}

	@Test(groups = { "mahendra", "regression" })
	public void xuv500() {

	}

	@Test(groups = "mahendra")
	public void xuv300() {

	}

	@Test(groups = { "kia", "regression" })
	public void celtos() {

	}

	@Test(groups = "kia")
	public void carnival() {

	}

}
