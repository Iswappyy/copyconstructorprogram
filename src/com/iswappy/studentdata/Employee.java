package com.iswappy.studentdata;

public class Employee {
	int employee_id;
	String employee_name;
	
	public Employee(int employee_id, String employee_name) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + "]";
	}

}
