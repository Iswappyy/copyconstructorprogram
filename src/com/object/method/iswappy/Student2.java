package com.object.method.iswappy;


	public class Student2 implements Cloneable  {
	     int roll;
	     String name;
	     Address address;
	     
	     
		public Student2() {
			super();
		}


		public Student2(int roll, String name, Address address) {
			super();
			this.roll = roll;
			this.name = name;
			this.address = address;
		}


		@Override
		public String toString() {
			return "Student2 [roll=" + roll + ", name=" + name + ", address=" + address + "]";
		}
	     
		public static void main(String[] args) throws CloneNotSupportedException {
			
			Address a1 = new Address();
			
			a1.city = "Pune";
			a1.country = "India";
			a1.pin_code = 444201;
			
			
			Student2 obj1 = new Student2();
			
			obj1.roll = 786;
			obj1.name = "Swapnil";
			obj1.address = a1;
			
			System.out.println("Before clonning values of student roll no is: "+ obj1.roll);
			System.out.println("Before clonning values of student name is: "+ obj1.name);
			System.out.println("Before clonning address of student is: "+ a1);
			
			System.out.println("************************************************************");
			
			Student2 obj2 = (Student2) obj1.clone();
			
			
			
			obj2.roll = 886;
			obj2.name = "Mayuri";
			obj2.address = a1;
			
			System.out.println("After clonning values of student roll no is: "+ obj2.roll);
			System.out.println("After clonning values of student name is: "+ obj2.name);
			System.out.println("After clonning values of student address is: "+ a1);
		}
		
	    
	     
	     
	}	     
		
