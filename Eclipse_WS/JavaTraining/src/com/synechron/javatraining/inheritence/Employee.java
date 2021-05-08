package com.synechron.javatraining.inheritence;

import com.synechron.javatraining.constructor.Person;

public class Employee extends Person
{
	
	String employeeID;
	String employeePhone;
	static String companyName = "Synechron";
	static final String companyPhoneNum = "2112221122222";
	
	@Override
	public String toString() {
	
		String str  = null;
		
		str = "Employee name : " + this.name + "\nEmployee Age : " + this.age + "\nEmployee Height :" + this.height
				
				+ "\nEmployee Weight : " + this.weight + "\nEmployee ID : " + this.employeeID + 
				
				"\nEmployee Phone Num : " + this.employeePhone + "\nCompany : " + Employee.companyName
				
				+ "\nCompany Phone Num : " + Employee.companyPhoneNum;
		
		return str;
	}
	
	
	
	@Override
	public void printAllDetails() {
		// TODO Auto-generated method stub
		super.printAllDetails();
		System.out.println("Employee ID : " + this.employeeID);
		System.out.println("Employee Phone : " + this.employeePhone);
		System.out.println("Employee Company : " + Employee.companyName);
		System.out.println("Company Phone : " + Employee.companyPhoneNum);
		
	}
	
	
	
	public static void main(String[] args) 
	{
		
		Employee em1  = new Employee();
		em1.name = "Aravinda";
		em1.age = 38;
		em1.height = 5.8;
		em1.weight =70;
	
		em1.employeeID = "EMP123";
		em1.employeePhone = "9988555588";
		em1.companyName = "Wipro";

		System.out.println(em1);
		
	}
	

}
