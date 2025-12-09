package com.test;

import java.util.Arrays;

public class SortArrayDescendingOrder {
	
public static void main (String[] args){
	
	int[] arr = { 2,45 , 4, 12 , 35 , 8};
	
	System.out.println("Orginal Array: ");
	System.out.println(Arrays.toString(arr));
   
	//Sort Array 
	Arrays.sort(arr);
	
	//Print Array Into Descending  Order 
   System.out.println("Array Into Descending Order:");
   for(int i = arr.length-1 ; i >= 0 ; i-- ) {
	   System.out.print(arr[i] + " ");
   }
	   
}

}
