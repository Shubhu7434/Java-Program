package com.test;

public class Printarraynumber {

	public static void main(String[] args) {
		
		int [] numbers = { 2,3,4,5,6,7,8,9};
		
		System.out.print("even number is:");
		for(int num : numbers) {
			if(num%2==0) {
				System.out.print(num+ " ");
			} 
		}
		
		System.out.println(); 
		
		System.out.print("Odd number is:");
		for(int num : numbers) {
			if (num % 2 !=0) {
				System.out.print(num+ " ");
			}
		}
		
	}
	
	

}
