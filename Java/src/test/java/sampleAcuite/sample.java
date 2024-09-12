package sampleAcuite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class sample {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

//		driver.findElement(By.xpath("//a[text()='Login']/parent::div")).click();
//		Thread.sleep(5000);
//		WebElement sk = driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
//		Thread.sleep(5000);
//		sk.sendKeys("9003831782");
//		JavascriptExecutor j = (JavascriptExecutor) driver;
//		j.executeAsyncScript("argument[0],value='9003831782'", sk);

//		driver.findElement(By.xpath("//button[contains(text(),'Request OTP')]/parent::div")).click();
//		driver.findElement(By.xpath("//button[contains(text(),'Verify')]/parent::form")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("iphone14");
//		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']/parent::div"))
//				.sendKeys("//div[contains(text()"
//						+ ",'Apple iPhone 14 (Purple, 128 GB)')]/parent::div/parent::div[@class=\"yKfJKb row\"]/child::div[@class=\"col col"
//						+ "-5-12 BfVC2z\"]/descendant::div[@class=\"Nx9bqj _4b5DiR\"]");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

//		driver.findElement(By.xpath("//*[contains(text(),'Apple iPhone 14 Plus (Blue, 128 GB)')]/parent:"
//				+ ":div/parent::div/child::div[@class=\"col col-5-12 BfVC2z\"]/descendant::div[@class=\"Nx9bqj _4b5DiR\"]"))
//				.click();
		driver.findElement(By.xpath(
				"//div[contains(text(),'₹89,999')]/parent::div[@class=\"hl05eU\"]/ancestor::div[@class=\"yKfJKb row\"]/child::div[@class=\"col col-7-12\"]/descendant::div[contains(text(),'Apple iPhone 14 (Yellow, 512 GB)')]"))
				.click();
		Thread.sleep(5000);

		String Exp = "Apple iPhone 14 Plus (Blue, 128 GB)";
		WebElement act = driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone 14 (Yellow, 512 GB)')]"));
		System.out.println(act.getText());

		// Assert.assertEquals(Exp, act);
		if (act.equals(Exp)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
		driver.quit();
	}
}
