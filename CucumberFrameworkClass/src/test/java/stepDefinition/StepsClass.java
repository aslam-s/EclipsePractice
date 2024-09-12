package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageobject.Loginpage;

public class StepsClass {
	public static WebDriver driver;

	@Given("user have to launch browser")
	public void user_have_to_launch_browser() {
		driver = new ChromeDriver();

	}

	@When("user have to open url")
	public void user_have_to_open_url() {
		driver.get(" https://tutorialsninja.com/demo/");
	}

	@When("user have to maximize browser")
	public void user_have_to_maximize_browser() {
		driver.manage().window().maximize();
	}

	@Then("user have to verify the url")
	public void user_have_to_verify_the_url() {
		String curl = driver.getCurrentUrl();
		Assert.assertEquals(curl, "https://tutorialsninja.com/demo/");
	}

	@When("user have to write code for waits")
	public void user_have_to_write_code_for_waits() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

//	@When("user have to enter valid credential username and password")
//	public void user_have_to_enter_valid_credential_username_and_password(String user, String password) {
//		Loginpage lp = new Loginpage(driver);
//		lp.clickmyacclick();
//		lp.clickloginclick();
//		lp.Setlogin(user);
//		lp.Setpass(password);
//		lp.btnlogin();
//
//	}

	@When("user have to enter valid credential {string} and {string}")
	public void user_have_to_enter_valid_credential_and(String user, String password) {
		Loginpage lp = new Loginpage(driver);
		lp.clickmyacclick();
		lp.clickloginclick();
		lp.Setlogin(user);
		lp.Setpass(password);
		lp.btnlogin();
	}

	@Then("user have to verify the Homepage")
	public void user_have_to_verify_the_homepage() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "My Account");
	}

	@When("user have to click logout button")
	public void user_have_to_click_logout_button() {
		Loginpage lp = new Loginpage(driver);
		lp.btnlogout();

	}

	@When("close browser")
	public void close_browser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		System.out.println("Browser close");
	}

}
