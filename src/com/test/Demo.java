package com.test;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		int[] numbers = { 1, 20, 31, 4, 52, 6, 7, 85, 9, 10, 12, 13, 15, 34, 32, 67 };
		
		System.out.println("Orginal Array: ");
		System.out.println(Arrays.toString(numbers));
		
		//Sort Array Into Descending order 
		Arrays.sort(numbers);
		
		//print array into descending order 
		System.out.println("Array Into decinding Order: ");
		 for(int i = numbers.length-1 ; i >= 0 ; i--) {
			 System.out.print(numbers[i] + " ");
		 }

		 
	}

}
