package com.synechron.javatraining.io;

import java.io.File;
import java.io.IOException;

public class FileDemo 
{
	
	public static void main(String[] args) 
	{
		File file =  new File("D:\\");
		System.out.println("Can Read - " + file.canRead());
		System.out.println("Can Write - " + file.canWrite());
		System.out.println("Can Execute - " + file.canExecute());
		
		System.out.println("is it file " + file.isFile());
		System.out.println("is it Dir " + file.isDirectory());
		
		printFileNames(file);
		
		printAllFileDetails(file);
		
	}

	private static void printAllFileDetails(File file) {
		if(file.isDirectory())
		{
			File[] files = file.listFiles();
			System.out.println(" Printing files inside the folder : " + file.getName());
			for (File f : files) {
				System.out.println("Details of File : " + f.getName() + "\nComplete path : " + f.getAbsolutePath() + "\nType is : " + (f.isFile()?"File" : "Directory"));
				System.out.println();
			}
		}
	}

	private static void printFileNames(File file) {
		if(file.isDirectory())
		{
			String[] files = file.list();
			System.out.println(" Printing files inside the folder : " + file.getName());
			for (String f : files) 
			{
				System.out.println(f);
				
			}
		}
	}

}
