package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListArrayDecnedingOrder {
	
	public static void main ( String[] args) {
		List<Integer> numbers = Arrays.asList(10,2,4,39,12,17,3);
		
		List<Integer> sortList = numbers.stream().sorted(Collections.reverseOrder()).toList();
		
		System.out.println("Arrays Into Descending Order:" +sortList);
		                         
		
	}

}
