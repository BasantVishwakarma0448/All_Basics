package com.Basics;

public class PalindromNumber {

	public static void main(String[] args) {
		int a = 4445;

		int b = a;
		int sum = 0;
		int rev = 0;

		while (a > 0) {
			rev = a % 10;
			sum = sum * 10 + rev;
			a = a / 10;
		}
		if (b == sum) {
			System.out.println("Number is palindrom");
		} else {
			System.out.println("Number is not palindrom");
		}
	}

	static {
		System.out.println("This is static block......");
	}

}
