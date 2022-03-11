package com.java.demo.program;

public class CheckNum {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60,70};
		System.out.println(contains(arr,40));
		System.out.println(contains(arr,100));
	}
	public static boolean contains(int[] arr,int item) {
		for(int n : arr) {
			if(n == item) {
				return true;
			}
		}
		return false;
	}

}
