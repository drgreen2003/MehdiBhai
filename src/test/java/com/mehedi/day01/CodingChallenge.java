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
			}catch(InputMismatchException e) {
				System.out.println("wrong format");
				break;
			}
		}
		System.out.println("exiting...");
		sc.close();
	}
}
