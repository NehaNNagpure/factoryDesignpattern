package com.service;

import java.util.Scanner;

import com.factory.Booking;

public class FactoryDesing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input");
		String str=sc.nextLine();
		
		System1 s=new System1();
		Booking b=s.getObject(str);
		b.bookTicket();
	}
		
}
