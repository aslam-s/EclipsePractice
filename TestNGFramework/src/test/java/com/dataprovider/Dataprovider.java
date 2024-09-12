package com.dataprovider;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	static WebDriver driver;

	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@BeforeMethod
	void Datefro() {
		Date d = new Date();
		System.out.println(d);
	}

	@Test(dataProvider = "dp")
	void testlogin(String email, String pass) throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.name("username")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[1]")).click();
		driver.findElement(By.xpath("//span[@class=\"oxd-userdropdown-tab\"]")).click();
		boolean displayed =

				driver.findElement(By.xpath("(//*[@class=\"oxd-text oxd-text--p\"])[1]")).isDisplayed();
		Thread.sleep(5000);
		if (displayed == true) {

			driver.findElement(By.xpath("//*[contains(text(),'Logout')]")).click();
			Assert.assertTrue(true);
		} else {
			Assert.fail();
		}

	}

	@AfterClass
	void testlogout() {
		driver.quit();
	}

	@DataProvider(name = "dp", indices = { 0, 1, 2 })
	Object[][] logindata() {
		Object data[][] = {
				// {"username", "password"},
				{ "Admin", "admin123" }, { "Admi", "admin123" }, { "Admin", "admin123" },

		};
		return data;
	}
}
