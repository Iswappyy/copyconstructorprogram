package com.java.demo.program;

public class CheckPrimeNum {
	public static void main(String[] args){
		   
		int[] arr = {2,3,4,5,6,7,8,9,10,11,12,13,15,17,19,21,23};
		for(int num : arr) {
			if (num == 2 || num == 3 ) {
				System.out.println("The prime numbers are: "+ num);
			}
		}
		primeNum(arr);
	}
public static void primeNum(int[] arr) 
      { 
	    for(int num : arr){
	    if(num % 2 != 0 && num % 3 != 0 ){
	    	
	    int primenum = num;
	    
	    System.out.println("The prime numbers are: "+(num));
	   
	  
	  }	 
}
}
}
	