package com.file;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplefile {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		String title = driver.getTitle();
		Thread.sleep(3000);
		// multiple files upload
		String f1 = "C:\\Users\\CIPL1593\\Documents\\dynamicxpath.txt";
		String f2 = "C:\\Users\\CIPL1593\\Documents\\dvfds.txt";

		driver.findElement(By.id("filesToUpload")).sendKeys(f1 + "\n" + f2);
		Thread.sleep(3000);
		// no of files
		int noffile = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		System.out.println(noffile);
		if (noffile == 2) {
			System.out.println("files upload");
		} else {
			System.out.println("no file");
		}
		// validate file name
		if (driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("dynamicxpath.txt")
				&& driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("dvfds.txt")) {
			System.out.println("file name matching");
		} else {
			System.out.println("not matching");
		}
		driver.quit();
	}
}
