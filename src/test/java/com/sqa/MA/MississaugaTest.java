package com.sqa.MA;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MississaugaTest {

	static String baseURL = "http://www.mississauga.ca";

	@Test(dataProvider = "mississaugaData")
	public void f(Integer n, String s) throws InterruptedException {
		WebElement cityHallBtn;
		WebElement jobsAndCareers;

		WebDriver driver = new FirefoxDriver();
		driver.get(this.baseURL);

		cityHallBtn = driver.findElement(By.id("tnNavHall"));
		jobsAndCareers = driver.findElement(By.linkText("Jobs & Careers"));

		Actions hover = new Actions(driver);
		hover.moveToElement(cityHallBtn);
		hover.moveToElement(jobsAndCareers);
		hover.click().build().perform();
		Thread.sleep(2000);
		if (elementIsPresent(driver, By.className("fsrCloseBtn"))) {
			driver.findElement(By.className("fsrCloseBtn")).click();
			// cityHallBtn.click();
		}
		// jobsAndCareers.click();
		WebElement curEmpOpp = driver.findElement(By.cssSelector("a.navItem.level2"));
		curEmpOpp.click();
		Thread.sleep(5000);

		driver.switchTo().frame("icims_content_iframe");
		WebElement dropDown = driver.findElement(By.id("iCIMS_SortSelect"));
		Thread.sleep(3000);
		Select dropDownSelect = new Select(dropDown);
		System.out.println("Options:" + dropDownSelect.getOptions());

	}

	@DataProvider
	public Object[][] mississaugaData() {
		return new Object[][] { new Object[] { 1, "a" } };
	}

	/**
	 * @param className
	 * @return
	 */
	private boolean elementIsPresent(WebDriver driver, By element) {
		try {
			driver.findElement(element);
			return true;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		return false;
	}
}
