package com.synechron.javatraining.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedFileWriterDemo {

	public static void main(String[] args) {

		File file = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		int num =15;
		try {
			file = new File("D:\\SynechronJavaSelenium_07_05\\temp.txt");
			fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);
			bw.newLine();
			bw.write("Generating table for "  + num);
			bw.newLine();
			for (int i = 1; i <= 10 ; i++) {
				bw.write(num + " * " + i + " = " + (num*i));
				bw.newLine();
			}
			System.out.println("Complete");
		} catch (FileNotFoundException e) {
			System.out.println("Exception while reading file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.flush();
				bw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
