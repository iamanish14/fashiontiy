package com.pageobjectmanager;



import org.openqa.selenium.WebDriver;

import com.baseclass.Baseclass;

import com.locators.Loginpage;

public class Pom extends Baseclass {
	public Pom(WebDriver xdriver) {
		this.driver = xdriver;

	}

	private Loginpage loginn;

	public Loginpage getLoginn() {
		if (loginn == null) {
			loginn = new Loginpage(driver);
		}
		return loginn;
	}

}
