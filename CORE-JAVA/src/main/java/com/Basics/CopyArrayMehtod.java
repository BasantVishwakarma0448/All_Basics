package com.Basics;

import java.util.Arrays;

public class CopyArrayMehtod {

	public static void main(String[] args) {
		String[] a = { "Basant", "Ram", "Shyam", "Sita", "Radha" };
		String[] b = new String[8];

		System.arraycopy(a, 0, b, 0, 5);

		System.out.println(Arrays.toString(b));
	}

}
