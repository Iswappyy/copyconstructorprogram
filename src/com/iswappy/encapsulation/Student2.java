package com.iswappy.encapsulation;

public class Student2 {
	private int roll_no;
    private String name;
    private String coll_name;
    
    public int getRoll_no(int rollNum) { 
    	return rollNum;
    }
    public String getName(String name) {
    	return name;
    }
    public String getColl_name(String collName) {
    	return collName;
    }
    
    public void setRoll_no(int roll_no) {
    	this.roll_no = roll_no;
    }
    public void setName(String name) {
    	this.name = name;
    }
    public void setColl_name(String coll_name) {
    	this.coll_name =coll_name; 			
    }
}
class College{
	public static void main(String[] args) {
		Student2 obj1 = new Student2();
		//obj1.setRoll_no(44);
		
		System.out.println("The roll number of Student is: "+ obj1.getRoll_no(44));
		System.out.println("The Name of Student is: "+ obj1.getName("Swapnil"));
		System.out.println("The college name of Student is: "+ obj1.getColl_name("VJTI Mumbai"));
		
		
	}
}

