package com.synechron.javatraining.access.pack1;

public class A {
	
	private int accountNum = 12345698;
	int phonenum=879797;
	protected int bankBalance = 52222222;
	public String name = "XYZ";
	
	
	
	
	private void printPrivateMember()
	{
		System.out.println("Account Number  " + accountNum);
	}

	
	void printDefaultMember()
	{
		System.out.println("phone Number  " + phonenum);
	}

	
	protected void printProtectedMember()
	{
		System.out.println("Bank Balance " + bankBalance);
	}

	
	public void printPublicMember()
	{
		
		System.out.println("Name " + name);
	}
	
	private void allVariables()
	{
		System.out.println("Account Number  " + accountNum);
		System.out.println("phone Number  " + phonenum);
		System.out.println("Bank Balance " + bankBalance);
		System.out.println("Name " + name);
	}
	public static void main(String[] args) {
		A a = new A();
		a.printPublicMember();
		a.printPrivateMember();
		a.printDefaultMember();
		a.printProtectedMember();
				
	}

}
