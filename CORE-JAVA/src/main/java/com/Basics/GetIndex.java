package com.Basics;

public class GetIndex {

	public static void main(String[] args) {
		int[] d = { 10, 20, 30, 40, 60 };
		int e = 68;

		System.out.println(getInt(d, e));
	}

	public static int getInt(int[] a, int b) {
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			if (b == a[i]) {
				c = i;
			}
		}
		if (c < 0) {
			return -1;
		} else {
			return c;
		}
	}

}
