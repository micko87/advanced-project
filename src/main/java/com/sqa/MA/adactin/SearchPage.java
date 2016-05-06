/**
 *   File Name: SearchPage.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: May 2, 2016
 *
 */

package com.sqa.MA.adactin;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;
import org.testng.log4testng.*;

import com.sqa.MA.util.helpers.*;
import com.sqa.MA.util.helpers.exceptions.*;

/**
 * SearchPage //ADDD (description of class)
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
public class SearchPage extends DefaultPage {

	private static Logger logger = Logger.getLogger(DefaultPage.class);

	@FindBy(id = "adult_room")
	private WebElement adultsPerRoom;

	@FindBy(id = "datepick_in")
	private WebElement checkIn;

	@FindBy(id = "datepick_out")
	private WebElement checkOut;

	@FindBy(id = "child_room")
	private WebElement childPerRoom;

	@FindBy(id = "checkout_span")
	private WebElement errorMEsCheckOut;

	@FindBy(id = "checkin_span")
	private WebElement errorMesChekIn;

	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "login")
	private WebElement loginBtn;

	@FindBy(id = "room_nos")
	private WebElement numOfRooms;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "Reset")
	private WebElement resetBtn;

	@FindBy(id = "room_type")
	private WebElement roomType;

	@FindBy(id = "Submit")
	private WebElement submitBtn;

	@FindBy(id = "username_show")
	private WebElement successLogin;

	@FindBy(id = "username")
	private WebElement username;

	public SearchPage() {
		PageFactory.initElements(getDriver(), SearchPage.class);
	}

	public SearchPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(getDriver(), this);
	}

	public SearchPage chooseCheckInDate(String date) {
		this.checkIn.clear();
		this.checkIn.sendKeys(date);
		return this;
	}

	public SearchPage chooseCheckOutDate(String date) {
		this.checkOut.clear();
		this.checkOut.sendKeys(date);
		return this;
	}

	public SearchPage chooseHotel(String hotelChoice) {
		Select selectHotels = new Select(this.hotels);
		selectHotels.selectByValue(hotelChoice);
		return this;
	}

	public SearchPage chooseLocation(String locationChoice) {
		Select selectLocation = new Select(this.location);
		selectLocation.selectByValue(locationChoice);
		return this;
	}

	public SearchPage chooseNumAdultsInRoom(String numInRoom) {
		Select selectAdultsRoom = new Select(this.adultsPerRoom);
		selectAdultsRoom.selectByValue(numInRoom);
		return this;
	}

	public SearchPage chooseNumChildrenInRoom(String numInRoom) {
		Select selectChildrenPerRoom = new Select(this.childPerRoom);
		selectChildrenPerRoom.selectByValue(numInRoom);
		return this;
	}

	public SearchPage chooseNumOfRooms(String numRooms) {
		Select selectNumRooms = new Select(this.numOfRooms);
		selectNumRooms.selectByValue(numRooms);
		return this;
	}

	public SearchPage chooseRoomType(String roomType) {
		Select selectRoomType = new Select(this.roomType);
		selectRoomType.selectByValue(roomType);
		return this;
	}

	public String getCheckOutErrorMessage() {
		if (hasCheckoutErrorMessage()) {
			return this.errorMEsCheckOut.getText();
		} else {
			return "";
		}
	}

	public boolean hasCheckInErrorMessage() {

		boolean hasMessage = false;

		hasMessage = AutoBasics.isElementPresent(getDriver(), By.id("checkin_span"));

		if (hasMessage) {
			if (this.errorMesChekIn.getText().length() > 1) {
				hasMessage = true;
				System.out.println("Message:" + this.errorMesChekIn.getText());
			} else {
				hasMessage = false;
			}

		}

		return hasMessage;
	}

	public boolean hasCheckoutErrorMessage() {

		boolean hasMessage = false;

		hasMessage = AutoBasics.isElementPresent(getDriver(), By.id("checkout_span"));

		if (hasMessage) {
			if (this.errorMEsCheckOut.getText().length() > 1) {
				hasMessage = true;
				System.out.println("Message:" + this.errorMEsCheckOut.getText());
			} else {
				hasMessage = false;
			}

		}

		return hasMessage;
	}

	public boolean hasWelcomeMsg() {
		try {
			AutoBasics.isElementPresent(getDriver(), By.cssSelector("td.welcome_menu"));
			return AutoBasics.isElementPresent(By.cssSelector("td.welcome_menu"));
		} catch (AutoBasicsNotInitializedException e) {
			// TODO Auto-generated catch block
			getLogger().warn(e.getMessage());
			return false;
		}
	}

	public SearchPage reset() {
		this.resetBtn.click();
		return this;

	}

	public SearchPage submit() {
		this.submitBtn.click();
		;
		return this;
	}
}
