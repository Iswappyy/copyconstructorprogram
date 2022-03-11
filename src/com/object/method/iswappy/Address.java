package com.object.method.iswappy;

public class Address {
     String city;
     String country;
     int pin_code;
     
     
	public Address() {
		super();
	}


	public Address(String city, String country, int pin_code) {
		super();
		this.city = city;
		this.country = country;
		this.pin_code = pin_code;
	}


	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", pin_code=" + pin_code + "]";
	}
	
	public static void main(String[] args) {
		Address a1 = new Address();
		
		a1.city = "Pune";
		a1.country = "India";
		a1.pin_code = 444201;
	}
     
     
}
