package com.iswappy.studentdata;

public class InstanceOf {
	public static void main(String[] args) {

		Student s1 = new Student(100, "Swapnil");
		Student s2 = new Student(200, "Akshay");
		Student s3 = new Student(300, "Ajay");

		Employee e1 = new Employee(11011, "Salman");
		Employee e2 = new Employee(11012, "Shahrukh");
		Employee e3 = new Employee(11013, "Aamir");
		
		System.out.println("The required information is...");

		Object[] obj = { s1, s2, s3, e1, e2, e3 };

		for (Object o : obj) {

			if (o instanceof Student) {
				System.out.println(o);
			}
		}
	}
}