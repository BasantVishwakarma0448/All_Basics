package com.Exception;

public class SystemExitEx {

	public static void main(String[] args) {
		try {
			int k = 10 / 0;

			System.out.println(k);
			
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException...........");
			System.exit(0);
		} finally {
			System.out.println("This is finally...................");
		}
	}

}
