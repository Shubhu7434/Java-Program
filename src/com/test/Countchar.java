package com.test;

public class Countchar {
	
	public static void main(String[] args) {
		String str = "Welcome To Automation";

		int Charcount = str.length();
		
		int withoutspacecount = str.replace(" ", "").length();
		
		System.out.println("Total Characters (With Space):" +Charcount);
		System.out.println("Total Characters (Without Space):" +withoutspacecount);
		
	}

}
