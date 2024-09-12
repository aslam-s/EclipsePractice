package com.robot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardActon {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.get("https://demoqa.com/webtables");
		String title = driver.getTitle();
		// no f rows
		int size = driver.findElements(By.xpath("//*[@class=\"rt-tr-group\"]")).size();
		System.out.println("number of rows " + size);
		// no of column
		int size2 = driver.findElements(By.xpath("//*[@role=\"columnheader\"]")).size();
		System.out.println("Number of size " + size2);
		// retrieve data
		String text = driver
				.findElement(By.xpath("//div[@class=\"rt-table\"]//descendant::div[contains(text(),'Cierra')]"))
				.getText();
		System.out.println("the name is " + text);
	}
}
