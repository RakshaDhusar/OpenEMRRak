package com.cyient.test;

import java.io.FileInputStream;

public class DemoTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream("src/test/resources/testdata/Book4.xlsx");
				
				XSSFWorkbook book = new XSSWorkbook(file);
				
				XSSFSheet sheet = book.getSheet("validCredentialTest");
				
				XSSRow row = sheet.getRow(2);
				
				XSSCell cell = row.getCell(1);
				
				String cellValue = cell.getStringCellValue();
				System.out.println(cellValue);
				
				/*for(int r=0;r<3;r++)
				{ 
					r[0][0]=Username;
					r[0][1]=Password;
					r[0][2]=Language;
					r[0][0]=Expected Value;
					
					r[1][0]=admin;
					r[1][1]=pass;
					r[1][2]=English(Indian);
					r[1][3]=OpenEMR;
					
					r[2][0]=accountant;
					r[2][1]=accountant;
					r[2][2]=English(Indian);
					r[2][3]=OpenEMR;
				}*/
				for(int r=0;r<3;r++)
		        {
		            for(int c=0;c<4;c++)
		            {
		                XSSFRow row = sheet.getRow(r);
		               
		                XSSFCell cell = row.getCell(c);
		               
		                DataFormatter format = new DataFormatter();
		               
		                String cellvalue = format.formatCellValue(cell);
		                System.out.println(cellvalue);
		            }
		        }

	}

}