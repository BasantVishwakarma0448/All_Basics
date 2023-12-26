package com.Basics;

public class Factorial {

	public static void main(String[] args) {
		int fact = 1;
		int a = 5;

		for (int i = a; i > 0; i--) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

}
