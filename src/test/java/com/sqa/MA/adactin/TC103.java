package com.sqa.MA.adactin;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.*;

import com.sqa.ma.util.helpers.*;

public class TC103 {

	@Test(enabled = false)
	public void cookiesPractice() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://msn.com");
		AutoBasics.deleteCookies(driver);
	}

	@Test
	public void mavenPropsPractice() {
		System.out.println("Practice with Properties");
		System.out.println("Username:" + System.getProperty("username"));
		System.out.println("Password:" + System.getProperty("Password"));

	}

	@Test(enabled = false)
	public void screenshotPractice() {
		boolean shouldTakeSC = true;
		WebDriver driver = new FirefoxDriver();
		driver.get("http://mtv.com");
		AutoBasics.toTakeScreenshot(driver, "logs/captures/screenshot1.png", false);
		driver.get("http://msn.com");
		AutoBasics.toTakeScreenshot(driver, "logs/captures/screenshot2.png", true);
		driver.get("http://yahoo.com");
		AutoBasics.toTakeScreenshot(driver, "logs/captures/screenshot3.png");
	}

	@Test(enabled = false)
	public void ternaryPractice() {

		int largeCup = 67;
		int smallCup = 89;

		System.out.println("The small cup");
		if (smallCup > 50) {
			System.out.println("is hot!");
		} else {
			System.out.println("Is cold....");
		}

		// Creat same snippet using ternary operator
		String message = "";

		message = largeCup > 70 ? " is hot!" : "it cold..";

		// Print message
		System.out.println("The large cup " + message);
	}

}
