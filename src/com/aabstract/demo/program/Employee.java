package com.aabstract.demo.program;

public abstract class Employee {
	int id;
	String name;
	double salary;
    
	public Employee(int id,String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public abstract void EmployeeInfo();
}

class EmployeeAddress1 extends Employee{
	
	String address;
    	
	public EmployeeAddress1(int id,String name, double salary,String address) {
		super(id,name,salary);
		this.address = address;
		
	}
	public void EmployeeInfo() {
		System.out.println("The id of Elployee is: "+ id);
		System.out.println("The name of Elployee is: "+ name);
		System.out.println("The salary of Elployee is: "+ salary);
		System.out.println("The address of Elployee is: "+ address);
		
}
}
class EmployeeAddress2 extends Employee{
	String address;
	public EmployeeAddress2(int id,String name, double salary,String address) {
		super(id,name,salary);
		this.address = address;
	}
	public void EmployeeInfo() {
		System.out.println("The id of Elployee is: "+ id);
		System.out.println("The name of Elployee is: "+ name);
		System.out.println("The salary of Elployee is: "+ salary);
		System.out.println("The address of Elployee is: "+ address);
	}
}
class Test2{
	public static void main(String[] args) {
		EmployeeAddress1 obj1 = new EmployeeAddress1(100,"Rahul",12203.976,"Pune");
		EmployeeAddress2 obj2 = new EmployeeAddress2(200,"Swapnil",23456.987,"New York");
		obj1.EmployeeInfo();
		obj2.EmployeeInfo();
	}
}