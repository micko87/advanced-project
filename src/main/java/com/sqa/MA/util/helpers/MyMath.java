/**
 *   File Name: MyMath.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 13, 2016
 *
 */

package com.sqa.ma.util.helpers;

/**
 * MyMath //ADDD (description of class)
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
public class MyMath {

	// A static method which divides one number by another 1/2
	public static double divideNumbers(double num1, double num2) {
		double result = 1;

		for (int i = 0; i < num1; i++) {
			result = num1 / 2;
			// System.out.println(result);
		}

		return result;
	}

	// A static method which let the user know if there is a clean division with
	// no remainder
	public static boolean hasCleanDivision(double num1, double num2) {

		return false;
	}

	// A static method which multiplies a set of numbers
	public static double multNumbers(double... nums) {
		double result = 1;

		for (int i = 0; i < nums.length; i++) {

			result *= nums[i];
			// System.out.println(result);
		}

		return result;
	}

	// A static method which multiplies a given number by the amount
	public static double powerNumber(double number, double power) {
		// Create a variable to hold to final result and setting it to power of
		// 1
		double result;
		if (power > 1) {
			result = 1;
			for (int i = 0; i < power; i++) {

				result *= number;
			}

		} else if (power == 1) {
			result = number;
		} else {
			System.out.println("Power is 0 or below, returning 0");
			result = 1;
		}

		return result;
	}

	private double result;

	/*
	 * A class which gets the total of an instance object of type MyMath Class
	 */

	// Default Constructor
	public MyMath() {
		setResult(0);
	}

	// Argument Constructor, starting value given
	public MyMath(double defaultNum) {
		setResult(defaultNum);
	}

	// To Add a number to total
	public double add(double num) {
		setResult(getResult() + num);
		return getTotal();
	}

	// To divide a number of total
	public double div(double num) {

		setResult(getResult() / num);
		return getTotal();
	}

	/**
	 * @return the result
	 */
	public double getResult() {
		return this.result;
	}

	// To get the current total
	public double getTotal() {
		return 0;
	}

	// To multiply a number to total
	public double mult(double num) {

		setResult(getResult() * num);
		return num;
	}

	// To reset total to 0
	public void reset() {
	}

	/**
	 * @param result
	 *            the result to set
	 */
	public void setResult(double result) {
		this.result = result;
	}

	// To subtract a number from total
	public double sub(double num) {
		return num;
	}

}
