package com.java.demo.program;

import java.util.Arrays;

public class EliminateDuplicate3 {
	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,3,4,5,6,7,7,8,8,9,9};
		
		eliminateDupliByContinue(arr);

	}
	public static void eliminateDupliByContinue(int[] arr) {
		int j = 0;
		int[] newarr = new int[arr.length];
		for(int i=0 ; i< arr.length-1 ; i++) {
			if(arr[i] == arr[i+1]) {
				continue;	
			}
			newarr[j] = arr[i];
			j++;
		}
		newarr[j++] = arr[arr.length-1]; 
		int[] newarr2 = new int[j];
		System.arraycopy(newarr, 0, newarr2, 0, j);
		System.out.println("The new array after elimination of duplicate is: "+ Arrays.toString(newarr2));
	}
}
