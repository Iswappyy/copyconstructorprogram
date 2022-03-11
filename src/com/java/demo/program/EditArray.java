package com.java.demo.program;

import java.util.Arrays;

public class EditArray {
	public static void main(String[] args){
		  int[] arr = {2,3,4,6,1,3,4,2,6,7,4,2,5,5};
		  editArr(arr);
		  
		 }
		
		 public static void editArr(int[] arr){
		 int i=0;
		 Arrays.sort(arr);
		  int [] cpyarr = new int[arr.length];
		  for(int num : arr){
		  cpyarr[i] = num * 2;
		  i++;
		 
		    }
		  System.out.println("Sorted array is: "+ Arrays.toString(arr));
		  System.out.println("Edited array is: "+ Arrays.toString(cpyarr));
		 }

}
