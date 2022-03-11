package com.iswappy.studentdata;

public class Student {
	int roll_no;
	String name;
	public Student(int roll_no, String name) {
		super();
		this.roll_no = roll_no;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + "]";
	}

}

