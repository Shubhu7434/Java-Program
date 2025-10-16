package com.test;

public class Reversenumberstring {

	public static void main(String[] args) {
		 int num = 2345679;
		 
		 String str = String.valueOf(num);
		 
		 String reversed = new StringBuilder(str).reverse().toString();
        
		 String result = String.join(",",reversed.split(""));
         
         System.out.println("Reversed Number :" + result);
	}

}
