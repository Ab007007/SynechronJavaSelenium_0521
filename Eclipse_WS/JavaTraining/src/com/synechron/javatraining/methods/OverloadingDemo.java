package com.synechron.javatraining.methods;

public class OverloadingDemo {
	
	
	
	public static void sum(int a , int b)
	{
		System.out.println("Sum of " + a + " and " + b + " is " + (a+b));
	}
	public static void sum(int a , int b, int c)
	{
		System.out.println("Sum of " + a + " and " + b + " is " + (a+b));
	}
	
	public static void sum(double a , double b)
	{
		System.out.println("Sum of " + a + " and " + b + " is " + (a+b));
	}
	
	public static void sum(String a , String b)
	{
		System.out.println("Sum of " + a + " and " + b + " is " + (a+b));
	}
	
	
	
	public static void main(String[] args) {
		sum(10, 20);
		sum(100.5, 200.9);
		sum("Aravinda " , "HB");
	}

}
