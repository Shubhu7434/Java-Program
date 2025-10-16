package com.test;

import java.util.ArrayList;
import java.util.List;

public class Printevenoddarray {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9,10,12,13};
		
		List<Integer> evennumber = new ArrayList<Integer>();
		List<Integer> oddnumber = new ArrayList<Integer>();		
		for(int num : numbers) {
			if(num % 2 ==0) {
				evennumber.add(num);
			} else {
				
				oddnumber.add(num);
			}
		}
		
		System.out.println("Even Number Is:" +evennumber);
		System.out.println("Odd Number Is:" +oddnumber);

		System.out.println("Even Number Count:" +evennumber.size());
		System.out.println("Odd Number Count :" +oddnumber.size());
	}

}
