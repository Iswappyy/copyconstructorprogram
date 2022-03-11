package com.polymorphism.demo;

public class Helper {
	
	public static int multiplication(int a, int b) {
		return a * b;
	}
	public static double multiplication(double a,double b) {
		return a * b;
	}

}
class Test{
	public static void main(String[] args) {
		int x = Helper.multiplication(12,14);
		double y = Helper.multiplication(12.7,14.5);
		System.out.println("the multiplication of two num is: "+ x);
		System.out.println("the multiplication of two num is: "+ y);
	}
}
 