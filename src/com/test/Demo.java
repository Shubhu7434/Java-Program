package com.test;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 15, 34, 32, 67 };

		//List<Integer> evennumber = new ArrayList<Integer>();
		//List<Integer> oddnumber = new ArrayList<Integer>();
		
		StringBuilder evennumber = new StringBuilder();
		StringBuilder oddnumber = new StringBuilder();

		for (int num : numbers) {
          
	      if(num % 2 ==0) {
	    	  evennumber.append(num).append(" ");
	      } else {
	    	  oddnumber.append(num).append(" ");
	      }
		}
		
		System.out.println("Even Numbers : " + evennumber);
		System.out.println("Odd Numbers : " + oddnumber);
		
		//System.out.println("Even Numbers Count : " + evennumber.size());
		//System.out.println("Odd Numbers Count : " + oddnumber.size());
	}

}
