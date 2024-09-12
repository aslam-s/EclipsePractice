package com.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributes {
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
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
		element.click();
		WebElement element2 = driver
				.findElement(By.xpath("//input[@type=\"text\"]/parent::div[@class=\"I-qZ4M vLRlQb\"]"));
		element2.sendKeys("9003831782");
		String attribute = element2.getAttribute("class");
		System.out.println(attribute);

	}
}
