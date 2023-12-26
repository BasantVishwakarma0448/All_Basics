package com.Basics;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = { 10, 30, 47, 58, 92, 46, 20, 48, 596, 968, 2732, 896, 5474 };

		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
			System.out.println(a[i]);
		}

	}

}
