package com.alert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alertclass {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Index.html");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("enterimg")).click();
		WebElement sto = driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]"));
		WebElement al = driver.findElement(By.xpath("//a[contains(text(),'Alerts')]"));
		Actions a = new Actions(driver);
		a.moveToElement(sto).moveToElement(al).click().build().perform();
		WebElement displayed = driver.findElement(By.xpath("(//*[@class=\"analystic\"])[3]"));
		// System.out.println(displayed);
		displayed.click();
		driver.findElement(By.xpath("//*[@onclick=\"promptbox()\"]")).click();

		driver.switchTo().alert().accept();
		driver.quit(); 

	}
}
