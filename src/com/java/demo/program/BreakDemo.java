package com.java.demo.program;

public class BreakDemo {
	public static void main(String[] args) {
		first:
		for(int i=0 ; i<= 5 ; i++) {
			
			for(int j=0 ; j<= 10; j++) {
				
				if( i==3 ) {
					break first;
					
				}
				System.out.println(i+"..."+j);
			}
			
		}
	}

}
