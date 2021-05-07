package com.synechron.javatraining.variables;

public class Employee 
{
	
	String employeeName;
	String employeeID;
	String employeePhone;
	static String companyName = "Synechron";
	static final String companyPhoneNum = "2112221122222";
	
	
	public static void main(String[] args) 
	{
		
		Employee em1  = new Employee();
		em1.employeeName = "Aravinda";
		em1.employeeID = "EMP123";
		em1.employeePhone = "9988555588";
		em1.companyName = "Wipro";
		//em1.companyPhoneNum = "2112221122222sdsfd";
		System.out.println(em1.employeeName);
		System.out.println(em1.companyName);
		System.out.println("Company Phone number " + Employee.companyPhoneNum);
		System.out.println(Employee.companyName);
		
		Employee em2  = new Employee();
		em2.employeeName = "Mahesh";
		em2.employeeID = "EMP124";
		em2.employeePhone = "332323232";
		System.out.println(em2.employeeName);
		System.out.println(em2.companyName);
		
	}
	

}
