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
	public void HotelSearchTest() throws InterruptedException {

		UserLoginTest();

		Select select = new Select(this.driver.findElement(By.id("location")));
		select.selectByVisibleText("Sydney");
		Thread.sleep(1000);

		Select select1 = new Select(this.driver.findElement(By.id("hotels")));
		select1.selectByVisibleText("Hotel Creek");
		Thread.sleep(1000);

		Select select2 = new Select(this.driver.findElement(By.id("room_type")));
		select2.selectByVisibleText("Standard");
		Thread.sleep(1000);

		Select select3 = new Select(this.driver.findElement(By.id("room_nos")));
		select3.selectByVisibleText("2 - Two");
		Thread.sleep(1000);

		this.driver.findElement(By.id("datepick_in")).clear();
		this.driver.findElement(By.xpath("//input[@id='datepick_in']")).sendKeys("08/05/2016");
		Thread.sleep(1000);

		this.driver.findElement(By.xpath("//input[@id='datepick_out']")).clear();
		this.driver.findElement(By.xpath("//input[@id='datepick_out']")).sendKeys("10/05/2016");
		Thread.sleep(1000);

		Select select4 = new Select(this.driver.findElement(By.id("adult_room")));
		select4.selectByVisibleText("1 - One");
		Thread.sleep(1000);

		this.driver.findElement(By.id("Submit")).click();
		Thread.sleep(1000);

		WebElement message = this.driver.findElement(By.className("login_title"));
		String expectedResult = "Select Hotel";
		Assert.assertEquals(message.getText(), expectedResult);

	}

	@Test
	public void SelectHotelOption() {

		this.driver.findElement(By.id("radiobutton_0")).click();
		this.driver.findElement(By.id("continue")).click();

	}

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {

		this.driver = new FirefoxDriver();
		this.baseUrl = "http://www.adactin.com/HotelAppBuild2//";

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

	}

}
