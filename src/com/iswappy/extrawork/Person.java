package com.iswappy.extrawork;

public class Person {
       String name;
       int age;
       
       public Person(String name , int age) {
    	   this.name = name;
    	   this.age = age;   
       }
       
}
class Student extends Person{
	int roll_no;
	int mark;
	
	public Student(String name,int age,int roll_no,int mark) {
		super(name,age);
		this.roll_no = roll_no;
		this.mark = mark;
	}
}
class Main{
	public static void main(String[] args) {
		Student s1 = new Student("Rahul",28,444,84);
		System.out.println("The name of the student is: "+ s1.name);
		System.out.println("The age of the student is: "+ s1.age);
		System.out.println("The roll_no of the student is: "+ s1.roll_no);
		System.out.println("The mark of the student is: "+ s1.mark);
		
	}
}
