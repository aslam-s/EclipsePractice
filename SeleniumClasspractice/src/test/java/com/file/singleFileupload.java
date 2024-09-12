package com.file;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class singleFileupload {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		String title = driver.getTitle();
		Thread.sleep(3000);
		driver.findElement(By.id("filesToUpload")).sendKeys("C:\\\\Users\\\\CIPL1593\\\\Documents\\dynamicxpath.txt");
		Thread.sleep(3000);
		if (driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("dynamicxpath.txt")) {
			System.out.println("file upload");
		} else {
			System.out.println("no file");
		}
		
		driver.quit();
	}
}
