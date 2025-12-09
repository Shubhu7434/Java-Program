package com.test;

import java.util.HashSet;

public class StringDuplicateCharacter {

	public static void main(String[] args) {

		String str = "welCOME To AuTOmAtIOn";

		str = str.toLowerCase().replace(" ", "");

		HashSet<Character> seen = new HashSet<Character>();
		HashSet<Character> duplicate = new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(!seen.add(ch)) {
				duplicate.add(ch);
			}

		}
		
		System.out.println("Duplicate charters Into String Is:" +duplicate);

	}

}
