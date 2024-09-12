package com.time;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TImesheet {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		Date d = new Date();
		System.out.println(d);
		driver = new ChromeDriver();
		driver.get("https://mycipl.in/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement email = driver.findElement(By.id("login_user"));
		email.sendKeys("aslam.s@colanonline.com");
		WebElement pass = driver.findElement(By.id("login_pwd"));
		pass.sendKeys("Aslam98@");
		WebElement submit = driver.findElement(By.id("login_submit"));
		submit.click();
		Actions a = new Actions(driver);
		//// span[contains(text(),'View Timesheet ')]
		WebElement viewtimesheet = driver.findElement(By.xpath("//*[contains(text(),'View Timesheet ')]/parent::*"));
		a.doubleClick(viewtimesheet).build().perform();
		WebElement Fixedprice = driver.findElement(By.xpath("(//img[@alt=\"image_loading\"])[1]"));
		a.click(Fixedprice).build().perform();
		WebElement Logtime = driver.findElement(By.xpath("(//img[@class=\"log-time\"])"));
		a.click(Logtime).build().perform();
//		Select Selectfrom = new Select(driver.findElement(By.id("tms_pjt")));
//		Selectfrom.selectByVisibleText("Acuite Rating - RAM ");

		WebElement dateclick = driver.findElement(By.id("tms_date"));
		Thread.sleep(3000);
		a.click(dateclick).build().perform();

		WebElement ele = driver.findElement(By.xpath("//div[@class=\"datepick\"]//tr[4]//td[3]"));
		a.click(ele).build().perform();
		Thread.sleep(3000);
		driver.quit();
	}

}
