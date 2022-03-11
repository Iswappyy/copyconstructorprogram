package com.copyconstructor.iswappy;

public class TestEmployee {
	public static void main(String[] args) {
		Address a1 = new Address("Amravati","India",111);
		Employee e1 = new Employee(456,"Swapnil",a1);
		System.out.println("Before change value e1: "+ e1);
		
		Employee e2 = new Employee(e1);
		System.out.println(e2);
		
		e1.add.city = "Pune";
		e1.add.pin = 222;
		System.out.println("After change value e1: "+ e1);
	}

}
