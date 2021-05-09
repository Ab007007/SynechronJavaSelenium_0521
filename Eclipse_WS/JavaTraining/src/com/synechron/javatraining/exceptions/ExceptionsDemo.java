package com.synechron.javatraining.exceptions;

public class ExceptionsDemo {
	
	
	public static void main(String[] args) {
		
		System.out.println("main Started");
		try 
		{
			int a = 100 /10;
			System.out.println("Number after division " + a);
			int arr[] = {12,23,34,45,56,6,7};
			System.out.println("Element at index 0 ->" + arr[arr.length-1]);
		}

		catch(ArithmeticException ex ) {
			System.out.println("Dont divide the number by 0");
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Check the index of an array");
		}
		catch(Exception ex)
		{
			System.out.println("Generic Exception");
		}
		finally {
			System.out.println("Always!!!!!");
		}
		
		System.out.println("main Ended");
	}

}
