package com.String;

import java.util.Arrays;

public class SplitIntberFromString {

	public static void main(String[] args) {
		String str = "Bas24532634ant27721424";

		char[] s = str.toCharArray();

		String strr = "";
		String it = "";

		for (int i = 0; i < s.length; i++) {
			if (!Character.isDigit(s[i])) {
				strr = strr + s[i];
			} else {
				it = it + s[i];
			}
		}

		char[] x = strr.toCharArray();
		char[] y = it.toCharArray();
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
	}

}
