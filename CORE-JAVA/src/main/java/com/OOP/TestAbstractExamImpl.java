package com.OOP;

public class TestAbstractExamImpl extends AbstractExample {
	@Override
	public int sum(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		TestAbstractExamImpl ta = new TestAbstractExamImpl();

		System.out.println(ta.sum(10, 80));
	}
}
