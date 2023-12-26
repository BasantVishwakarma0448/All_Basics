package com.String;

import java.util.Arrays;

public class IntegerFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "jawhd73864";
		int[] x = new int[str.length()];
		// int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				x[i] = x[i] + Integer.parseInt(String.valueOf(str.charAt(i)));
				// count++;

			}
		}
		// System.out.println(count);
		System.out.println(Arrays.toString(x));
	}

}
