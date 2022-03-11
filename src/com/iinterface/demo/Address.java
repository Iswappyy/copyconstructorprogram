package com.iinterface.demo;

public class Address {

	int house_no;
	String near_location;
	int Pin_code;

	public Address() {
		super();
	}

	public Address(int house_no, String near_location, int pin_code) {
		super();
		this.house_no = house_no;
		this.near_location = near_location;
		Pin_code = pin_code;
	}

	@Override
	public String toString() {
		return "Address [house_no=" + house_no +"\r\n"+ ", near_location=" + near_location + "\r\n"+ ", Pin_code=" + Pin_code + "]";
	}

}