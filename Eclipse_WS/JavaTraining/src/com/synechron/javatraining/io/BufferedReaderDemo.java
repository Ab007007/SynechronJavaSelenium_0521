package com.synechron.javatraining.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\SynechronJavaSelenium_07_05\\temp.txt");
		FileReader fr =  new FileReader(file);
		BufferedReader br  = new BufferedReader(fr);
		String line = null;
		while((line=br.readLine()) != null)
		{
			System.out.println(line);
		}
		/*
		 * int i = 0; while((i=fr.read()) != -1) { System.out.print((char)i); }
		 */
		System.out.println("complete");
	}
}
