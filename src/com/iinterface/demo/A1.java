package com.iinterface.demo;

public interface A1 {
    public abstract void m1();
}
 interface A2 {
	public abstract void m2();
}
 
 interface A3 extends A1,A2{
	public abstract void m3();
	  
 }
 
 class B1 implements A3 {

	@Override
	public void m1() {
		System.out.println("Method m1 called ..!");
		
	}

	@Override
	public void m2() {
		System.out.println("Method m2 called ..!");
		
	}

	@Override
	public void m3() {
		System.out.println("Method m3 called ..!");
		
	}
	 
 }
 class Test5{
	 public static void main(String[] args) {
		B1 obj1 = new B1();
		obj1.m1();
		obj1.m2();
		obj1.m3();
	}
 }