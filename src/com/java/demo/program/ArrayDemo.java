package com.java.demo.program;

public class ArrayDemo {
	public static void main(String[] args) {
		int mark[] = {87,88,75,96,81,90,77};
		avgSum(mark);
	}
	public static void avgSum(int[] mark) {
		int sum = 0;
		double avg = 1;
		for(int score : mark) {
			sum = sum + score;
			avg = (double)sum/7;
		}
		System.out.println("The sum of the marks is: "+ sum);
		System.out.println("The avarage of the marks is: "+ avg);
	}
	
	}
	

