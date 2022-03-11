package com.copyconstructor.iswappy;

public class Employee {
	int id ;
	String name;
	Address add;
	
	
	public Employee() {
		super();
	}


	public Employee(int id, String name, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}
	
	public Employee(Employee emp) {
		this.id = emp.id;
		this.name = emp.name;
		
		//Address dummy = new Address();
//		
//		dummy.city = emp.add.city;
//		dummy.country = emp.add.country;
//		dummy.pin = emp.add.pin;
//		
		//this.add = dummy;
		
		this.add = new Address(emp.add.city,emp.add.country,emp.add.pin);
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", add=" + add + "]";
	}
	

}
