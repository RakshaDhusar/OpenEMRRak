package com.cyient.test;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo2 {
	
	FileInputStream file = new FileInputStream("src/test/resources/testdata/OpenEMRData.xlsx");

	 

    XSSFWorkbook book = new XSSFWorkbook(file); // open
    XSSFSheet sheet = book.getSheet("validCredentialTest");// sheet



    int rowCount = sheet.getPhysicalNumberOfRows();
    System.out.println(rowCount);



    int cellcount = sheet.getRow(0).getPhysicalNumberOfCells();
    System.out.println(cellcount);
    
    Object[][] main = new Object[rowCount - 1][cellcount];



    for (int r = 1; r < rowCount; r++) {
        for (int c = 0; c < cellcount; c++) {



            XSSFRow row = sheet.getRow(r);
            XSSFCell cell = row.getCell(c);



            DataFormatter format = new DataFormatter();



            String cellValue = format.formatCellValue(cell);
            System.out.println(cellValue);



            main[r - 1][c] = cellValue;
        }
    
    }
}
}


