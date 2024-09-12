package com.testn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrangeHrmTest {
	static WebDriver driver;

	@BeforeClass
	private void bc() {
		System.out.println("bef class");

	}

	@AfterClass
	private void ac() {
		System.out.println("after class");

	}

	@Test(priority = 1)
	public void openapp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
	}

	@Test(priority = 2)
	public void testlogo() throws InterruptedException {
		Thread.sleep(3000);
		boolean status = driver.findElement(By.xpath("(//*[@title=\"Flipkart\"])[3]")).isDisplayed();
		System.out.println(status);
	}

	@Test(priority = 3)
	public void testlogin() {

		driver.findElement(By.xpath("(//a[@title=\"Login\"])[1]")).click();
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();

	}

	@Test(priority = 4)
	public void closeapp() {
		driver.quit();

	}
}
