package com.test;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortDescendingOrder {
	
	public static void main ( String[] args) {
		
		ArrayList<Integer> number = new ArrayList<>();
		number.add(2);
		number.add(5);
		number.add(20);
		number.add(24);
		number.add(12);
		number.add(30);
		
		Collections.sort(number , Collections.reverseOrder());
		
		System.out.println("Descending Order Array:" +number);
		
	}

}
