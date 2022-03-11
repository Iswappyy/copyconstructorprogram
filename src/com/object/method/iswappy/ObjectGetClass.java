package com.object.method.iswappy;

public class ObjectGetClass {
      public static void main(String[] args) {
		Object obj1 = new Object();
		System.out.println("The class name of Object is : "+ obj1.getClass());
		
		String obj2 = new String();
		System.out.println("The class name of String is : "+ obj2.getClass());
		
		ObjectGetClass obj3 = new ObjectGetClass();
		System.out.println("The class name of user class is : "+ obj3.getClass());
		
		
	}
}
