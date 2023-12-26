package com.Basics;

public class TestSumFunctionInter {

	// Functional Interface by lambda expression
	public static void main(String[] args) {
		SumFunctionInter sum = (a, b) -> {
			int c = 0;
			c = a + b;

			return c;
		};

		System.out.println(sum.sum(10, 24));
	}

}
