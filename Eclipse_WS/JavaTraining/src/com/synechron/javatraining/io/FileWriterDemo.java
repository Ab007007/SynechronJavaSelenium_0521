package com.synechron.javatraining.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {

		File file = null;
		FileWriter fw = null;
		try {
			file = new File("D:\\SynechronJavaSelenium_07_05\\temp.txt");
			fw = new FileWriter(file, true);
			fw.write("This is my new content");
			System.out.println("Complete");
		} catch (FileNotFoundException e) {
			System.out.println("Exception while reading file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
