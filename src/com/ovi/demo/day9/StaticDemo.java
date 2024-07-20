package com.ovi.demo.day9;

public class StaticDemo {

	static int num3 = 30;
	int num4 = 40;

	public static void main(String[] args) {
		int num = 10; // local field / local variable
		System.out.println(num);
//		System.out.println(num2); // CE 
		System.out.println(StaticDemo.num3);
//		System.out.println(StaticDemo.num4); // CE
		StaticDemo.m1();
//		StaticDemo.m2(); // CE
	}

	static void m1() {
		int num2 = 20; // local field / local variable
//		System.out.println(num);// CE 
		System.out.println(num2);
		System.out.println(StaticDemo.num3);
//		System.out.println(StaticDemo.num4); // CE 
	}

	void m2() {
		int num5 = 50; // local field / local variable
		System.out.println(num5);
		System.out.println(StaticDemo.num3);
		System.out.println(num4); // CE 
	}
}
