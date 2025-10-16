package com.test;

public class StringDivide {

	public static void main(String[] args) {

		String str = "welc0me 2 @#12mati";

		StringBuilder letters   = new StringBuilder();
		StringBuilder numbers = new StringBuilder();
		StringBuilder SPcharacter = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isLetter(ch)) {
				letters.append(ch).append(",");
			} else if (Character.isDigit(ch)) {
				numbers.append(ch).append(" ");
			} else if ( !Character.isWhitespace(ch)) {
				SPcharacter.append(ch);
			}
		}
		
		System.out.println("Letters Is a :"+letters);
		System.out.println("Numbers Is a:" +numbers);
		System.out.println("Special Characters  Is a:" +SPcharacter);

	}

}                                                                                                                                                                       
