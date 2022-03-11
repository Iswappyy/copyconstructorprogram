package com.java.demo.program;

public class Parent {
	public void m1() {
		System.out.println("Private m1 method get called:Parent ");
	}
	protected void m2() {
		System.out.println("Protected m2 method get called:Parent ");
	}
}
 class Child extends Parent{
	     public void m1() {
		 System.out.println("Private m1 method get called:Child");
	 }
	protected void m2() {
		System.out.println("Protected m2 method get called:Child");
	}
}
class main{
	public static void main(String[] args) {
		Parent p = new Parent();
		Parent p1 = new Child();
		p.m1();
		p.m2();
		p1.m1();
		p1.m2();
	}
}