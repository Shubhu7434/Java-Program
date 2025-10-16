package com.test;

public class Arrayevenoddprint {

	public static void main(String[] args) {
		
		int[] numbers = {2,3,4,5,6,7,8,9};
		
		StringBuilder evens = new StringBuilder();
		StringBuilder odds = new StringBuilder();
		
		for(int num : numbers) {
			if(num%2==0) {
				evens.append(num).append(" ");
			} else{
				odds.append(num).append(" ");
			}
		}
		
		System.out.println("Even numbers Is :" +evens);
		System.out.println("Odd numbers Is :" +odds);
		
	}

}
