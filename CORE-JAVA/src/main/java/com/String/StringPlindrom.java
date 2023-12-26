package com.String;

public class StringPlindrom {

	public static void main(String[] args) {
		String str = "madam";

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);

		if (str.matches(rev)) {
			System.out.println("String is palindrom");
		} else {
			System.out.println("String is not palindrom");
		}
	}

}
