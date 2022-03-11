package com.Enum.iswappyy;

public class EnumEx1 {
	enum month{JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER}

public static void main(String[] args) {
	//for(month month : month.values()) {
	    System.out.println("1) The name in string from: "+month.values());
		System.out.println("2) The index of month october is :"+month.OCTOBER.ordinal());
		System.out.println("3) The convertion to toString is :"+month.SEPTEMBER.toString());
		System.out.println("4) The return constant value of is: : "+month.valueOf("AUGUST"));	
		System.out.println("5) The name in string from: "+month.JANUARY.name());
		System.out.println("6) The comparison of two enum values: "+month.JANUARY.compareTo(month.NOVEMBER));
	}
}

