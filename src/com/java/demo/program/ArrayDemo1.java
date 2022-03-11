package com.java.demo.program;

import java.util.Arrays;

public class ArrayDemo1 {
	public static void main(String[] args) {
	int[] arr = {32,34,44,56,61,31,43,44,29,47};
	secondSmallandLarge(arr);
	}
	public static void secondSmallandLarge(int[] arr) {
		
		Arrays.sort(arr);
		System.out.println("The sorted array is: "+ Arrays.toString(arr));
		int index = arr.length-9;
		while(arr[index] == arr[arr.length-1]) {
			index--;
		}
		
		System.out.println("The second highest number is: "+arr[arr.length-2]);
		System.out.println("The second smallest number is: "+arr[index]);
		
		
	}
}

