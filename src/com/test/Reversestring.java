package com.test;

public class Reversestring {

	public static void main(String[] args) {

		String str = "Shubhu";
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}

		System.out.println("Reverse String :" + rev);

	}

}
