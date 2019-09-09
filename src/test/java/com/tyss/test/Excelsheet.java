package com.tyss.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./src/test/resources/workbook.xlsx");
	Workbook wbook = WorkbookFactory.create(fis);
	//Sheet sheet1 = wbook.getSheet("Sheet1");
	//wbook.cloneSheet(0); 
	wbook.setSheetName(2, "Sheet3");
	
	FileOutputStream fos= new FileOutputStream("./src/test/resources/workbook.xlsx");
	wbook.write(fos);
	fos.close();
	wbook.close();
	fis.close();
	
	
}
}
