package com.test;

public class Lettercount {

	public static void main(String[] args) {
		
		String str = "wElcOME to AUTOMAtIon";
		
		int Uppercount = 0;
		int Lowercount = 0;
		
		for(int i = 0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				Uppercount++;
			} else if(Character.isLowerCase(ch)) {
				Lowercount++;
			}
		}
		
		System.out.println("Uppercase Count :"+Uppercount);
		System.out.println("Lowercase Count :"+Lowercount);

	}

}                                        
