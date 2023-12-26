package com.Exception;

public class CustomExceptionEx {

	public static void main(String[] args) throws LoginExceptionEx {
		String user = null;
		// String user = "Basant";

		if (user == null) {
			throw new LoginExceptionEx();
		} else {
			System.out.println(user);
		}

	}

}
