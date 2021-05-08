package com.synechron.javatraining.exceptions;

public class ThrowDemo
{
	
	public static void main(String[] args)  {
		System.out.println("main started");
		int balance = 5000;
		int tempbalance  = balance - 10000;
		if(tempbalance < 0)
		{
			try 
			{
				throw new Exception();
			} 
			catch (Exception e) {
				System.out.println("your balance is low " + balance);
			}
			finally {
				System.out.println("Always.....");
			}
		}
		else 
		{
			balance = tempbalance;
		}
		System.out.println("Current balance is " + balance);
		System.out.println("main ended");
	}

}
