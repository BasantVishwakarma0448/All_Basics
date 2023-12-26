package com.String;

public class SingleAlphbetOccurance {

	public static void main(String[] args) {
		String str = "Basant Vishwakarma";
		String strr = str.toLowerCase();

		int count = 0;
		char c = 'a';

		for (int i = 0; i < strr.length(); i++) {
			if (strr.charAt(i) == c) {
				count++;
			}
		}
		System.out.println(count);
	}

}
