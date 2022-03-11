package com.iswappy.inheritance;

public class P {
	public void m1() {
		System.out.println("Parent method get called..!");
	}
}
class C extends P{
	public void m2() {
		System.out.println("Child method get called..!");
	}
}
class A {
	public static void main(String[] args) {
		P obj1 = new P();
		obj1.m1();
		//obj1.m2();   not get executed..
		
		C obj2 = new C();
		obj2.m1();
		obj2.m2();
		
		P obj3 = new C();   // parents reference can hold child object..
		obj3.m1();     // it compile only reference type only....not compile time...
		//obj3.m2();
 	}
}