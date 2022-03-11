package com.aabstract.demo.program;

public abstract class Vehicle2 
{
	abstract void vehicleInfo();
}
//class Bus2 extends Vehicle2{

	//@Override
	//void vehicleInfo() {
		//System.out.println("The bus method get called: ");
	//}
	
//}
class Test5{
	public static void main(String[] args) {
		Vehicle2 obj1 = new Vehicle2() {

			@Override
		void vehicleInfo() {
				System.out.println("The bus method get called:Annonomous class ");
			}
			
		};
		obj1.vehicleInfo();
	}
}
