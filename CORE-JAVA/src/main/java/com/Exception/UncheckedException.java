package com.Exception;

public class UncheckedException {

	public static void main(String[] args) {
		dad();
	}

	private static void dad() {
		mom();
	}

	private static void mom() {
		son();

	}

	private static void son() {
		throw new RuntimeException("Throw by its own son");
	}

}
