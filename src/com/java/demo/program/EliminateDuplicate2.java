package com.java.demo.program;

import java.util.Arrays;

public class EliminateDuplicate2 {
	public static void main(String[] args) {
		int[] array = {1,1,2,3,4,4,5,6,7,7,8,9,9};	
		System.out.println("The length of the array is: "+ array.length);
		eliminateDupli(array);
}
	public static void eliminateDupli(int[] array) {
		int j = 0;
		int[] newarr = new int[array.length];
		for(int i=0 ; i<array.length-1 ; i++) {
			if(array[i] != array[i+1]) {
				newarr[j++] = array[i];
			}
		}
		 newarr[j++] = array[array.length-1]; 
		 
		 System.out.println("The duplicate elminate array is:"+ Arrays.toString(newarr));
	    int[] newarr2 = new int[j];
	    System.arraycopy(newarr, 0, newarr2, 0, j);
	    System.out.println("New arra2 :"+ Arrays.toString(newarr2));
	
	}
	
}