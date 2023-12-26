package com.String;

public class TestMethods {

	public static void main(String[] args) {
		String str = "Basant Vishwakarma";

		System.out.println(str.lastIndexOf('w'));
		System.err.println(str.lastIndexOf('m'));

		// for replacing characters into the string
		System.out.println(str.replace('a', 'c'));

		// for replacing string into the string
		System.out.println(str.replaceAll("as", "6566"));

		// for getting the code of the character
		System.out.println(str.codePointAt(5));

		// adding the word in to the old string
		System.out.println(str.concat(" prme"));

		StringBuffer sb = new StringBuffer("Basant vishwakarma");

		// for deleting characters into the string
		// System.out.println(sb.delete(3, 7));

		// for getting capacity of the string
		System.out.println(sb.capacity());

		System.out.println(sb.hashCode());

		System.out.println(sb.isEmpty());

		System.out.println(sb.substring(5, 11));

		// System.out.println(sb.append('b'));

		System.out.println(sb.reverse());
	}

}
