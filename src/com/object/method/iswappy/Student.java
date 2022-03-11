package com.object.method.iswappy;

public class Student implements Cloneable  {
     int roll;
     String name;
     String address;
     
     
	public Student() {
		super();
	}


	public Student(int roll, String name, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
     
   public static void main(String[] args) throws CloneNotSupportedException  {
	   Student obj1 = new Student();
	   obj1.roll = 1234;
	   obj1.name = "Swapnil";
	   obj1.address = "Amravati";
	   
	   System.out.println("Before clonning values of student roll no is: "+ obj1.roll);
	   System.out.println("Before clonning values of student name is: "+ obj1.name);
	   System.out.println("Before clonning values of student address is: "+ obj1.address);
	   
	  System.out.println("***********************************************************");
	  
	   Student obj2 = (Student) obj1.clone();
	    
	   obj2.roll = 5678;
	   obj2.name = "Ajay";
	   obj2.address = "Chandur";
	   
	   obj2.roll = 9876;
	   obj2.name = "Bhumesh";
	   
	   System.out.println("After clonning values of student roll no is: "+ obj2.roll);
	   System.out.println("After clonning values of student name is: "+ obj2.name);
	   System.out.println("After clonning values of student address is: "+ obj2.address);
	   
	   
   }
   
}
