package com.mehedi.day01;

public class TestClass extends CodingChallenge {
	public static void main(String[] args) {

		double temp = 103.5;
		double temp2 = 99.9;
		CodingChallenge.day01(); // using static method, calling with class name
		CodingChallenge cc = new CodingChallenge(); // for instance methods
		cc.day0102(temp);
		cc.day0102(temp2);
		cc.day0103(63, 36);
		// leap years 1880 1884 1888 2000 2020 2024
		cc.day0104(1880);
		cc.correctedIsLeapYear(1880);
		cc.day0104(2000);
		cc.correctedIsLeapYear(2000);
		cc.day0104(2024);
		cc.correctedIsLeapYear(2024);
	}

}
