package com.test;

public class Arraysum {

	public static void main(String[] args) {
		
		int[] numbers = {2,3,4,5,10,45,99};
		
		int sum = 0 ;
		
		for(int num : numbers) {
			sum += num;
		}
		
		System.out.println("Sum Of Numbers Is :" + sum);

	}

}
