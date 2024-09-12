package com.table;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		String title = driver.getTitle();
		System.out.println(title);
		int rows = driver.findElements(By.xpath("//table[@class=\"tsc_table_s13\"]//tr")).size();
		System.out.println("no of rows " + rows);
		int col = driver.findElements(By.xpath("//table[@class=\"tsc_table_s13\"]//thead//th")).size();
		System.out.println("no of column " + col);
//		String text = driver.findElement(By.xpath("//table[@class=\"tsc_table_s13\"]//tr[3]//td[2]")).getText();
//		System.out.println(text);
//		for (int r = 1; r <= size; r++) {
//
//			for (int c = 1; c <= size2; c++) {
//				String data = driver
//						.findElement(By.xpath("//table[@class=\"tsc_table_s13\"]//tr[" + r + "]//td[" + c + "]"))
//						.getText();
//				System.out.println(data + "  ");
//			}
//			System.out.println();
		Thread.sleep(3000);
		for (int r = 0; r <= rows; r++) {
			String dat = driver.findElement(By.xpath("//table[@class=\"tsc_table_s13\"]//tbody//tr[" + r + "]//td[2]"))
					.getText();
			if (dat.equals("China")) {
				String dat1 = driver
						.findElement(By.xpath("//table[@class=\"tsc_table_s13\"]//tbody/tr[" + r + "]//td[3]"))
						.getText();
				System.out.println(dat + "  " + dat1);
			}
		}
	}
}
