package com.String;

public class LastWordOfString {

	public static void main(String[] args) {
		String str = "My name is khaan";

		String rstr = str.toLowerCase();

		// approach 1
		String[] s = rstr.split(" ");
		String a = s[s.length - 1];
		System.out.println(a);

		// approach 2
		int c = str.lastIndexOf(" ");
		for (int i = c; i < rstr.length(); i++) {
			System.out.print(rstr.charAt(i));
		}
	}

}
