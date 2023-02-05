package com.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Baseclass;

public class Loginpage extends Baseclass {
	public Loginpage(WebDriver xdriver) {
		this.driver = xdriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[contains(text(),'Sign in / Sign up')]")
	private WebElement signin;
	
	@FindBy(xpath="(//input[@class='label_input notranslate'])[1]")
	private WebElement username;
	@FindBy(xpath="(//input[@class='label_input notranslate'])[2]")
	private WebElement password;
	
	@FindBy(xpath="//button[@class='theme_btn_normal widget_btn_normal']")
	private WebElement signup;

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignup() {
		return signup;
	}

}
