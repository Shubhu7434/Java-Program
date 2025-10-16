package com.test;

public class Stringreverse {

	public static void main(String[] args) {
		
		String str = "SeleniumWithJava";
		
		StringBuilder SB = new StringBuilder(str);
		
		String rev = SB.reverse().toString();
		
		System.out.println("Reverse String Is: " +rev);

	}

}
