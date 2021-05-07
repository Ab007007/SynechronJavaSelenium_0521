package com.synechron.javatraining.methods;

public class MethodsWithReturnTypeDemo {

	//method  without arguments and without returntype
	static String sayHello()
	{
		return "Hello";
	}
	
	static String greetingToUser(String user)
	{
		return  user + " have a good day!!!";
	}
	
	
	
	public static void main(String[] args) {
		
		String msg = MethodsWithReturnTypeDemo.sayHello();
		String greeting = MethodsWithReturnTypeDemo.greetingToUser("Aravinda");
		
		System.out.println(msg + " , " + greeting);
	}
}
