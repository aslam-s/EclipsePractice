package com.pom;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Logintest {
	WebDriver driver;

	@BeforeClass
	public void setup() {
		Date d = new Date();
		System.out.println(d);

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test
	public void testlogin() throws InterruptedException {

		Loginpage2 l = new Loginpage2(driver);
		Thread.sleep(3000);
		l.setusername("Admin");
		l.setpass("admin123");
		l.clickLogin();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	@AfterClass

	public void teardown() {
		driver.quit();
	}
}
