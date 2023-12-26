package com.String;

public class Test {

	public static void main(String[] args) {
		String str = "ABC1234XYZ685";

		int[] x = new int[str.length()];

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				x[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
			}

		}

		for (int j : x) {
			if (j > 0) {
				System.out.println(j);
			}
		}

	}

}
