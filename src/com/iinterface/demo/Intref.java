package com.iinterface.demo;

public interface Intref {
	 
	public abstract void m1();

}
    interface School{
	public abstract void m1();
}
class Internship implements Intref,School{

	
	public void m1() {
		System.out.println("In this method we have to provide implimentations");
	}
	
}
class Test1 {
	public static void main(String[] args) {
		Internship obj1 = new Internship();
		obj1.m1();
		
	}
}
