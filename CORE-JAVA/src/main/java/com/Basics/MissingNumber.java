package com.Basics;

public class MissingNumber {

	public static void main(String[] args) {
		int[] a = { 10, 29, 48, 57, 68, 97 };
		int[] b = { 10, 29, 57, 68, 97 };
		int asum = 0;
		int bsum = 0;

		for (int i = 0; i < a.length; i++) {
			asum = asum + a[i];
		}
		for (int j = 0; j < b.length; j++) {
			bsum = bsum + b[j];
		}

		System.out.println("Missing number is " + (asum - bsum));
	}

}
