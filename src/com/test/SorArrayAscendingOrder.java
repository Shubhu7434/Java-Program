package com.test;

import java.util.Arrays;

public class SorArrayAscendingOrder {
	
	public static void main (String[] args) {
		int[] arr = {2,5,9,10, 3,15, 25};
		
		System.out.println("Orginal Array: ");
		System.out.println(Arrays.toString(arr));
		
		//Sort Array 
		Arrays.sort(arr);
		
		//Print Array Into Ascending  Order 
		System.out.println("Ascending Order Array : ");
		for(int i = 0 ; i < arr.length ;i++) {
			System.out.print(arr[i] + " ");
		}
 	}

}
