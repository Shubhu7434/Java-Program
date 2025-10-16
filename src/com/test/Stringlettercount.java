package com.test;

import java.util.HashMap;

public class Stringlettercount {

	public static void main(String[] args) {
		
		
		String str = " Welcome To Baramati";
		
		str  = str.toLowerCase().replace(" ", "");
		
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		
		for(int i = 0 ; i<str.length();i++) {
			char ch = str.charAt(i);
			
			charCount.put(ch, charCount.getOrDefault(ch,0)+1);
			
		}
		
		for(char c :charCount.keySet()) {
			System.out.println("Character '" +c+ "' Occures '" +charCount.get(c)+ "' times");
		}
			
				

	}

}
