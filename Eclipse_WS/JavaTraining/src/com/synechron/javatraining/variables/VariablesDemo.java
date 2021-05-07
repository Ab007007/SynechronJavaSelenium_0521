package com.synechron.javatraining.variables;

public class VariablesDemo 
{
	
	static String name = "Aravinda";
	
	
	public static void main(String[] args) 
	{
		int age  = 35;
		System.out.println(name);
		System.out.println(age);
		test1();
	}
	
	
	public static void test1() 
	{
		int age =40;
		System.out.println("Name from Method -" + name);
		System.out.println(age);
	}

}
