package com.java.demo.program;

public class IntroEclipse {
	int stud_id;
	String name;
	String address;
	
	public IntroEclipse(int stud_id, String name, String address) {
		super();
		this.stud_id = stud_id;
		this.name = name;
		this.address = address;
	}

	public static void main(String[] args) {
		
		IntroEclipse e1 = new IntroEclipse(100,"Rahul","Pune");
		
		System.out.println("The Student id is: "+ e1.stud_id);
		System.out.println("The name of student is: "+ e1.name);
		System.out.println("The address of student is: "+ e1.address);
		
		
	}

}
