package com.java.demo.program;

import java.util.Scanner;

public class BankAtm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the amount: ");
		int amount = sc.nextInt(); 
		withdrawMoney(amount);
	}
	
	public static int withdrawMoney(int amount) {
		if(amount % 100 == 0) {
			System.out.println("Please wait transaction is processing...!");
		}
		else {
			System.out.println("Please enter the amount multiple of 100...!");
		}
		return amount;
	}

}
