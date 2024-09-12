package com.sele;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartsample {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("iphone14");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class=\"KzDlHZ\"]"));
		for (int i = 0; i < ele.size(); i++) {
			System.out.println(ele.get(i).getText());
//			for (WebElement x : ele) {
//				System.out.println(x.getText());

			// }

		}
		driver.quit();
	}
}
