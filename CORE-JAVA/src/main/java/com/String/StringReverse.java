package com.String;

public class StringReverse {

	public static void main(String[] args) {
		String str = "Basant vishwakarma";
		String rstr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rstr = rstr + str.charAt(i);

		}
		System.out.println(rstr);
	}

}
