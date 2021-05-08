package com.synechron.javatraining.kb;

import java.util.Scanner;

public class ReadDataFromKB {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "no";
		do
		{
			System.out.println("Generate Table...");
			System.out.println("Enter the number ...");
			int num = sc.nextInt();
			
			for (int i = 1; i <=10; i++)
			{
				System.out.println(num + " * " + i + " = " + (num * i));
			}
			System.out.println("Do you want to continue...???? Yes / No..");
			choice = sc.next();
		}while(choice.equalsIgnoreCase("yes"));
		
		System.out.println("---Thanks for usiing Tables Generator----");
	}
}
