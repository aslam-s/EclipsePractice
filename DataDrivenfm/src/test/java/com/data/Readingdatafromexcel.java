package com.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Readingdatafromexcel {
	public static void main(String[] args) throws FileNotFoundException {
//Excel File->workbook->Sheets->Rows->Cells                
		FileInputStream fin = new FileInputStream("D:\\\\Hero Moneykit.xlsx");// path of the file .xlsx
		// XSSFWorkbook workbook(wb)= new XSSFWorkbook(fin);
		// XSSFSheet sh=wb.getSheet("sheet1"); ///wb.getSheetAt(0);
		// int totalRows= sh.getLastRownum();
		// int totalcells =sh.getRow(1).getLastcellNum();
//		System.out.println(totalrows);
//		System.out.println(totalcells);

		// add depedency log4japache console error came tats y
//		for (int r = 0; r <= totalRows; r++) {
//			XSSFRow curretnRow = sh.getRow(r);
//			for (int c = 0; c <= totalcell; c++) {
//
//				XSSFCell cell = currentRow.getcell(c);
//				System.out.println(cell.tostring()+"\t");
//			}
		// System.out.println();
//		}
//wb.close();
		// File.close();
	}
}
