package com.synechron.javatraining.methods;

public class StaticMethodsDemo {

	//method  without arguments and without returntype
	static void sayHello()
	{
		System.out.println("Hello");
	}
	
	static void greetingToUser(String user)
	{
		System.out.println("Hello " + user + " have a good day!!!");
	}
	
	
	
	public static void main(String[] args) {
		
		StaticMethodsDemo.sayHello();
		StaticMethodsDemo.greetingToUser("Aravinda");
	}
}
