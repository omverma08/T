package com.basic;

public class Calculator {

	static int num; // Decalre Global variable

	static int num1 = 10; // Intialization
	
	int result;
	
	
	 int addition(int num3, int num4) {
		
		result= num3+num4;
		
		return result;
	
	 }
	
	
	
	int subtraction(int num3, int num4) {
		
		result= num3-num4;	
		return result;
	}
	
	

	
	// num1=5; //Re-Assign

	public static void main(String[] args) {

	  Calculator cal = new Calculator();
		
		
	   int addition= cal.addition(10, 20);
	   
	   int subtraction = cal.subtraction(30, 10);
			
		System.out.println(addition);
		System.out.println(subtraction);

	}

}
