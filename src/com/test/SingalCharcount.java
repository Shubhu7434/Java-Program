package com.test;

public class SingalCharcount {

	public static void main(String[] args) {
		String Str = "Selenium With Java";
		char ch = 'a';
		int count = 0;
		
		for(int i = 0 ;i<Str.length();i++) {
			if(Str.charAt(i)==ch) 
				count++;
			}
		
		System.out.println("Character '"+ ch+ "' Occures " + count + " times.");

	}

}
 
