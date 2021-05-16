package com.synechron.selenium.training.actitime.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ActitimeFileUtils {

	public static File file = null;
	public static FileInputStream fis = null;
	public static Workbook wb = null;
	public static Sheet sh = null;
	public static Row row = null; 
	public static Cell cell = null; 

	/**
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static String getPropertyValue(String pn) {

		Properties props = null;
		String value = null;
		try {
			file = new File("data/config.properties");
			fis = new FileInputStream(file);

			props = new Properties();

			props.load(fis);

			value = props.getProperty(pn);
			System.out.println("Value returned from properties file for " + pn + " : " + value);
		} catch (Exception ex) {
			System.out.println("Error while reding properties file");
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return value;
	}



	/**
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static Workbook getWorkBook() throws FileNotFoundException, IOException {
		file = new File("data/actitime-testdata.xls");
		fis = new FileInputStream(file);
		wb = WorkbookFactory.create(fis);
		
		return wb;
	}
	
	public static Sheet rowSheet(String sheetname) throws FileNotFoundException, IOException
	{
		wb = getWorkBook();
		sh = wb.getSheet(sheetname);
		return sh;
		
	}
	
	public static int rowCount(String sheetname) throws FileNotFoundException, IOException
	{
		wb = getWorkBook();
		sh = wb.getSheet(sheetname);
		int rowCount = sh.getLastRowNum() + 1;
		return rowCount;
	}
	
	public static String getCellData(String sheetname, int rownum, int colnum)
	{
		sh = wb.getSheet(sheetname);
		row = sh.getRow(rownum);
		cell = row.getCell(colnum);
		
		return cell.toString();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
