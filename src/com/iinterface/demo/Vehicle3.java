package com.iinterface.demo;

 abstract class A{
	abstract void companyVehic(String name);
	}
	 public interface Vehicle3 {
		 void gearNo(int gear);
	}
	 interface B{
		  void noWheel(int wheel);
	}

	class Bus extends A implements B,Vehicle3{
		public void gearNo(int gear) {
			System.out.println("The no of gear of Bus is: "+ gear);
		}

		@Override
		public void noWheel(int wheel) {
			System.out.println("No of wheel: "+wheel);
				
		}
		void companyVehic(String name)
		{System.out.println("The name of the company of the vehicle: "+name);}
		
		
	}
	class Auto extends A implements B,Vehicle3{
		public void gearNo(int gear) {
			System.out.println("The no of gear of Auto is: "+ gear);
		}
		public void noWheel(int wheel) {
			System.out.println("No of wheel: "+wheel);
				
		}
		void companyVehic(String name)
		{System.out.println("The name of the company of the vehicle: "+name);}
	}
	class Transportation{
		public static void main(String[] args) {
			
			Bus obj1 = new Bus();
			Auto obj2 = new Auto();
			obj1.companyVehic("Bharat Benz");
			obj1.gearNo(6);
			obj1.noWheel(10);
			obj2.companyVehic("PIAGGIO");
			obj2.gearNo(4);
			obj2.noWheel(4);
		}
		
	}

