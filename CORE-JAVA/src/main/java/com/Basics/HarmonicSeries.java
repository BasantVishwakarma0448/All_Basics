package com.Basics;

public class HarmonicSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		double result = 0;
		// Approach 1
		while (a > 0) {
			result = result + (double) 1 / a;
			a--;
			System.out.println(result);
		}

		// Approach 2
		for (int i = a; i > 0; i--) {
			result = result + (double) 1 / i;

			System.out.println(result);
		}
	}

}
