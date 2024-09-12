package com.data;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class DynamicdataintoExcel {
	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fout = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\myfile.xlsx");
		// XSSFWorkbook workbook(wb)= new XSSFWorkbook(fout);
		//// XSSFSheet sh=wb.createSheet("Dynamicdata");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter how many rows");
//		int noofrows = sc.nextInt();
//		System.out.println("Enter how many cells");
//		int noofcells = sc.nextInt();
//		for (int r = 0; r <= noofrows; r++) {
//			XSSFRow curretnrows = sh.createrow(r);
//			for (int c = 0; c <= noofcells; c++) {
//				XssfCell cell = currentrow.createcell(c);
//				cell.setcellvalue(sc.next());
//			}
//		}
	}
}
