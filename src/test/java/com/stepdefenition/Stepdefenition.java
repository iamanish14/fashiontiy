package com.stepdefenition;

import org.openqa.selenium.interactions.SendKeysAction;

import com.baseclass.Baseclass;
import com.pageobjectmanager.Pom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Stepdefenition extends Baseclass {
	Pom obj = new Pom(driver);

	@Given("user launch the {string} browser")
	public void user_launch_the_browser(String string) {
		browserlaunch(string);

	}

	@Given("user click the signin page")
	public void user_click_the_signin_page() {
		isclick(obj.getLoginn().getSignin());

	}

	@Given("user navigate to the url {string}")
	public void user_navigate_to_the_url(String string) {
		url(string);
	}

	@Given("user enter the email as {string}")
	public void user_enter_the_email_as(String string) {
		usernme(obj.getLoginn().getUsername(), string);

	}

	@Given("user enter the password as {string}")
	public void user_enter_the_password_as(String string) {
		password(obj.getLoginn().getPassword(), string);

	}

	@Then("user enter click the signin button")
	public void user_enter_click_the_signin_button() {
		isclick(obj.getLoginn().getSignup());

	}
         
}