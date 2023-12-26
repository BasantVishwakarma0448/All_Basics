package com.OOP;

public class TestAbstractExample {

	public static void main(String[] args) {
		AbstractExample ab = new AbstractExample() {

			@Override
			public int sum(int a, int b) {
				int c = a + b;
				return c;
			}
		};

		int d = ab.a = 10;

		int e = ab.sum(d, 20);
		System.out.println(e);
	}

}
