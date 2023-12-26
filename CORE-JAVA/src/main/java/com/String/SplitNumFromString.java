package com.String;

public class SplitNumFromString {

	public static void main(String[] args) {
		String[] s = { "Basa324nt", "neeraj4y38545" };

		int count = 0;

		for (String str : s) {
			char[] c = str.toCharArray();

			for (int i = 0; i < c.length; i++) {
				if (Character.isDigit(c[i])) {
					count += Integer.parseInt(String.valueOf(c[i]));
				}
			}
			System.out.println(count);
			count = 0;
		}
	}

}
