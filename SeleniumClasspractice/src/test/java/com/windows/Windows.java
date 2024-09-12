package com.windows;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Windows.html");
		String title = driver.getTitle();
		System.out.println(title);

		driver.findElement(By.xpath("//a[contains(text(),'Open Seperate Multiple Windows')]")).click();
		driver.findElement(By.xpath("//button[@onclick=\"multiwindow()\"]")).click();
		Set<String> allwin = driver.getWindowHandles();
		System.out.println(allwin);
		Iterator<String> itr = allwin.iterator();
		String p = itr.next();
		String c = itr.next();
		driver.switchTo().window(p);

		driver.quit();

	}
}
