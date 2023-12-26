package com.Exception;

public class CheckedEx {

	public static void main(String[] args) {
		dad();
	}

	public static void dad() {
		try {
			mom();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void mom() throws Exception {
		son();
	}

	private static void son() throws Exception {
		Exception r = new Exception();
		throw r;
	}

}
