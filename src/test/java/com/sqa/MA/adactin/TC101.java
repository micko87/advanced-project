/**
 *   File Name: TC105.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: May 2, 2016
 *
 */

package com.sqa.ma.adactin;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.safari.*;
import org.testng.*;
import org.testng.annotations.*;

/**
 * TC105 //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class TC101 {

	private static String baseURL = "http://adactin.com/HotelAppBuild2";

	private static WebDriver driver;

	@BeforeClass(groups = { "chrome" })
	public void setUpChrome() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		this.driver = new ChromeDriver();
		this.driver.get(this.baseURL);
	}

	@BeforeClass(groups = { "firefox" })
	public void setUpFirefox() {
		this.driver = new FirefoxDriver();
		this.driver.get(this.baseURL);
		/*
		 * Properties props = System.getProperties(); for (Object prop :
		 * props.keySet()) { System.out.println(prop + " := " +
		 * props.getProperty((String) prop)); }
		 */
	}

	@BeforeClass(groups = { "safari" })
	public void setUpSafari() {
		System.setProperty("webdriver.safari.driver", "drivers/safari");
		this.driver = new SafariDriver();
		this.driver.get(this.baseURL);
	}

	@Test(groups = { "firefox", "chrome", "safari" })
	public void testLogin() {
		Assert.assertTrue(new LoginPage(this.driver).enterUsername("mikias87").enterPassword("gunittpain87").login()
				.hasWelcomeMsg());
	}
}