package com.OOP;

public class TestInterfaceExample {

	public static void main(String[] args) {

		// Approach 1
		InterfaceExampleImpl imp = new InterfaceExampleImpl();

		imp.add(20);
		System.out.println(imp.sub(10, 50));

		// Approach 2

		InterfaceExample inter = new InterfaceExample() {

			@Override
			public int sub(int a, int b) {
				return a - b;
			}

			@Override
			public void add(int a) {
				System.out.println(InterfaceExample.A + a);

			}
		};

		inter.add(20);
		System.out.println(inter.sub(30, 24));
	}

}
