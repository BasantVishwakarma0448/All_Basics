package com.Exception;

public class FamilyPropagationChecked {

	public static void main(String[] args) throws MistakeException {
		dad();
	}

	private static void dad() {
		try {
			mom();
		} catch (MistakeException e) {
			e.printStackTrace();
		}
	}

	private static void mom() throws MistakeException {
		son();
	}

	private static void son() throws MistakeException {
		MistakeException e = new MistakeException();
		throw e;
	}

}
