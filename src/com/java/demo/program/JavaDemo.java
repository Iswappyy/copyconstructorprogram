package com.java.demo.program;
import java.util.Arrays;

public class JavaDemo {
     public static void main(String[] args) {
		int[] arr = {2,3,4,7,9,3,7,7,9,10};
		System.out.println("The Original Array is: "+ Arrays.toString(arr));
		removeNum(arr);
	}
     public static void removeNum(int[] arr) {
    	 int[] copyarr = new int[arr.length];
    	 Arrays.sort(arr);
    	 System.out.println("The Sorted Array is: "+ Arrays.toString(arr));
    	 
    	 copyarr = Arrays.copyOf(arr, arr.length);
    	       
    	 
    	 for(int i = 3 ; i< arr.length-2 ; i++) {
    		 copyarr[i] = copyarr[i+1];
    		
    		 }	
    		 System.out.println("The Arrays with remove number: "+ Arrays.toString(copyarr)); 
    		 System.out.println("The Copied Array: "+ Arrays.toString(copyarr));	 
    	 }
     }

