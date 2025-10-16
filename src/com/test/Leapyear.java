package com.test;

public class Leapyear {

	public static void main(String[] args) {
		
		int year = 2028;
		
		if((year % 400 ==0) || (year % 4==0 && year %100 != 0)) {
			System.out.println(year + " Is a Leap year");
			} else {
				System.out.println(year + " Is Not  a Leap year");
			}

	}

}
