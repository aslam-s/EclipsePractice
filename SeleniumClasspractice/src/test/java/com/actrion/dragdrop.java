package com.actrion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {
	static WebDriver driver;
	static Actions a;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Index.html");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("enterimg")).click();
		WebElement ele = driver.findElement(By.xpath("//*[contains(text(),'Interactions')] "));
		WebElement dd = driver.findElement(By.xpath(" //*[contains(text(),'Drag and Drop')]"));
		WebElement sts = driver.findElement(By.xpath("//*[contains(text(),'Static')] "));
		a = new Actions(driver);
		a.moveToElement(ele).moveToElement(dd).moveToElement(sts).build().perform();
		a.click(sts).build().perform();
		WebElement drag = driver.findElement(By.id("angular"));
		WebElement drop = driver.findElement(By.id("droparea"));
		WebElement drag1 = driver.findElement(By.id("node"));
		WebElement drop1 = driver.findElement(By.id("droparea"));
//		WebElement drag2 = driver.findElement(By.id("mongo@"));
//		WebElement drop2 = driver.findElement(By.id("droparea"));

		a.dragAndDrop(drag, drop).dragAndDrop(drag1, drop1).build().perform();

	}
}
