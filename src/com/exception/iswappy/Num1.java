package com.exception.iswappy;

public class Num1 {
    int x = 888;
}
class Num2 extends Num1{
	int x  = 999;
}

class Test2{
	public static void main(String[] args) {
		Num1 o1 = new Num1();
		System.out.println(o1.x);
		
		Num2 o2 = new Num2();
		System.out.println(o2.x);
		
		Num1 o3 = new Num2();
		System.out.println(o3.x);
	}
}