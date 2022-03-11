package com.java.demo.program;

import java.util.Arrays;

public class CopyDemo {
	public static void main(String[] args) {
		int[] arr1 = {12,23,16,19,24,27,33,40};
		systemDemo(arr1);
		
	}
	public static int[] systemDemo(int[] arr1) {
		
		int[] arr2 = new int[arr1.length];
		int[] arr3 = new int[5];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		arr2[0] = 10;
		System.arraycopy(arr1,2,arr3,1,3);
		
		System.out.println("The new array print will be: "+ Arrays.toString(arr2) );
		System.out.println("The arr3 array is : "+ Arrays.toString(arr3));
		
		return arr2;
	}

}
