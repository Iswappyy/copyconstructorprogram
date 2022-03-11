package com.iinterface.demo;

public class Student {
	int roll_no;
	String name;
	String branch;
	Address address;

	public Student() {

	}

	public Student(int roll_no, String name, String branch, Address address) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.branch = branch;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", branch=" + branch + ", address=" + address + "]";
	}
}

