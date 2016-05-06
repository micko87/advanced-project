/**
 *   File Name: TC105.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: May 2, 2016
 *
 */

package com.sqa.MA.adactin;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
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

	@BeforeClass
	public void setUp() {
		this.driver = new FirefoxDriver();
		this.driver.get(this.baseURL);
	}

	@Test
	public void testLogin() {
		// LoginPage loginPage = new LoginPage(this.driver);
		// loginPage.enterUsername("mikias87")getClass().enterPassword("gunittpain87").login();
		// Assert.assertTrue(loginPage.hasWelcomeMsg());

		Assert.assertTrue(new LoginPage(this.driver).enterUsername("madinochkab").enterPassword("madina261184").login()
				.hasWelcomeMsg());
	}

}
