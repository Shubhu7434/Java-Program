package com.test;

public class Multiplenumber {

	public static void main(String[] args) {
		
	 int a = 5 ;
	 int b = 8 ;
	 int c = 25 ;
	 int d = 15 ;
	 
	 int largest;
	 
	 if(a>b && a>c && a>d) {
		 largest = a;
	 } else if(b>c && b>d) {
		 largest = b;
	 }else if (c>d) {
		 largest = c;
	 } else {
		 largest = d;
	 }
	 
	   System.out.println("largest number is :"+largest);

	}

}
