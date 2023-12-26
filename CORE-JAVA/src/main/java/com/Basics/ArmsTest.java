package com.Basics;

public class ArmsTest {
	// Functional interface implementation by lambda expression

	public static void main(String[] args) {
		ArmsInterface armsInterface = (b) -> {
			int sum = 0;
			int r = 0;
			int a = b;

			while (b > 0) {
				r = b % 10;
				sum += (r * r * r);
				b = b / 10;
			}
			if (sum == a) {
				System.out.println("Number is Armstrong");
			} else {
				System.out.println("Number is not Armstrong");
			}
		};

		armsInterface.arms(153);
	}

}
