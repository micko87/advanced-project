/**
 *   File Name: AutoBasics.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: May 2, 2016
 *
 */

package com.sqa.MA.util.helpers;

import org.openqa.selenium.*;

import com.sqa.MA.util.helpers.exceptions.*;

/**
 * AutoBasics //ADDD (description of class)
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
public class AutoBasics {

	private static WebDriver driver;

	public static boolean isElementPresent(By locator) throws AutoBasicsNotInitializedException {
		try {
			if (driver == null) {
				throw new AutoBasicsNotInitializedException();
			}
			driver.findElement((locator));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean isElementPresent(WebDriver driver, By locator) {
		try {
			AutoBasics.driver = driver;
			driver.findElement((locator));
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public AutoBasics(WebDriver driver) {
		AutoBasics.driver = driver;

	}

}
