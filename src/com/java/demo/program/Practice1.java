package com.java.demo.program;

import java.util.Arrays;

public class Practice1 {
	public static void main(String[] args) {
	int[] arr = {1,2,3,4,5,6,7}; 
	copyArr(arr);
	
	}
	public static void copyArr(int[] arr){
		
		int[] cpyarr = new int[arr.length];
		 cpyarr = Arrays.copyOf(arr, arr.length);
		 
		 System.out.println("Original array is: "+ Arrays.toString(arr));
		 cpyarr[0] = 8;
		 System.out.println("Copied array is : "+ Arrays.toString(cpyarr));
		
	}
	}
		