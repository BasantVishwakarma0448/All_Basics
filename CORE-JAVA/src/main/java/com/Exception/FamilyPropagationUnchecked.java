package com.Exception;

public class FamilyPropagationUnchecked {

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
		throw new RuntimeException("I forced to raise Exception");

	}

}
