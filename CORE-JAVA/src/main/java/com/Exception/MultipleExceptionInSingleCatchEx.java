package com.Exception;

public class MultipleExceptionInSingleCatchEx {

	public static void main(String[] args) {
		String s = null;

		try {
			System.out.println(s.charAt(4));
		} catch (StringIndexOutOfBoundsException | NullPointerException n) {
			n.printStackTrace();
		}
	}

}
