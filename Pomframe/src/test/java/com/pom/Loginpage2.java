package com.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage2 {
	WebDriver driver;

//constructor
	Loginpage2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//locator
	@FindBy(name = "username")
	WebElement txtuser;
	@FindBy(name = "password")
	WebElement txtpass;
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement txtlogin;

	@FindBy(tagName = "a")
	List<WebElement> links;

//Action
	public void setusername(String user) {
		txtuser.sendKeys(user);

	}

//	public void thr() throws InterruptedException {
//		Thread.sleep(5000);
//		
//		
//
//	}

	public void setpass(String pass) {
		txtpass.sendKeys(pass);

	}

	public void clickLogin() {
		txtlogin.click();
	}
}
