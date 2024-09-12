package com.listener;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(com.listener.MyListener.class)  //another way without writing XML
public class ListenerclassDemo {
	static WebDriver driver;

	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@Test(priority = 1) // pass

	void testlogo() throws InterruptedException {
		boolean displayed =

				driver.findElement(By.xpath("(//*[@class=\"oxd-text oxd-text--p\"])[1]")).isDisplayed();
		Thread.sleep(5000);
		Assert.assertEquals(displayed, true);

	}

	@Test(priority = 2) // failed url mismatch
	void testappurl() throws InterruptedException {

		String url = driver.getCurrentUrl();
		Thread.sleep(3000);

		Assert.assertEquals(url, "https://opensurce-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test(priority = 3, dependsOnMethods = "testappurl") // skip
	void homepagetitle() throws InterruptedException {

		String title = driver.getTitle();
		Thread.sleep(3000);

		Assert.assertEquals(title, "OrangeHRM");
	}

	@AfterClass
	void broclose() {
		driver.quit();
	}
}
