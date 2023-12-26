package com.String;

public class SamePlaceReverse {

	public static void main(String[] args) {
		String str = "My name is khaan im from delhi";
		String[] nstr = str.split(" ");

		for (int i = 0; i < nstr.length; i++) {
			for (int j = nstr[i].length() - 1; j >=0; j--) {
				System.out.print(nstr[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

}
