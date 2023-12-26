package com.Exception;

public class ArithmeticExcept {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;

		try {
			int k = i / j;
			System.out.println(k);
		} catch (ArithmeticException e) {
			System.out.println(e);
			//System.out.println("ArithmeticException...........");
		} finally {
			System.out.println("This is finally");
		}
	}

}
