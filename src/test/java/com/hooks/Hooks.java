package com.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.baseclass.Baseclass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Baseclass {
	@Before()
	public static void bef() {
		System.out.println("Scenario is started");

	}
	@After()
	public static void aft(Scenario scene) throws InterruptedException {
		Thread.sleep(6000);
		byte[] screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scene.attach(screenshotAs, "image/png","screenshot");
	}

}
