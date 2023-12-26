package com.String;

public class LatterCount {

	public static void main(String[] args) {
		String s = "My Name iis Khaaaan";

		int i = 0;

		for (int j = 0; j < s.length(); j++) {
			char c = s.charAt(j);

			String k = String.valueOf(c);
			if (k.matches("m")) {
				i++;
			}
		}
		System.out.println(i);
	}

}
