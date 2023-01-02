package com.service;

import java.util.Scanner;

import com.factory1.Insurance;

public class FactoryDesign {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your insurance");
		String str=sc.nextLine();
		
		System1 s=new System1();
		Insurance i=s.getObject(str);
		i.typesOfInsurance();
	}
}
