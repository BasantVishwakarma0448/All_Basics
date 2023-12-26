package com.Basics;

public class TestFunctionalInter {

	// Functional interface implementation by anonymous function
	public static void main(String[] args) {
		FunctionalInter functionalInter = new FunctionalInter() {

			@Override
			public int sum(int a, int b) {
				int c = a + b;
				return c;
			}
		};

		int a = 10;
		int b = 12;

		System.out.println(functionalInter.sum(a, b));
		FunctionalInter.multi(a, b);
		functionalInter.sub(a, b);
	}

}
