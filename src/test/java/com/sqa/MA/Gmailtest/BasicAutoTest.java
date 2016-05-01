package com.sqa.MA.Gmailtest;

import org.apache.log4j.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.*;

public class BasicAutoTest {

	static WebDriver driver;
	static Logger logger = Logger.getLogger(BasicAutoTest.class.getName());

	@DataProvider(name = "UserAccountInfo")
	public static Object[][] getData() {
		Object[][] data = { { "mikiastest1@gmail.com", "gunittest1" }, { "mikiastest2@gmail.com", "gunittest2" },
				{ "mikiastest3@gmail.com", "gunittest3" } };
		return data;
	}

	@BeforeClass(enabled = false, groups = "chrome")
	public static void setupChrome() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://gmail.com");
		Thread.sleep(1000);

	}

	@BeforeClass(enabled = true, groups = "firefox")
	public static void setupFirefox() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		Thread.sleep(1000);

	}

	@BeforeClass(enabled = false, groups = "safari")
	public static void setupSafari() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		Thread.sleep(1000);

	}

	@Test(dataProvider = "UserAccountInfo")
	public void test(String username, String password) throws InterruptedException {
		System.out.println("Basic Test: U-" + username + "/P-" + password);
		logger.info("My Information");
		for (int i = 0; i < 1000; i++) {
			logger.info("Debug Message " + i);
			if (i % 5 == 0) {
				logger.fatal("Fatal Message " + i);
			}
			logger.debug("Message Info " + i);

		}

	}
}