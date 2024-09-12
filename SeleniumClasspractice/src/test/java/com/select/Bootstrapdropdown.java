package com.select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Bootstrapdropdown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/select-menu");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//div[contains(text(),'Select Option')]")).click();
		// select single options
		// driver.findElement(By.xpath("//div[contains(text(),'Group 1, option
		// 1')]")).click();
		// capture all options
		// driver.findElement(By.xpath("//div[contains(text(),'A root
		// option')]")).click();
		WebElement ele = driver.findElement(By.id("oldSelectMenu"));
		Select s = new Select(ele);

		// s.selectByIndex(4);
		// s.selectByValue("5");
		// s.selectByVisibleText("Yellow");

		List<WebElement> op = s.getOptions();
		System.out.println("All options " + op.size());
//		for (int i = 0; i < op.size(); i++) {
//			System.out.println(op.get(i).getText());
		for (WebElement allop : op) {
			System.out.println(allop.getText());
			String opp = allop.getText();
			if (opp.equals("Blue")) {
				allop.click();

			}
		}
	}
}
