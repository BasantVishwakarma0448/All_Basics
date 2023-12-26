package com.Basics;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int a = 153;
		int b = a;
		int sum = 0;
		int z = 0;

		while (a > 0) {
			z = a % 10;
			sum += (z * z * z);
			a = a / 10;
		}

		if (b == sum) {
			System.out.println("Number is Armstrong");
		} else {
			System.out.println("Number is not Armstrong");
		}
	}

}
