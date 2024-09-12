package com.executor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZOOMINOUT {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.opencart.com/");
		String title = driver.getTitle();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Zoom page
		Thread.sleep(3000);
		js.executeScript("document.body.style.zoom='50%'");// 50%%
		Thread.sleep(5000);
		js.executeScript("document.body.style.zoom='90%'");// 80%
	}
}