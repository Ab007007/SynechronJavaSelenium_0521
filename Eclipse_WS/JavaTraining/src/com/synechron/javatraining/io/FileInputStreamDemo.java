package com.synechron.javatraining.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo
{
	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\SynechronJavaSelenium_07_05\\temp.txt");
		FileInputStream fis =  new FileInputStream(file);
		int i = 0; 
		
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println();		
		fis.close();
		System.out.println("Completed..");
		
	}

}
