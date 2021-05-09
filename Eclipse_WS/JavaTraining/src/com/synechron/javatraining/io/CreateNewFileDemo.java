package com.synechron.javatraining.io;

import java.io.File;
import java.io.IOException;

public class CreateNewFileDemo 
{
	
	public static void main(String[] args) 
	{
		File file =  new File("D:\\SynechronJavaSelenium_07_05\\temp.txt");
		System.out.println("Can Read - " + file.canRead());
		System.out.println("Can Write - " + file.canWrite());
		System.out.println("Can Execute - " + file.canExecute());
		
		if(!file.exists())
		{

			System.out.println("Creating a new file");
			try 
			{
				file.createNewFile();
			} 
			catch (IOException e) 
			{
				System.out.println("Exception while creating file" + e.getMessage());
			}
		}
		else
		{
			System.out.println("File Exist not creating any file");
		}
	}

}
