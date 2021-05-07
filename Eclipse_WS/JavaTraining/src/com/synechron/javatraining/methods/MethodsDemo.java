package com.synechron.javatraining.methods;

public class MethodsDemo {

	//method  without arguments and without returntype
	void sayHello()
	{
		System.out.println("Hello");
	}
	
	void greetingToUser(String user)
	{
		System.out.println("Hello " + user + " have a good day!!!");
	}
	
	
	
	public static void main(String[] args) {
		MethodsDemo md = new MethodsDemo();
		md.sayHello();
		md.greetingToUser("Aravinda");
	}
}
