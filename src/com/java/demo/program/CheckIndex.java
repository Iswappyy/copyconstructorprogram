package com.java.demo.program;

public class CheckIndex {
	public static void main(String[] args) {
		int arr[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		System.out.println("Index position of 25 is: " +myIndex(arr, 14));
	    System.out.println("Index position of 77 is: " + myIndex(arr, 77));
		
	}
	public static int myIndex(int arr[] ,int t) {
		int i=0;
		if(arr == null){
			return -1;	
		}
		while(i < arr.length) {
			if(arr[i] == t)
				return i;
			else
				i++;
		}
		return -1;
		
	}

}
