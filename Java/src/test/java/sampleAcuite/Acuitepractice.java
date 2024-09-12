package sampleAcuite;

import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Acuitepractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://acuitedev.colanonline.net/");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("praveenqa2");
		Thread.sleep(5000);
		WebElement role = driver.findElement(By.xpath("//*[@id=\"role\"]"));
		// role.click();
		Actions a = new Actions(driver);
		a.doubleClick(role).build().perform();
//		Select s = new Select(role);
//		s.selectByValue("Data Associate");
		Thread.sleep(5000);
//
		driver.findElement(By.xpath("//li[@role=\"option\"][2]")).click();
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//button[@class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-colorInherit MuiIconButton-sizeLarge css-e0wi9\"]"))
				.click();
	}
}
