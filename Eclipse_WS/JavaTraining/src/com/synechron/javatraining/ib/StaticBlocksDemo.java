package com.synechron.javatraining.ib;

public class StaticBlocksDemo
{

	static
	{
		int num = 10;
		System.out.println("i'm the priority");
		for (int i = 0; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
			
		}
	}
	
	
	
	public static void main(String[] args) 
	{
		System.out.println("main started");
		
	}

}
