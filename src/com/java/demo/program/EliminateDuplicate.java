package com.java.demo.program;

import java.util.Arrays;

public class EliminateDuplicate {
	public static void main(String[] args) {
		int[] arr1 = {1,1,2,3,2,3,4,5,6,6,7,8,9,9};
		EliminateDuplicate s1 = new EliminateDuplicate();
		s1.eliminateDuplicate(arr1);
		
	}
	public void eliminateDuplicate(int[] arr1){
		int j =0;
		int[] arr2 = new int[arr1.length];
		Arrays.sort(arr1);
	    System.out.println("The sorted array is: "+Arrays.toString(arr1));
		for(int i=0 ; i<arr1.length - 1 ; i++) {
			if(arr1[i] != arr1[i+1])
			{
				arr2[j] = arr1[i];
				j++;
			}
			
		}
		arr2[j] = arr1[arr1.length - 1];
		System.out.println("the new array is: "+ Arrays.toString(arr2));
		
	}
}

