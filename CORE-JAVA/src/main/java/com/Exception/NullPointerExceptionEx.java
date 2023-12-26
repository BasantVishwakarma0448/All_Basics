package com.Exception;

public class NullPointerExceptionEx {

	public static void main(String[] args) {
		String s = null;

		try {
			System.out.println(s.charAt(5));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException..................");
		} catch (NullPointerException n) {
			System.out.println("NullPointerException.........");
			System.out.println(n.getLocalizedMessage());
			System.out.println(n.getMessage());
			System.out.println(n.getCause());
			System.out.println(n.getClass());
			n.printStackTrace();
		}
	}

}
