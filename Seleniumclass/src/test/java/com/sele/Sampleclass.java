package com.sele;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampleclass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']/parent::div"))
				.sendKeys("mobiles");
		// driver.findElement(By.xpath(""))
	}
}
