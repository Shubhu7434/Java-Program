package com.test;

import java.util.HashSet;

public class Duplicateelementarray {
	
	public static void main(String[] args) {
		
		int[] arr = {2, 3, 5, 1, 2, 3, 6, 8, 9, 3, 4, 9, 10, 15, 10};
		
		HashSet<Integer> seen = new HashSet<Integer>();
		HashSet<Integer> Duplicate = new HashSet<Integer>();
		
		for(int num : arr) {
			
			if(!seen.add(num)) {
				Duplicate.add(num);
			}
			
		}
		
		System.out.println("Duplicate element Is:" + Duplicate);
	}

}
