package com.java.example;

public class JavaExample {

	public static void main(String[] args) {
		int number = 5, p = 2;
		long result = 1;
		int i = p;
		while (i != 0) {

			result *= number;
			i--;

		}
		System.out.println("result==>" + result);
		
		
		
		for (;  i!=0; i--) {
			result *= number;
		}
		System.out.println("result==>" + result);
		

	}

}
