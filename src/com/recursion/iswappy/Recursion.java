package com.recursion.iswappy;

import java.util.Scanner;

public class Recursion {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for which factorial to be find out");
		int num = sc.nextInt(); 
		int x=Factorial(num);
		System.out.println(num +" Factorial is :" + x );
		
	}
	
	public static int Factorial(int num){
		if (num != 0) {
			return num * Factorial(num-1);
			}
		else 
			return 1;
	        }

}
