package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Basepage {

	public Loginpage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	WebElement myaccclick;
	@FindBy(xpath = "(//a[contains(text(),'Register')])[1]")
	WebElement regclick;
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	WebElement loginclick;
	@FindBy(name = "email")
	WebElement uname;
	@FindBy(name = "password")
	WebElement upass;
	@FindBy(xpath = "//input[@value=\"Login\"]")
	WebElement lbtn;
	@FindBy(xpath = "(//a[contains(text(),'Logout')])[2]")
	WebElement logoutbtn;

	public void clickmyacclick() {
		myaccclick.click();
	}

	public void clcikregclick() {
		regclick.click();
	}

	public void clickloginclick() {
		loginclick.click();
	}

	public void Setlogin(String user) {
		uname.sendKeys(user);

	}

	public void Setpass(String lpass) {
		upass.sendKeys(lpass);

	}

	public void btnlogin() {
		lbtn.click();

	}

	public void btnlogout() {
		logoutbtn.click();

	}
}
