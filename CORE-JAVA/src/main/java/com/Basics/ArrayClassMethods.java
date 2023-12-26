package com.Basics;

public class ArrayClassMethods {

	public static void main(String[] args) {
		int[] a = new int[2];

		a[0] = 10;
		a[1] = 20;

		String packageName = a.getClass().getPackageName();
		String className = a.getClass().getName();

		System.out.println(packageName);
		System.out.println(className);

	}

}
