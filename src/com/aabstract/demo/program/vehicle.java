package com.aabstract.demo.program;

public abstract class vehicle 
{
	
	public abstract void noOfWheel();

}
 class Bus extends vehicle{
	
	public void noOfWheel()
	{
		 System.out.println("The no of wheel is 10");
		
	}
}
 class Auto extends vehicle{
	 public void noOfWheel()
	 {
		 System.out.println("The no of wheel is 3");
		 
	 }
 public static void main(String[] args) {
	Bus b1 = new Bus();
	Auto b2 =  new Auto();
	b1.noOfWheel();
	b2.noOfWheel();

 }
 
 }
 

