package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {

	public static WebDriver driver;

	public static void browserlaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\HP\\eclipse-workspace\\Swaglabs_demo\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}

	}

	public static void url(String value) {
		driver.get(value);

	}

	public static void usernme(WebElement element, String value1) {
		element.sendKeys(value1);

	}

	public static void password(WebElement element, String value2) {
		element.sendKeys(value2);
	}

	public static void isclick(WebElement element) {
		element.click();

	}
	public static  void dropdown(WebElement element,String h) {
		Select s = new Select(element);
		

	}
	public static void sendkeys(WebElement element,int s) {
		element.sendKeys(String.valueOf(s));

	}

}
