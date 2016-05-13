/**
 *   File Name: Locator.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 21, 2016
 *
 */

package com.sqa.ma.util.helpers;

import java.util.*;

import org.openqa.selenium.*;

/**
 * Locator //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods) s
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class Locator {

	public static List<WebElement> getByTagName(WebDriver driver, String tagName) {

		// List<WebElement> elements = new ArrayList<WebElement>();
		return driver.findElements(By.tagName(tagName));

	}

	public static List<WebElement> getCSS(WebDriver driver, String cssSelector) {
		return null;

	}

	public static List<WebElement> getLinks(WebDriver driver) {
		return getByTagName(driver, "a");

	}

	public static List<WebElement> getPictures(WebDriver driver) {
		return getByTagName(driver, "img");

	}

	public static List<WebElement> getTextElements(WebDriver driver, String text) {
		return null;

	}

}
