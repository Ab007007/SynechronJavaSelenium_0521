package com.synechron.javatraining.exceptions;

public class ThrowsDemo {

	public static void main(String[] args) {
		System.out.println("Main Started");
	
		try 
		{
			pauseExecution(3000);
		} 
		catch (InterruptedException e) 
		{
			System.out.println("Exception occured while waiting");
		}

		System.out.println("Main Ended");
	}
	
	
	static void pauseExecution(int ms) throws InterruptedException
	{
		System.out.println("Pausing execution for " + ms + " mili seconds");
		Thread.sleep(ms);
	}
}
