package com.polymorphism.demo;

public class Animal {

}
class Monkey extends Animal{
	
}
class Test2 {
	public void m1(Animal a) {
		System.out.println("Animal method called...!");
		}
	public void m1(Monkey m) {
		System.out.println("Monkey method called...!");
	}
	
	public static void main(String[] args) {
		Test2 t = new Test2();
		
		Animal a = new Animal();
		t.m1(a);
		
		Monkey m = new Monkey();
		t.m1(m);
		
		Animal a1 = new Animal();
		t.m1(a1);
	}
}
