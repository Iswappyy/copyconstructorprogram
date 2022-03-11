package com.Enum.iswappyy;

enum Days{MONDAY,TUESDAY,WEDNESDAY,THIRSDAY,FRIDAY,SATURDAY,SUNDAY}

public class EnumEx2 {
	
	public static void main(String[] args) {
		Days days = Days.MONDAY;
		
	switch(days) {
	case MONDAY:
		System.out.println("Today is monday");
	break;
	
	case FRIDAY :
		System.out.println("Today is Friday");
		break;
		
	default:
		System.out.println("Invalid entry..!");
	
	}
	 
	for( Days day : Days.values()) {
		System.out.println(day);
	}

}
}