package com.sqa.MA;

import java.util.concurrent.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.*;
import org.testng.*;
import org.testng.annotations.*;

public class UserLoginTest {

	private String baseUrl;
	private WebDriver driver;

	@Test
	public void HotelSearchTest() {

		UserLoginTest();

		Select select = new Select(this.driver.findElement(By.id("location")));
		select.selectByVisibleText("Sydney");

		Select select1 = new Select(this.driver.findElement(By.id("hotels")));
		select1.selectByVisibleText("Hotel Creek");

		Select select2 = new Select(this.driver.findElement(By.id("room_type")));
		select2.selectByVisibleText("Standard");

		Select select3 = new Select(this.driver.findElement(By.id("room_nos")));
		select3.selectByVisibleText("1 - One");

		this.driver.findElement(By.xpath("//input[@id='datepick_in']")).clear();
		this.driver.findElement(By.xpath("//input[@id='datepick_in']")).sendKeys("06/05/2016");

		this.driver.findElement(By.xpath("//input[@id='datepick_out']")).clear();
		this.driver.findElement(By.xpath("//input[@id='datepick_out']")).sendKeys("11/05/2016");

	}

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {

		this.driver = new FirefoxDriver();
		this.baseUrl = "http://adactin.com/HotelApp/index.php";

		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public void UserLoginTest() {

		this.driver.get(this.baseUrl);
		this.driver.findElement(By.id("username")).clear();
		this.driver.findElement(By.id("username")).sendKeys("mikias87");
		this.driver.findElement(By.id("password")).clear();
		this.driver.findElement(By.id("password")).sendKeys("gunittpain87");
		this.driver.findElement(By.id("login")).click();

		WebElement message = this.driver.findElement(By.className("welcome_menu"));
		String expectedResult = "Welcome to AdactIn Group of Hotels";

		Assert.assertEquals(message.getText(), expectedResult);

	}

}
