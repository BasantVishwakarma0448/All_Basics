package com.String;

public class Vowel_Consonents {

	public static void main(String[] args) {
		String str = "Basant Vishwakarma";
		String rstr = str.toLowerCase();
		int x = 0;
		int y = 0;

		for (int i = 0; i < rstr.length(); i++) {
			if (rstr.charAt(i) == 'a' || rstr.charAt(i) == 'e' || rstr.charAt(i) == 'i' || rstr.charAt(i) == 'o'
					|| rstr.charAt(i) == 'u') {
				x++;
			} else if (rstr.charAt(i) >= 'a' && rstr.charAt(i) <= 'z') {
				y++;
			}
		}
		System.out.println("Vowels " + x);
		System.out.println("Consonents " + y);
	}

}
