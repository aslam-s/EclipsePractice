package paraamtert;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paramterclass {
	WebDriver driver;

	@BeforeClass
	@Parameters({ "browser", "url" })
	void setup(String br, String url) {

		switch (br.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("invalid browser");
			return;

		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
	}

	@BeforeMethod
	void befdate() {
		Date d = new Date();

		System.out.println("Before Execution time " + d);
	}

	@AfterMethod
	void afdate() {
		Date d = new Date();

		System.out.println("After Execution time " + d);
	}

	@Test(priority = 1)

	void testlogo() throws InterruptedException {
		Thread.sleep(5000);
		boolean dis = driver.findElement(By.xpath("//*[@alt=\"company-branding\"]")).isDisplayed();
		Assert.assertEquals(dis, true);
	}

	@Test(priority = 2, dependsOnMethods = "testlogo")
	void testtitle() throws InterruptedException {
		String title = driver.getTitle();
		Thread.sleep(3000);

		Assert.assertEquals(title, "OrangeHRM");
	}

	@Test(priority = 3)
	void testurl() {
		String curl = driver.getCurrentUrl();
		Assert.assertEquals(curl, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterClass
	void broclose() {
		driver.quit();
	}
}
