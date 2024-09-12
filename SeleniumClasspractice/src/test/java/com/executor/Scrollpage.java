package com.executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollpage {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.opencart.com/");
		String title = driver.getTitle();
		System.out.println(title);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// scroll page
//		js.executeScript("window.scrollBy(0,1500)", "");
//		System.out.println(js.executeScript("return window.pageYOffset;"));// 1500

		// 2nd method
//		WebElement ele = driver.findElement(By.xpath("//h2[contains(text(),'Significant Achievements')]"));
//		js.executeScript("arguments[0].scrollIntoView();", ele);
//		System.out.println(js.executeScript("return window.pageYOffset;"));// 1500
		// i want to navigate till bottom

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));// 1500
		Thread.sleep(2000);
		// i want scroll up to starting position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

	}
}
