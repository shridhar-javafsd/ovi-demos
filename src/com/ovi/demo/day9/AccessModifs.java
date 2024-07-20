package com.ovi.demo.day9;

public class AccessModifs {

	public static int num1 = 10;
	protected static int num2 = 20;
	static int num3 = 30; // default / package-default
	private static int num4 = 40;

	public static void main(String[] args) {
		System.out.println(AccessModifs.num1);
		System.out.println(AccessModifs.num2);
		System.out.println(AccessModifs.num3);
		System.out.println(AccessModifs.num4);
	}

}
