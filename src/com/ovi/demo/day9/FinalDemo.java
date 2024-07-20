package com.ovi.demo.day9;

public class FinalDemo {

	int variableName = 22; // variableName VariableName variable-name variable_name

	static int num1 = 10;
	final static int NUM2 = 20;
//	int num5 = 50; //non static field 

	public static void main(String[] args) {
		int num3 = 30;
		final int NUM4 = 40;

		System.out.println(num1);
		System.out.println(NUM2);
		System.out.println(num3);
		System.out.println(NUM4);

		num1 = 11;
//		NUM2  = 22; // CE - final field 
		num3 = 33;
//		NUM4 = 44; // CE - final field  

		System.out.println(num1);
		System.out.println(NUM2);
		System.out.println(num3);
		System.out.println(NUM4);

	}

}
