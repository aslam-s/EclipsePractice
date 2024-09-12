package com.actrion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	static WebDriver driver;
	static Actions a;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		driver.findElement(By.xpath(" //*[@type=\"submit\"]")).click();
//		//a = new Actions(driver);
//		driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[1]"))
//				.click();
//		driver.findElement(By.xpath("(//span[@class=\"oxd-topbar-body-nav-tab-item\"])[1]")).click();
//		driver.findElement(By.xpath("//a[@role=\"menuitem\"]")).click();
		driver.get("https://demoqa.com/");
		WebElement ele = driver.findElement(By.xpath("//h5[contains(text(),'Elements')]"));
		// WebElement form =
		// driver.findElement(By.xpath("//h5[contains(text(),'Forms')]@"));
		a = new Actions(driver);
		a.moveToElement(ele).build().perform();
		a.click(ele).build().perform();

		WebElement tex = driver.findElement(By.xpath("//span[contains(text(),'Check Box')]"));
		WebElement ad = driver.findElement(By.xpath("//div[@class=\"Google-Ad\"]"));
		a.moveToElement(tex).moveToElement(ad).build().perform();
		a.click(ad).build().perform();

	}
}
