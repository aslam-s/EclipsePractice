package com.take;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		Date d = new Date();
		// System.out.println(d);
		String screenshot = d.toString().replace(" ", "-").replace(":", "-");
		System.out.println(screenshot);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Windows.html");
		String title = driver.getTitle();
		System.out.println(title);
		TakesScreenshot tk = (TakesScreenshot) driver;
		File f = tk.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,
				new File("C:\\Users\\CIPL1593\\eclipse-workspace\\SeleniumClasspractice\\src\\screenshot\\screen.png"));
		driver.quit();
	}
}
