package com.Exception;

public class ArrayIndexOutOfBoundEx {
	public static void main(String[] args) {
		int[] a = { 10, 20 };

		try {
			System.out.println(a[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}
