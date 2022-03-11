package com.aabstract.demo.program;

public abstract class Student {
 int roll_no;
 String name;
 int mark;
	
	public abstract void studentInfo();
}

class Student2 extends Student{
	
	public Student2(int roll_no, String name, int mark) {
		this.roll_no = roll_no;
		this.name = name;
		this.mark = mark;
	}

	public void studentInfo() {
		System.out.println("The roll_no of student is: "+ roll_no);
		System.out.println("The name of student is: "+ name);
		System.out.println("The mark of student is: "+ mark);
	}
}

class Student3 extends Student{
	public Student3(int roll_no, String name, int mark) {
		this.roll_no = roll_no;
		this.name = name;
		this.mark = mark;
	}
	public void studentInfo() {
		System.out.println("The roll_no of student is: "+ roll_no);
		System.out.println("The name of student is: "+ name);
		System.out.println("The mark of student is: "+ mark);
	}
}
class Test {
	public static void main(String[] args) {
		Student2 s1 = new Student2(100,"Iswappyy",88);
		Student3 s2 = new Student3(200,"Mayuri",93);
		s1.studentInfo();
		s2.studentInfo();
	}
}


