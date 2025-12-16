package com.test;

import java.util.Arrays;

public class CheckStringAnagrams {
	
	public static void main (String[] args) {
		
		String S1 = "Silent";
		String S2 = "Listen";
		
		//Convert String Into Lower case 
		S1 = S1.toLowerCase();
		S2 = S2.toLowerCase();
		
		//Check Two String Length equal 
		if(S1.length() != S2.length()) {
			System.out.println("String Is NOt Anagrams");
			return;
			
		}
		
		// Covert String Into Array
		char[] arr1 = S1.toCharArray();
		char[] arr2 = S2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		//Compare Soreted Array 
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("String Is Anagrams");
		} else {
			System.out.println("String Is NOt Anagrams");
		}
		
	}

}
