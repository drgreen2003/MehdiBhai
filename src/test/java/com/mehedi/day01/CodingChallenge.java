package com.mehedi.day01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CodingChallenge {

	// Question 1 : Write a Java program to get a
	// number from the user and print
	// whether it is positive or negative.

	public static void day01() {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		String result;

		while (exit == false) {
			System.out.println("insert num(int)starting from 1 or --0 to exit"); // ask for input or exit
			try {

				int input = sc.nextInt();// implicit casting even user put double
				exit = input == 0 ? true : false;
				if (exit == false) {
					System.out.println("you entered : " + input);// as a string (int+string --> string)
					System.out.println(result = (input % 2 == 0) ? "even" : "odd");
				}
			} catch (InputMismatchException e) {
				System.out.println("wrong format");
				break;
			}
		}
		System.out.println("exiting...");
		sc.close();
	}

	public void day0102(double temp) {
		/*
		 * Question 2 : Finish the following code so that it prints You have a fever if
		 * your temperature is above 100 and otherwise prints You don't have a fever.
		 */
		boolean hasFever = temp > 100 ? true : false;
		if (hasFever)
			System.out.println("You have a fever");
		else
			System.out.println("You don't have a fever");
	}

	public void day0103(int a, int b) { // a = 63, b = 36
		boolean x = (a < b) ? true : false;
		System.out.println(x);// x --> false
		int y = (a > b) ? a : b;
		System.out.println(y); // since a > b , y --> a;
	}

	public void day0104(int year) {// not giving corrected result;

		// we use a flag;
		boolean notALeap = true;

		// we will go many checks and make this flag as false, after all the checks if
		// its still ture, we can say its a Leap year.

		// according to the workflow chart provided we need to first check if year is
		// divisible by 4 or not using modulo operator and if remainder is zero we can
		// find that
		if (year % 4 == 0) {
			// if true
			// some more varification needed, another if block
			// to check if the year is divisible by 100 as well:
			// flag is still true;
			if (year % 100 == 0) {
				// if so, we also need to check if its divisible by 400 too be sure of the leap
				// year
				// another nested if is handy here
				// flag is still true
				if (year % 400 == 0) {
					// if so, we can be sure its a leap year
					// flag remains --> true, all conditions met;
				} else {
					// make flag --> false;
					notALeap = false;
				}
			} else {
				// make flag --> false;
				notALeap = false;
			}

		} else {// if all 3 conditions are not met, we conclude its not a leap
				// make flag --> false;
			notALeap = false;
		}
		String result = notALeap == true ? "you entered, " + year + " and Its a leap year !!!"
				: "you entered, " + year + " and Its NOT a leap year";
		System.out.println(result);
	}

	// Question 4 : Write a Java program that takes a year from the user and
	// print whether that year is a leap year or not
	public void correctedIsLeapYear(int year) {

		// logic -->
		// the logic of leap is:
		// its a leap year if its divisible by 4
			// if its not century year(eg.not ending with 100):
		// its a leap year

		// if its a century year: divisible by 100
		// its a leap if its also divisible by 400

		boolean isLeapYear = false;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					isLeapYear = true; // Century year divisible by 400
				}
			} else {
				isLeapYear = true; // Not a century year, but divisible by 4
			}
		}
		String result = isLeapYear == true ? "you entered, " + year + " and Its a leap year !!!"
				: "you entered, " + year + " and Its NOT a leap year";
		System.out.println(result);
	}

}
