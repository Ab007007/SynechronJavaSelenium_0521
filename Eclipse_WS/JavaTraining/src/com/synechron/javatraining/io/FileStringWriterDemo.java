package com.synechron.javatraining.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStringWriterDemo {
	
	public static void main(String[] args) {
		File file  = null; 
		FileOutputStream fos = null;
		String text =  "Hello this is my first progarm on File Handling";
		try {
			file = new File("D:\\SynechronJavaSelenium_07_05\\temp.txt");
			fos = new FileOutputStream(file);
			fos.write(text.getBytes());
			System.out.println("Complete");
		}
		catch (FileNotFoundException e) {
			System.out.println("Exception while reading file");
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
