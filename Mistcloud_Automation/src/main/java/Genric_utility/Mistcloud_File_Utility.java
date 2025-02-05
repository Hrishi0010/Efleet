package Genric_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Mistcloud_File_Utility implements Mistcloud_constraints {
	
	public FileInputStream fis;
	
//	to read date from properties file
	public String propertyFile(String Key) throws IOException {
		fis = new FileInputStream(credentials_File_Path);
		Properties prop = new Properties();
		prop.load(fis);
		String value =prop.getProperty(Key);
		return value;	
	}

//	to read date from excel file
	public String read_Excel_File(String sheet, int row , int cell) throws EncryptedDocumentException, IOException {
		fis = new FileInputStream("");
		Workbook workbook=WorkbookFactory.create(fis);
		String excel_Value =workbook.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return excel_Value;
		
	}
}
