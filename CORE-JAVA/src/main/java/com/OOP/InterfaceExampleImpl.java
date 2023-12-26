package com.OOP;

public class InterfaceExampleImpl implements InterfaceExample {

	@Override
	public void add(int a) {
		System.out.println(InterfaceExample.A + a);

	}

	@Override
	public int sub(int a, int b) {

		return a + b;
	}

}
