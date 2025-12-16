package com.test;

import java.util.Arrays;

public class ArrayMovesZeroToEnds {

	public static void main(String[] args) {
		
		int[] arr = { 2,4,8,1,6,5};
		int index = 0;
		
		//Move Not Zero Element At The Front 
		for(int i = 0 ; i< arr.length ; i++) {
			if(arr[i] != 0) {
				arr[index++] = arr[i];
			}
		}
		
		//Fill Reaming Positions with  Zero 
		while(index < arr.length) {
			arr[index++] = 0;
		}
		System.out.println(Arrays.toString(arr));
}

}
