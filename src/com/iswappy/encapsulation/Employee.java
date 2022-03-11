package com.iswappy.encapsulation;

public class Employee {
	private int employee_id;
	private String employee_name;
	private double employee_salary;

	public int getEmployee_id(int employee_id) {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name(String employee_name) {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public double getEmployee_salary(double employee_salary) {
		return employee_salary;
	}

	public void setEployee_salary(double employee_salary) {
		this.employee_salary = employee_salary;
	}
}

class Test {
	public static void main(String[] args) {
		Employee e1 = new Employee();

		System.out.println("The Employee ID is: " + e1.getEmployee_id(200));

		System.out.println("The Employee name is: " + e1.getEmployee_name("Swapnil"));

		System.out.println("The Employee salary is: " + e1.getEmployee_salary(213321.33));

	}
}
