package com.object.method.iswappy;

public class ObjectHashcode {
	public static void main(String[] args) {
		//String name = "a";
		Object o1 = new Object();
		
		Object o2 = o1;
		
		System.out.println(o1.equals(o2));
		
		System.out.println("The Hashcode of Object 1 is:"+ o1.hashCode());
		System.out.println("The Hashcode of Object 1 is:"+ o2.hashCode());
		
//		Object o2 = new Object();
//		System.out.println("The Hashcode of Object 2 is:"+ o2.hashCode());
//		
//		String s1 = new String();
//		System.out.println("The Hashcode of String 1 is:"+ name.hashCode());
	}
	

}
