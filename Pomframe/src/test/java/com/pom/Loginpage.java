package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	WebDriver driver;

//constructor
	Loginpage(WebDriver driver) {
		this.driver = driver;
	}

	// locator
	By txtuser = By.name("username");
	By txtpass = By.xpath("//input[@placeholder=\"Password\"]");
	By txtlogin = By.xpath("//button[@type=\"submit\"]");

//Action
	public void setusername(String user) {
		driver.findElement(txtuser).sendKeys(user);

	}

	public void setpass(String pass) {
		driver.findElement(txtpass).sendKeys(pass);

	}

	public void clickLogin() {
		driver.findElement(txtlogin).click();
	}
}
