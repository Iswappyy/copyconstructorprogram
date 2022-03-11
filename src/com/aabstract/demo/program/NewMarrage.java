package com.aabstract.demo.program;

public class NewMarrage extends marraige {
     public void marry() {
    	 System.out.println("Mayuri..");
     }
     public static void main(String[] args) {
		marraige m1 = new marraige();
		m1.marry();
		NewMarrage m2 = new NewMarrage();
		m2.marry();
	} 
    
}

