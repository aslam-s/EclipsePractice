package com.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class WritingdataintoExcel {
	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fout = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\myfile.xlsx");
		// XSSFWorkbook workbook(wb)= new XSSFWorkbook(fin);
		// XSSFSheet sh=wb.createSheet("Data");
		// XSSFRow row1=sh.createRow(0)
		// row1.createcell(0).setCellValue("java")
		// row1.createcell(1).setCellValue("1234")
		// row1.createcell(2).setCellValue("Automation")
		// XSSFRow row2=sh.createRow(1)
		// row2.createcell(0).setCellValue("pyhton")
		// row2.createcell(1).setCellValue("34")
		// row2.createcell(2).setCellValue("Automation")
		// workbook.write(fout);
//		workbook.close();
//		file.close();
		// System.out.println("file is created");
	}
}
