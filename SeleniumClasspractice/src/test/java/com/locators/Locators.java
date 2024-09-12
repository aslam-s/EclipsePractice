package com.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) throws InterruptedException {
		// initializing browser
		WebDriver driver = new ChromeDriver();
		// launch url
		driver.get("https://www.flipkart.com/");
		// Getting title
		String title = driver.getTitle();
		System.out.println(title);
		// maximize window
		driver.manage().window().maximize();
		// Timeout
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		// login
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		// By using two locator
		// usimg or //input[@class=\"Pke_EE\" or @type=\"text\"]" And >
		// //input[@class=\"Pke_EE\" AND @type=\"text\"]"
		driver.findElement(By.xpath("//input[@class=\"Pke_EE\" or @type=\"text\"]")).sendKeys("iphone14");
		// driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("iphone14");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		

	}
}
