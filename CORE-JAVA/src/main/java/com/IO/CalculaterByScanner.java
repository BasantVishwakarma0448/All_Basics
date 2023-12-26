package com.IO;

import java.util.Scanner;

public class CalculaterByScanner {

	public static void main(String[] args) {
		String operator = null;
		double result = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of a = ");
		double a = sc.nextDouble();
		System.out.println("Enter the value of b = ");
		double b = sc.nextDouble();

		System.out.println("Operation ?? ");
		operator = sc.next();

		switch (operator) {
		case "+": {

			result = a + b;
			System.out.println("Result = " + result);
			break;
		}
		case "-": {
			result = a - b;
			System.out.println("Result = " + result);
			break;
		}
		case "*": {
			result = a * b;
			System.out.println("Result = " + result);
			break;
		}
		case "/": {
			result = a / b;
			System.out.println("Result = " + result);
			break;
		}

		default:
			System.out.println("Something want wrong");
		}
	}

}
