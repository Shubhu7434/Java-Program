package com.test;

public class Evenoddcount {
	
	public static void main(String[] args) {
		
		int [] numbers = {2,4,5,8,9,10,13,15,19,28 , 100};
		
		int evencount = 0;
		int oddcount = 0;
		
		for(int num : numbers) {
			if(num % 2==0) {
				evencount++;
			} else {
				oddcount++;
			}
		}
		
		System.out.println("Even Number Count : " + evencount);
		System.out.println("Odd Number Count : " + oddcount);
	}

}
