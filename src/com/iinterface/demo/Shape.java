package com.iinterface.demo;

public interface Shape {
	void area(int area1);
}
 interface Colour{
	void color();
}
class Triangle implements Shape,Colour{
	public void area(int area1) {
		System.out.println("The area of traingle is: "+ area1);
	}	
	public void color() {
		System.out.println("The colour of the triangle is RED..");
	}
}

class Circle implements Shape,Colour{
	public void area(int area1){
		System.out.println("The area of circle is: "+ area1);
	}
	public void color(){
		System.out.println("The colour of the circle is BLUE");
	}
}

class Test3{
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
	    Circle t2 = new Circle();
		t1.area(100);
		t1.color();
		t2.area(200);
		t2.color();
	}
	
}