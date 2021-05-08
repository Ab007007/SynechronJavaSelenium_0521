package com.synechron.javatraining.inheritence;

public class AnonymousInnerClassDemo
{

	public static void main(String[] args)
	{
		
		MyInterface mf = new MyInterface()
		{
			@Override
			public void printMyName() {
				System.out.println("Aravinda");
			}
			@Override
			public void printMyQualification() {
				System.out.println("Mtech, CSE");
			}
		};
		
		MyInterface mf2 = new MyInterface() 
		{
			@Override
			public void printMyQualification() {
				System.out.println("Girish");
			}
			
			@Override
			public void printMyName() {
				System.out.println("MBA");
			}
		};
		
		mf.printMyName();
		mf.printMyQualification();
		System.out.println("--------------------------------------------");
		mf2.printMyName();
		mf2.printMyQualification();
	}
}
