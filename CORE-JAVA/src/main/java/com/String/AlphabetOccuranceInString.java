package com.String;

public class AlphabetOccuranceInString {

	public static void main(String[] args) {
		String str = "BasantVishwakarma";
		 String strr = str.toLowerCase();

		// System.out.println(strr);

		int count = 0;

		// loop started from 0 for getting capital characters too

		for (char a = 'a'; a <= 'z'; a++) {
			for (int i = 0; i < strr.length(); i++) {
				if (a == strr.charAt(i)) {
					count++;
				}
			}
			if (count != 0) {
				System.out.println(a);
			}
			count = 0;
		}
	}

}
