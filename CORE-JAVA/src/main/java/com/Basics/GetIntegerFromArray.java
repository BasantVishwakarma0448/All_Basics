package com.Basics;

public class GetIntegerFromArray {

	public static void main(String[] args) {
		int[] d = {10, 20, 30, 40, 50, 86, 689, 79, 979 };
		int e = 5;

		System.out.println(getInt(d, e));

	}

	public static int getInt(int[] a, int b) {
		int c = 0;
		if (b >= a.length) {
			System.out.println("Enter the existing index in array");
			return -1;
		}
		for (int i = 0; i < a.length; i++) {
			if (i == b) {
				c = a[i];

			}
		}
		return c;
	}

}
