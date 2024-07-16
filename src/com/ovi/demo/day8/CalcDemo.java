package com.ovi.demo.day8;

public class CalcDemo {

	static void addNumsAndPrint(int i, int j) {
		System.out.println("addNumsAndPrint");
		System.out.println(i + j);

	}

	static int addNumsAndReturn(int i, int j) {
		System.out.println("addNumsAndReturn");
		return i + j;
	}

	static double piValue() {
		return 3.142;
	}

	public static void main(String[] args) {
		System.out.println("Start");
//		int num2 = addNumsAndPrint(10, 20); // CE 
		addNumsAndPrint(10, 20);
		int sum = addNumsAndReturn(15, 25);
		System.out.println(sum);
		System.out.println("End");
	}
}

// with args with return value - take this glass and get me water in it 
// with args no return value - take this glass and wash it 
// no args with return value - give me a glass of water 
// no args no return value - take glass from shelf and wash it 

// arg = money to spend, return value = the commodities you bring home 

//with args with return value - shopping 
//with args no return value - dine in resto  
//no args with return value - gift  
//no args no return value -  



// create a method that accepts userName and returns a greeting message with the username. 
//Also print the message. 



